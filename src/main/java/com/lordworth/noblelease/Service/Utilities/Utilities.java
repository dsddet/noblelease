package com.lordworth.noblelease.Service.Utilities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Utilities {
    public static <T> Set<T> toSet (List<T> list){
        HashSet<T> set=new HashSet<>();
        for(T member:list){
            set.add(member);
        }
        return set;
    }
}
