package com.code;

import java.util.Arrays;
import java.util.Scanner;

public class NonrepeatingCharacter {

    static String kUniques(String s, int k) {
        final int[] count = new int[26];
        final char[] input = s.toCharArray();
        int aa = s.charAt(0);
        int currentUniqueCount = 0;
        int maxCount = -1;
        int start = 0;
        int maxStart = 0;

        for(int i=0; i<input.length; i++) {
            int countIndex = input[i] - 'a';

            if (currentUniqueCount == k) {
                if (maxCount < i-start) {
                    maxCount = i-start;
                    maxStart = start;
                }
            }

            while(currentUniqueCount > k && start<i) {
                count[input[start] - 'a']--;
                if (count[input[start] - 'a'] == 0) {
                    currentUniqueCount--;
                }
                start++;
            }

            if (count[countIndex] == 0) {
                currentUniqueCount++;
            }
            count[countIndex]++;
        }

        if (currentUniqueCount == k) {
            if (maxCount < input.length-start) {
                maxCount = input.length-start;
                maxStart = start;
            }
        }

        if (maxCount > 0) {
           return s.substring(maxStart, maxStart + maxCount);
        } else {
            return "";
        }
    }
    public static String SwapII(String s) {
            String result = "";
            int index1 = -1;
            int repeat =0;
            StringBuffer stringBuffer = new StringBuffer();
            for(int i=0; i<s.length(); i++){
                if(!Character.isAlphabetic(s.charAt(i)) && !Character.isDigit(s.charAt(i))){
                    stringBuffer.append(s.charAt(i));
                    repeat = 0;
                    index1 = -1;
                    //i++;
                }else{
                    if(Character.isAlphabetic(s.charAt(i))){
                        stringBuffer.append(s.charAt(i));
                    }if(Character.isDigit(s.charAt(i))){
                        if(repeat < 1){
                            repeat++;
                            index1 = i;
                            stringBuffer.append(s.charAt(i));
                        }else{
                            char temp = s.charAt(index1);
                            stringBuffer.setCharAt(index1 ,s.charAt(i));
                            stringBuffer.append(temp);
                        }
                    }
                }
            }

            for(int i=0; i<stringBuffer.length(); i++){
                Character c = stringBuffer.charAt(i);
                if (Character.isLowerCase(c))
                    stringBuffer.replace(i, i+1, Character.toUpperCase(c)+"");
                else
                    stringBuffer.replace(i, i+1, Character.toLowerCase(c)+"");

            }

            return  stringBuffer.toString();
    }
    public static String PalindromeTwo(String str) {

        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */
        int i=0;
        int j=str.length()-1;
        String s = str.toLowerCase();
        while(i<=j){
            if(!Character.isAlphabetic(s.charAt(i))){
                i++;
            }
            if(!Character.isAlphabetic(s.charAt(j))){
                j--;
            }
            if(Character.isAlphabetic(s.charAt(i)) && Character.isAlphabetic(s.charAt(j))){
                if(s.charAt(i)!=s.charAt(j)){
                    return "false";
                }
                i++;j--;
            }
        }

        return "true";

    }
    public static String KUniqueCharacters(String str) {

        if(str.length()<=1){
            return "";
        }
        String s = str.substring(1,str.length());
        int k = Character.getNumericValue(str.charAt(0));
        final int[] count = new int[26];
        final char[] input = s.toCharArray();
        int currentUniqueCount = 0;
        int maxCount = -1;
        int start = 0;
        int maxStart = 0;

        for(int i=0; i<input.length; i++) {
            int countIndex = input[i] - 'a';

            if (currentUniqueCount == k) {
                if (maxCount < i-start) {
                    maxCount = i-start;
                    maxStart = start;
                }
            }

            while(currentUniqueCount > k && start<i) {
                count[input[start] - 'a']--;
                if (count[input[start] - 'a'] == 0) {
                    currentUniqueCount--;
                }
                start++;
            }

            if (count[countIndex] == 0) {
                currentUniqueCount++;
            }
            count[countIndex]++;
        }

        if (currentUniqueCount == k) {
            if (maxCount < input.length-start) {
                maxCount = input.length-start;
                maxStart = start;
            }
        }

        if (maxCount > 0) {
            return s.substring(maxStart, maxStart + maxCount);
        } else {
            return "";
        }
    }


    public static void main (String[] args) {
        System.out.println(KUniqueCharacters("3aabacbebebe"));
        System.out.println(SwapII("123GG"));
    }
}
