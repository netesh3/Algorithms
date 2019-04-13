package com.code.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class TestLeecode2 {
    public static void main(String[] args) {
        int A[]={8,1,5,2,6};
        int B[]={8,1,5,2,6};
        Stream<Integer> sorted = Arrays.stream(A).boxed().sorted(Collections.reverseOrder());
        int ai = 0;
        int bj = 0;
        boolean foundAi=true;
        boolean foundBj=true;
        int i;
        for (i=0;i<A.length;i++){
            if(A[i]==B[0] && foundAi){
                ai=A[i];
                foundAi=false;
                break;
            }

        }
        for(int j=i+1;j<A.length;j++){
            if(A[j]==B[1] && foundBj){
                bj=A[j];
                foundBj=false;
            }
        }
        System.out.println(ai +" == "+bj);
        Arrays.stream(B).forEach(s-> System.out.print(s+" "));
        System.out.println();
        int num = Runtime.getRuntime().availableProcessors();
        System.out.println(num);
    }
}