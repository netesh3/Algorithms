package com.code;

public class PermutationOfString {
    public static void main(String[] args) {
        String str="abc";
        permutation("",str);
    }

    private static void permutation(String pre, String str) {
        int len =str.length();
        if(len==0){
            System.out.println(pre);
        }else {
            for(int i=0;i<len;i++){
                permutation(pre+str.charAt(i),str.substring(0,i)+str.substring(i+1,len));
            }
        }
    }
}
