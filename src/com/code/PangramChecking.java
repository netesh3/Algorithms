package com.code;

public class PangramChecking {
    public static void main(String[] args) {
        String str ="The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(str));

    }
    public static boolean isPangram(String str){
        long expectedResult = (1<<26)-1;
        long len = str.length();
        long actualResult = 0;
        if(len<=25){
            return false;
        }
        for (int i=0;i<len;i++){
            if(str.charAt(i)>=97 && str.charAt(i)<=123){
                actualResult = actualResult | 1<<(str.charAt(i)-97);
            }
            if(str.charAt(i)>=65 && str.charAt(i)<=91){
                actualResult = actualResult | 1<<(str.charAt(i)-65);
            }
        }
        System.out.println(expectedResult +" "+ actualResult);
        if (expectedResult == actualResult){
            return true;
        }
        return false;
    }
}