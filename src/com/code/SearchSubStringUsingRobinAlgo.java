package com.code;

public class SearchSubStringUsingRobinAlgo {
    public static void main(String[] args) {
        String pat="abadbade";
        String mat="ade";
        System.out.println(isFound(pat,mat));
    }

    private static boolean isFound(String pat, String mat) {
        int matHash=0;
        int patHash=0;
        int primeNum=3;
        for (int i=0;i<mat.length();i++){
            matHash+=(int)mat.charAt(i)*Math.pow(primeNum,i);
        }
        for (int i=0;i<mat.length();i++){
            patHash+=(int)pat.charAt(i)*Math.pow(primeNum,i);
        }
        if(matHash==patHash){
            if(pat.substring(0,mat.length()).equals(mat)){
                System.out.println(pat.substring(0,mat.length()));
            }
            return true;
        }
        int k=mat.length();
        for (int j=mat.length();j<pat.length();j++){
            if(matHash==patHash){
                if(pat.substring(j-k,j).equals(mat)){
                    System.out.println(pat.substring(j-k,j));
                }
                return true;
            }
            patHash=(patHash-(int)pat.charAt(j-k))/primeNum;
            patHash+=(int)pat.charAt(j)*Math.pow(primeNum,mat.length()-1);
        }
        if(patHash==matHash){
            if(pat.substring(pat.length()-mat.length(),pat.length()).equals(mat)){
                System.out.println(pat.substring(pat.length()-mat.length(),pat.length()));
            }
            return true;
        }
        return false;
    }
}


//The average and best case running time of the Rabin-Karp algorithm is O(n+m), but its worst-case time is O(nm).
