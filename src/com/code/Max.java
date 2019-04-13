package com.code;

import java.util.Arrays;
import java.util.Scanner;

public class Max {

    public static void main(String args[])
    {
        Scanner in=new Scanner (System.in);
        int t,n,k,i,sum1,sum2;
        t=in.nextInt();
        while(--t>=0)
        {
            sum1=0;sum2=0;
            n=in.nextInt();
            k=in.nextInt();
            int a[]=new int[n];
            for(i=0;i<n;i++)
            {
                a[i]=in.nextInt();
            }
            Arrays.sort(a);
            for(i=0;i<n;i++)
            {
                if(i<k)
                    sum1=sum1+a[i];
                else
                    sum2=sum2+a[i];
            }
            int sum3=0,sum4=0;
            for(i=n-1;i>=0;i--)
            {
                if(i>=k)
                    sum3=sum3+a[i];
                else
                    sum4=sum4+a[i];
            }
            System.out.println(Math.max(Math.abs(sum1-sum2),Math.abs(sum3-sum4)));

        }
    }
}
