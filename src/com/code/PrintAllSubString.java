package com.code;

public class PrintAllSubString {
    static int count;
    public static void main(String[] args) {
        String str = "abcab";
        printAllSubString(str);
        System.out.println(count);
        printAllSubString(str,0,str.length());
        System.out.println(count);
    }

    public static void printAllSubString(String str) {
        if(str.length()<1){
            return;
        }
        System.out.print(str +" , ");
        count++;
        printAllSubString(str.substring(0,str.length()-1));
        printAllSubString(str.substring(1,str.length()));
    }
    public static void printAllSubString(String str,int left,int right) {
        if(str.length()<1){
            return;
        }
        System.out.print(str +" , ");
        count++;
        printAllSubString(str.substring(left,right-1));
        printAllSubString(str.substring(left+1,right));
    }
}
