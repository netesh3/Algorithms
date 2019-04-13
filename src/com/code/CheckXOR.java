package com.code;

public class CheckXOR {
    public static void main(String[] args) {
        String str1 = "forgeeksgeeks";
        char arr[] = str1.toCharArray();
        int res =0;
        for (int i =0;i<arr.length;i++){
            res^=(int)arr[i];
        }
        System.out.println(res);
        int a=5;
        int b=6;
        System.out.println(Long.bitCount(a)==Long.bitCount(b));
    }
}
