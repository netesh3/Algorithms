package com.code;

import java.util.HashMap;
import java.util.Map;

public class PrintAllCombinationWithConstraintGoogle {
    static int count =0;
    public static void main(String[] args) {
        printAll("",0,0,3);
        System.out.println(count);
    }
    public static void printAll(String str, int b, int c, int n){
        if(b>1 || c>2)
            return;
        if(n==str.length()) {
            System.out.print(str +" ");
            count++;
            return;
        }
        printAll(str+"a",b,c,n);
        printAll(str+"b",b+1,c,n);
        printAll(str+"c",b,c+1,n);
    }
}
