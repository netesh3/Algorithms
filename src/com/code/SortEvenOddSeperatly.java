package com.code;

import java.util.Arrays;

public class SortEvenOddSeperatly {
    public static void main(String[] args) {
        int res[]= new int[]{0,1,2,4};
        Arrays.stream(sortArrayByParity(res)).forEach(val-> System.out.print(val+" "));
    }
    public static int[] sortArrayByParity(int[] A) {
        int i=0;
        int j=A.length-1;
        while(i<j){
            if(A[i]%2!=0 && A[j]%2==0){
                int temp = A[i];
                A[i]=A[j];
                A[j]=temp;
                i++;
                j--;
            }else if(i<A.length && A[i]%2==0){
                i++;
            }else if(j>=1 && A[j]%2!=0){
                j--;
            }
        }
        Arrays.sort(A,0,i);
        Arrays.sort(A,i+1,A.length);
        return A;
    }
}
