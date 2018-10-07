package com.code;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.next();
        String str = "-3.14159";
        System.out.println(parseIntoInteger(str));
    }

    private static int parseIntoInteger(String str) {

        String arr[] = str.trim().split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            long num=0;
            int negative=1;
            try {
                if(arr[i].contains(".")){
                    num=(long)Double.parseDouble(arr[i]);
                }else {
                    num= Long.parseLong(arr[i]);
                }
                if(num<Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }if(num>Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
                if(num<0){
                    negative=-1;
                }
                return negative*(int)Math.abs(num);
            }catch (Exception e) {
                return 0;
            }
        }
        return 0;
    }

}

