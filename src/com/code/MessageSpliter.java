package com.code;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class MessageSpliter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//      String str="I know how to solve for exactly m odd numbers What's left is to say that, for at most m odd numbers, each starting point";
        String str ="There is no creature on earth half so terrifying as a truly just man!!!!!";
        System.out.println(countMessgaes(str));


    }

    private static int countMessgaes(String str) {
        
        if (str.length() <= 30) {
            return 1;
        }
        int count = 0;
        String[] words = str.split(" ");
        int isTwoDigits = words.length/25;
        String sufix=isTwoDigits>9 ? "(1/99)" :"(1/9)";
        String str1 ="";
        for (int i = 0; i < words.length; i++) {
            str1 =str1+words[i]+sufix;
            if(str1.length()>30){
                count++;
                if (str1.length() - words[i-1].length()>30){
                    i--;
                }
                str1="";
            }
        }
        return count+1;
    }
}
