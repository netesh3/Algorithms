package com.code;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
    public static int reverse(int x) {
        int result=0;
        boolean negative=false;
        if(x<0){
            negative=true;
            x=Math.abs(x);
        }
        int temp=x;
        while(temp>0){
            int m=temp%10;
            if(result>Integer.MAX_VALUE/10 || result>Integer.MAX_VALUE/10 && m>7){
                return 0;
            }
            if(result<Integer.MIN_VALUE/10 || result<Integer.MIN_VALUE/10 && m<-8){
                return 0;
            }
            result=result*10+m;
            temp/=10;
        }
        return negative==true? (-1)*result:result;
    }
}
