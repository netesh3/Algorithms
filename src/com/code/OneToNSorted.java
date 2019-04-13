package com.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OneToNSorted {
    public static void main(String[] args) {
        int A[] = {2, 3, 1, 4, 5, 6};
        int A1[] = {2, 3, 1, 4, 5, 6};
        int B[] = {0, 1, 1, 1, 1};
        for (int i=0;i<A.length-1;i++){

            if(B[i]!=0){
                if(A[i]>A[i+1]){
                    int temp = A[i];
                    A[i]=A[i+1];
                    A[i+1]=temp;
                }
            }
        }
        List list1 = Arrays.asList(A);
        List list2 = Arrays.asList(A1);
        System.out.println(list1.equals(list1));
    }
}
