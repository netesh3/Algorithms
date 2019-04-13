package com.code.strings;

public class AllPossibleWithSpace {

    public static void main(String[] args) {
        String str = "ABCD";
        int total = (int)Math.pow(2,str.length()-1);
        pritAllPossible(str,total);
    }

    private static void pritAllPossible(String str, int total) {
        int i = 0;
        while (i<total){
            for (int j=0;j<str.length();j++){
                System.out.print(str.charAt(j));
                if((i&(1<<j))>0){
                    System.out.print(" ");
                }
            }
            System.out.println();
            i++;
        }
    }
}
