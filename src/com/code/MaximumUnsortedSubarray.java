package com.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumUnsortedSubarray {
    public static void main(String[] args) {
        List<Integer> res = Arrays.asList(16, 6, 18, 17, 13, 6, 18, 16, 6, 15, 15, 18, 16, 13, 16, 16, 6, 18, 15, 15);
        int a[] = {1, 1, 10, 10, 15, 10, 15, 10, 10, 15, 10, 15};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(10);
        list.add(10);
        list.add(15);
        list.add(10);
        list.add(15);
        list.add(10);
        list.add(10);
        list.add(15);
        list.add(10);
        list.add(15);
//        3, 3, 4, 5, 5, 9, 11, 13, 14, 15, 15, 16, 15, 20, 16
//        16, 6, 18, 17, 13, 6, 18, 16, 6, 15, 15, 18, 16, 13, 16, 16, 6, 18, 15, 15
//        list.add(16);
//        list.add(6);
//        list.add(18);
//        list.add(17);
//        list.add(13);
//        list.add(6);
//        list.add(18);
//        list.add(16);
//        list.add(6);
//        list.add(15);
//        list.add(15);
//        list.add(18);
//        list.add(16);
//        list.add(13);
//        list.add(16);
//        list.add(16);
//        list.add(6);
//        list.add(18);
//        list.add(15);
//        list.add(15);
//        list.add(1);
//        list.add(3);
//        list.add(2);
//        list.add(4);
//        list.add(5);

//        list.add(4);
//        list.add(15);
//        list.add(4);
//        list.add(4);
//        list.add(15);
//        list.add(18);
//        list.add(20);

//        4, 15, 4, 4, 15, 18, 20
        System.out.println(subUnsort(list));
    }
    public static ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int start = 0;
        int end = 0;
        for(int i=0;i<A.size()-1;i++){
            if(A.get(i)>A.get(i+1)){
                start = i;
                break;
            }
        }
        for(int i=A.size()-1;i>0;i--){
            if(A.get(i)<A.get(i-1)){
                end = i;
                break;
            }
        }
        if(start==end){
            res.add(-1);
            return res;
        }
        int max = A.get(start);
        int min = A.get(start);
        for(int i =start+1;i<=end;i++){
            if(A.get(i)>max){
                max = A.get(i);
            }
            if(A.get(i)<min){
                min = A.get(i);
            }
        }
        int finalstart = 0;
        for(int i=0;i<=start;i++){
            if(A.get(i)>min){
                finalstart=i;
                break;
            }
        }
        int finalend = A.size()-1;
        for(int i=A.size()-1;i>=end;i--){
            if(A.get(i)<max){
                finalend=i;
                break;
            }

        }
        int ms=0, me=0, st=Integer.MAX_VALUE, e=Integer.MAX_VALUE, k=0;
        if(finalstart!=finalend){
            res.add(finalstart);
            res.add(finalend);
        }else{
            res.add(-1);
        }
        return res;
    }
}
