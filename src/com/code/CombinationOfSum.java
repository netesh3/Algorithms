package com.code;

import java.util.Scanner;
import java.util.Stack;

public class CombinationOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        combinationOfSum(1,num,stack);
    }

    private static void combinationOfSum(int i, int num, Stack<Integer> stack) {
        if(num==0){
            printStack(stack);
            System.out.println();
        }
        for(int j=i;j<=num;j++){
            stack.push(j);
            combinationOfSum(j,num-j,stack);
            stack.pop();
        }
    }

    private static void printStack(Stack<Integer> stack) {
        stack.forEach(s-> System.out.print(s));
    }
}
