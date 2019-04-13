package com.code;

import java.util.*;
import java.util.stream.Collectors;

public class SortNumberBasedOnFrequency {

    public static void main(String[] args) {
        int arr[]={3,7,2,2,3,5,6,5,5,6,7};
        sort(arr);
    }
    public static void sort(int arr[]){

        LinkedHashMap<Integer,Integer> mapArr = new LinkedHashMap<>();
        Arrays.stream(arr).forEach(num->{
            mapArr.compute(num,(k,v)->v==null?1:v+1);
        });

        LinkedHashMap<Integer,Integer> res =
                mapArr.
                entrySet().
                stream().
                sorted((Map.Entry.<Integer, Integer>comparingByValue().reversed())).
                collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(k,v)->k, LinkedHashMap::new));

        res.forEach((k,v)-> System.out.println("key: "+k +"  value: "+v));
    }
}
