package com.code;

import java.util.PriorityQueue;

public class MedianInRunningInteger {
    static PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    static PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((a,b)->{
        return b.compareTo(a);
    });

    public static void main(String[] args) {
        int arr[] = {3,2,1,5,6,8,3,2,1,9,3,4};
        findMedian(arr);
    }

    public static void findMedian(int arr[]){
        maxHeap.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]<=maxHeap.peek()){
                maxHeap.add(arr[i]);
            }else if(arr[i]>=minHeap.peek()){
                minHeap.add(arr[i]);
            }
            while (Math.abs(maxHeap.size()-minHeap.size())>1){
                if(maxHeap.size()>minHeap.size()){
                    minHeap.add(maxHeap.poll());
                }else{
                    maxHeap.add(minHeap.poll());
                }
            }
            if(i%2!=0){
                findMedianAnyTime(i);
            }
        }
    }

    public static void findMedianAnyTime(int i){
        if(minHeap.size() == maxHeap.size()){
            System.out.println(" Median at  "+ i + " location is: "+(double) (maxHeap.peek()+minHeap.peek())/2);
        }else if(maxHeap.size()>minHeap.size()){
            System.out.println(" Median at  "+ i + " location is: "+maxHeap.peek());
        }else{
            System.out.println(" Median at  "+ i + " location is: "+minHeap.peek());
        }
    }

}
