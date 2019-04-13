package com.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> rotatedArray = rotateArray(lst,4);
        for (int i=0;i<rotatedArray.size();i++){
            System.out.print(rotatedArray.get(i)+" ");
        }
    }
    public static List<Integer> rotateArray(List<Integer> A, int B) {
        List<Integer> ret = new ArrayList<Integer>();
        if(B>A.size())
            B=B%A.size();
        for (int i = 0; i < A.size(); i++) {
            if(B+i>=A.size())
                ret.add(A.get(i+B-A.size()));
            else
                ret.add(A.get(i + B));
        }

        return ret;
    }
}
