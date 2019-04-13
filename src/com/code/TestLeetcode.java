package com.code;

public class TestLeetcode {
    public static void main(String[] args) {

        boolean res = queryString("110101011011000011011111",15);
        System.out.println(res);
//        boolean res = queryString("1111000101",5);
//        System.out.println(res);
//        boolean res = queryString("0110",3);
//        System.out.println(res);
//        boolean res = queryString("00011010100001110010011010010101000110010010001010",25);
//        System.out.println(res);
    }
    public static boolean queryString(String S, int N) {

        for(int a =1;a<=N;a++){
            boolean flag = false;
            String binary = Integer.toBinaryString(a);
            int len = binary.length();
            String str = "";
            boolean found = true;
            for(int i=0;i<len;i++){
                if(binary.charAt(i) == 48 && found){
                    continue;
                }else{
                    found = false;
                    str+=binary.charAt(i);
                }
            }
            flag=  S.contains(str);
            if(!flag){
                return false;
            }
        }
       return true;
    }
}
