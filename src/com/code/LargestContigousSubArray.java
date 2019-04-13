package com.code;

public class LargestContigousSubArray {
    public static void main(String[] args) {
        int a[]={-2,-3,-4,-1,-2,-5,-3};
        System.out.println(findSubArray(a));
    }

    private static int findSubArray(int[] a) {
        int max=a[0];
        int currMax=a[0];

        for(int i=1;i<a.length;i++){
            if(max<(currMax+=a[i])){
                max = currMax;
            }
            int max1 = Math.max(currMax,a[i]);
            if(max1>currMax){
                currMax = a[i];
                max = max1;
            }
        }
        return max;
    }
}
