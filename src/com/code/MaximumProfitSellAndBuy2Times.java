package com.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MaximumProfitSellAndBuy2Times {
    public static void main(String[] args) {
        int arr[]={1,19,98,800,3,30,29,79,80,100,120,10,29,80,90,7000};
        findMaxDeal(arr);
    }
    public static void findMaxDeal(int arr[]){
        Stack<Integer> value = new Stack<>();
        Stack<Integer> min = new Stack<>();
        value.push(arr[0]);
        min.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(value.peek()>arr[i]){
                value.push(arr[i]);
                min.push(arr[i]);
            }else{
                value.push(arr[i]);
                min.push(min.peek());
            }
        }
        System.out.println(value);
        System.out.println(min);
        List<Integer> list = new ArrayList<>();
        int k=0;
        while (!value.isEmpty()){
            list.add(value.peek()-min.peek());
            Integer minPop = min.pop();
            value.pop();
            while (!min.isEmpty() && minPop == min.peek()){
                min.pop();
                value.pop();
            }
        }
        System.out.println(list);
    }
}
