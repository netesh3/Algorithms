package com.code;

import java.util.Scanner;

public class WildCardMatchingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pat=scanner.next();
        String mat=scanner.next();
        System.out.println(isMatched(pat,mat));
    }

    private static boolean isMatched(String pat, String mat) {
        int patLen=pat.length();
        int matLen=mat.length();
        int[][] dp = new int[matLen+1][patLen+1];
        dp[0][0]=1;
        for(int i=1;i<matLen+1;i++){
            for(int j=1;j<patLen+1;j++){
                if(mat.charAt(i-1)==pat.charAt(j-1) || pat.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }else if(pat.charAt(j-1)=='*'){
                    dp[i][j]=dp[i-1][j]==1?dp[i-1][j]:dp[i][j-1];
                }
            }
        }
        if(dp[matLen][patLen]==1){
            return true;
        }
        return false;
    }
}
