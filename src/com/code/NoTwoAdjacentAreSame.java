package com.code;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class NoTwoAdjacentAreSame {

    public static void main(String[] args) {
        String str = "bbbcccabcabcabcaaa";
        String res = makeUniqueAdjecent(str);
        System.out.println(res);
    }

    private static String makeUniqueAdjecent(String str) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.addAndGet(5);
        atomicInteger.addAndGet(50);
        System.out.println(atomicInteger.get());
        Map<Character, Integer> map = new HashMap<>();
        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                Integer value = map.get(arr[i]);
                map.put(arr[i],++value);
            }else{
                map.put(arr[i],1);
            }
        }
        PriorityQueue priorityQueue = new PriorityQueue<Map.Entry<Character,Integer>>((a,b)->{
            return b.getValue()-a.getValue();
        });
        priorityQueue.addAll(map.entrySet());
        String result = "";
        Map.Entry<Character,Integer>  prev=null;
        while (!priorityQueue.isEmpty()){
            Map.Entry<Character,Integer>  curr = (Map.Entry<Character, Integer>) priorityQueue.poll();
            result+= curr.getKey();
            curr.setValue(curr.getValue()-1);
            if(prev !=null && prev.getValue()>=1){
                priorityQueue.add(prev);
            }
            prev=curr;
        }
        return result;
    }
}
