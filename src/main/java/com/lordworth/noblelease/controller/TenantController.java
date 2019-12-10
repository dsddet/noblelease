package com.lordworth.noblelease.controller;

import com.lordworth.noblelease.Service.ApartmentService;
import com.lordworth.noblelease.Service.BuildingService;
import com.lordworth.noblelease.Service.Exceptions.TenantException;
import com.lordworth.noblelease.Service.TenantService;
import com.lordworth.noblelease.Service.Utilities.Utilities;
import com.lordworth.noblelease.domain.Address;
import com.lordworth.noblelease.domain.Apartment;
import com.lordworth.noblelease.domain.Tenant;
import org.hibernate.context.TenantIdentifierMismatchException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
* tenants/buildings
* tenants/land
* tenants/ids
* tenants?propertyname=xyz.. & propertyvalue=xyz..
* tenants/type?id=xyz..
* tenants/address?
* */

@RestController
@RequestMapping("/tenants")
public class TenantController {
    @Autowired
    public TenantService tenantService;
    List<Tenant> tenantList;
    Tenant testTenant;


    public TenantController(){
        testTenant=new Tenant();
        testTenant.setId(1);
        testTenant.setEmail("dedit.dlutwama@gmail.com");
        testTenant.setDateOfBirth(LocalDate.parse("1988-11-30"));
        testTenant.setFirstName("Deusdedit");
        testTenant.setLastName("Lutwama");
        testTenant.setPhoneNumber("641-481-4468");
        testTenant.setGovernmentId("23454h2542");
        testTenant.setEmegencyContactRelationship("Sister");
        testTenant.setEmegencyContact("donahnm@gmail.com");

        tenantList=new LinkedList<Tenant>();
        tenantList.add(testTenant);

    }


    @GetMapping(value = "/id/{id}")
    public Tenant getTenantById(@PathVariable("id") Integer id) throws TenantException{
        Tenant tenant=null;
       try{
            //tenant=tenantService.getTenantById(id);
        }catch (Exception e){
            throw new TenantException("Error: Get tenant by ID: "+e.getMessage());
        }
        return testTenant;
    }

    @GetMapping("/property")
    public Set<Tenant> getTenantsByProperty(@RequestParam("propertyname") String propertyName, @RequestParam("propertyvalue") Object propertyValue) {
        Set<Tenant> answer = null;

        switch (propertyName.toLowerCase()) {
            case "id":
                try {
                    answer = getTenantsByProperty("id", (Integer) propertyValue);

                } catch (Exception e) {

                }
                break;

            case "firstname":
                try {
                    answer = getTenantsByProperty("firstName", (String) propertyValue);

                } catch (Exception e) {

                }
                break;

            case "lastname":
                try {

                    answer = getTenantsByProperty("lastName", (String) propertyValue);
                } catch (Exception e) {

                }
                break;

            case "phonenumber":
                try {

                    answer = getTenantsByProperty("phoneNumber", (Integer) propertyValue);
                } catch (Exception e) {

                }
                break;

            case "governmentid":
                try {

                    answer = getTenantsByProperty("governmentId", (String) propertyValue);
                } catch (Exception e) {

                }
                break;

            case "dateofbirth":
                try {

                    answer = getTenantsByProperty("dateOfBirth", (Date) propertyValue);
                } catch (Exception e) {

                }
                break;


            default:
                throw new IllegalStateException("Unexpected value: " + propertyName.toLowerCase());
        }

        return answer;
    }

    @GetMapping("/type/{id}")
    public Set<Tenant> getTenantsByType(@PathVariable("id") String id) {
        Set<Tenant> answer = null;
        try {
            List<Integer> buildingIds=null; //get buildingsIds by type
            answer = Utilities.toSet(this.getTenantsByBuilding(buildingIds));
        } catch (Exception e) {

        }
        return answer;
    }

    @PostMapping("/buildings")
    public List<Tenant> getTenantsByBuilding(@RequestBody List<Integer> buildingId) throws Exception {
        List<Tenant> answer;
        try {
            List<Integer> apartmentIds=null; //Get from building controller
            List<Integer> tenantIds=null; //Get from apartments controller
            answer = tenantService.getTenantsByIds(tenantIds);
        } catch (Exception e) {
            throw new TenantException("Error: /buildings: " + e.getMessage());
        }
        return answer;
    }

    @PostMapping("/land")
    public List<Tenant> getTenantsByLand(@RequestBody List<Integer> landId) throws Exception {
        List<Tenant> answer;
        try {
            List<Integer> buildingIds=null;// Get from land controller
            answer = this.getTenantsByBuilding(buildingIds); //Controller methods above
        } catch (Exception e) {
            throw new TenantException("Error: /land: " + e.getMessage());
        }
        return answer;

    }

    @PostMapping("/ids")
    public List<Tenant> getTenantsByIds(@RequestBody List<Integer> tenantsids) throws Exception {
        List<Tenant> answer;
        try {
            answer = tenantService.getTenantsByIds(tenantsids);
        } catch (Exception e) {
            throw new TenantException("Error: ids: " + e.getMessage());
        }
        return answer;

    }

    @PostMapping("/address")
    public Set<Tenant> getTenantByAddress(@RequestBody Address address){
        Set<Tenant> answer=null;

        try{
            List<Integer> buildingIds=null;// Get buildingIDs by address.Id
            answer=Utilities.toSet(this.getTenantsByBuilding(buildingIds));
        }
        catch (Exception e){

        }

        return answer;
    }

    @PostMapping("/apartments")
    public Set<Tenant> getTenantsByApartment(@RequestBody List<Integer> apartmentList){
        Set<Tenant> answer=null;
        try{
            List<Integer> tenantList=null;//Get tenantsIds from Apartment controller
            answer=Utilities.toSet(tenantService.getTenantsByIds(tenantList));

        }catch (Exception e){

        }

        return answer;
    }

    @PutMapping("/edit")
    public boolean editTenant(@RequestBody Tenant tenant) throws TenantException{
        boolean answer=false;
        try{
            tenantService.editTenant(tenant);
            answer=true;
        }catch (Exception e){
            throw new TenantException("Error: Edit tenant: "+e.getMessage());
        }
        return answer;
    }

    @PostMapping("/add")
    public boolean addTenant(@RequestBody Tenant tenant) throws TenantException{
        boolean answer=false;
        try{
            tenantService.addTenant(tenant);
            answer=true;
        }
        catch (Exception e){
            throw new TenantException("Error while adding tenant: "+e.getMessage());
        }
        return answer;
    }

    @DeleteMapping("/delete")
    public boolean removeTenant(@RequestParam("id") int id) throws TenantException{
        boolean answer=false;

        try {
            tenantService.removeTenant(id);
            answer=true;
        }
        catch (Exception e){
            throw new TenantException("Error while deleting tenant: "+e.getMessage());
        }
        return answer;
    }
}
