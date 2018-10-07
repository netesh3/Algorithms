package com.code;

import java.util.Scanner;

public class PermutationOfString2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.next();;
        int len=str.length();
        permutation(str,0,len-1);
    }

    private static void permutation(String str, int l, int r) {
        if(l==r){
            System.out.println(str);
        }else{
            for(int i=1;i<=r;i++){
                str=swap(str,l,i);
                permutation(str,l+1,r);
                str=swap(str,l,i);
            }
        }
    }

    private static String swap(String str, int i, int j) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }


}
