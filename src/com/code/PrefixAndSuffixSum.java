package com.code;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrefixAndSuffixSum {
    static int findMaxSum(int arr[], int n)
    {
        int sum = IntStream.of(arr).sum();
        int prefix_sum = 0,
                res = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++)
        {
            prefix_sum += arr[i];

            if (prefix_sum == sum)
                res = Math.max(res, prefix_sum);
            sum -= arr[i];
        }
        

        return res;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = { 3,8,-2, 5, 3, 1, 2, 2, 6, -4, 2,1 };
        int n = arr.length;
        System.out.print(findMaxSum(arr, n));
    }
}
