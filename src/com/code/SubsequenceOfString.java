package com.code;

import java.util.Scanner;

public class SubsequenceOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String res[] = findSubsequence(str);
        System.out.println("Total subseqence generated:- "+res.length);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }

    private static String[] findSubsequence(String str) {
        if(str.length()==0){
            return new String[]{""};
        }
        String smallAns[] = findSubsequence(str.substring(1));
        String ans[] = new String[2*smallAns.length];
        int k=0;
        for (k=0;k<smallAns.length;k++){
            ans[k]=smallAns[k];
        }
        for (int i=0;i<smallAns.length;i++){
            ans[k]=str.charAt(0)+smallAns[i];
            k++;
        }
        return ans;
    }
}
