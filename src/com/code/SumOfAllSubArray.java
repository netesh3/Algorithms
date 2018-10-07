package com.code;

import java.util.Scanner;

public class SumOfAllSubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        char[] arr = num.toCharArray();
        int result = findSubOfAllSubArray(arr);
        System.out.println("Total Sum of All Sub Array:- "+result);
    }

    private static int findSubOfAllSubArray(char[] arr) {
        int totalSum=0;
        int len = arr.length;
        for(var i=0;i<len;i++){
            int num = Integer.parseInt(String.valueOf(arr[i]));
            totalSum+=num*(len-i)*(i+1);
        }
        return totalSum;
    }
}
