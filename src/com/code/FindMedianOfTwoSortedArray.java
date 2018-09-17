package com.code;

public class FindMedianOfTwoSortedArray { //Same size of array
    public static void main(String[] args) {
        int nums1[]={3,5,7,11,15,19,25};
        int nums2[]={2,9,16,18,25,35,40};
        System.out.println(findMedian(nums1,nums2,0,nums1.length,0,nums2.length));
    }
    public static double findMedian(int[] nums1,int nums2[], int starta,int enda,int startb,int endb){
        if(enda-starta==1 && endb-startb==1){
            return (1.0*((Math.max(nums1[starta],nums2[startb]))+(Math.min(nums1[enda],nums2[endb])))/2);
        }
        int m1 = (enda+starta)/2;
        int m2 = (endb+startb)/2;
        if(nums1[m1]==nums2[m2]){
            return m1;
        }
        if(nums1[m1]<nums2[m2]){
            starta=m1;
            endb = m2;
        }else{
            enda=m1;
            startb=m2;
        }
        return findMedian(nums1,nums2,starta,enda,startb,endb);
    }
}
