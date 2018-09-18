package com.code;

public class FindMedianOfTwoSortedArrayUnEqualSize {
    public static void main(String[] args) {
        int a[]={1,3,8,9,15};
        int b[]={7,11,18,19,21,25,28};//1,3,7,8,9,11,15,16,18,19,21,25,28
        System.out.println(findMedian(a,b,0,a.length,0,b.length));
    }
    public static double findMedian(int[] nums1,int nums2[], int starta,int enda,int startb,int endb){
        int partx= (starta+enda)/2;
        int party= (nums1.length+nums2.length+1)/2-partx;
        int maxLeftx = (partx == 0) ?Integer.MIN_VALUE:nums1[partx-1];
        int minRightx = (partx == nums1.length) ?Integer.MAX_VALUE:nums1[partx];

        int maxLefty = party == 0?Integer.MIN_VALUE:nums2[party-1];
        int minRighty = party == nums2.length ?Integer.MAX_VALUE:nums2[party];

        if(maxLeftx<=minRighty && maxLefty<=minRightx){
            if((nums1.length+nums2.length)%2==0){
                return (1.0*(Math.max(maxLeftx,maxLefty)
                            + Math.min(minRightx,minRighty)))/2;
            }else{
                return Math.max(nums1[partx-1],nums2[party-1]);
            }
        }else if(nums1[partx-1]>nums2[party]){
            enda=partx-1;
        }else{
            starta=partx+1;
        }
        return findMedian(nums1,nums2,starta,enda,startb,endb);
    }
}
