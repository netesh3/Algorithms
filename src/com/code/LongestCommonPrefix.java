package com.code;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String strs[]={"aa","a"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        String result="";
        String pro=strs[0];
        boolean flag=false;
        int j=0;
        while(j<pro.length()){
            char match=pro.charAt(j);
            for(int i=1;i<strs.length;i++){
                pro=strs[i];
                if(pro.length()<=j){
                    break;
                }
                if(match!=pro.charAt(j)){
                    flag=true;
                    break;
                }
                if(i==strs.length-1){
                    result+=match;
                }
            }
            j++;
            pro=strs[0];
            if(flag){
                break;
            }
        }
        return result;
    }
}
