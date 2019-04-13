package com.code;

public class IntegerCacheConcept {
    public static void main(String[] args) {
        Integer a=1000;
        Integer b=1000;
//      Integer c = new Integer(100);
        Integer d = 1000;
        System.out.println(a==b);
        System.out.println(b==b);
        System.out.println(b==d);
    }
}
