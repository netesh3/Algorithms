package com.code;

import sun.reflect.ReflectionFactory;

import java.io.Externalizable;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestAmazon {
    public static void main(String[] args) {
        int a[][]={
                {1,0,0},
                {1,0,0},
                {1,9,1}
        };
        minimumDistance(a);
        List<List<Integer>> allLocations = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);

        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(3);

        List<Integer> list3 = new ArrayList<>();
        list3.add(2);
        list3.add(7);

        List<Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(8);

        List<Integer> list5 = new ArrayList<>();
        list5.add(7);
        list5.add(9);

        allLocations.add(list);
        allLocations.add(list1);
        allLocations.add(list2);
        allLocations.add(list3);
        allLocations.add(list4);
        allLocations.add(list5);

//
//        List<List<Integer>> result = nearestVegetarianRestaurant(6, allLocations, 3);
//        System.out.println(result);

    }

    static List<List<Integer>> nearestVegetarianRestaurant(int totalRestaurants,
                                                           List<List<Integer>> allLocations,
                                                           int numRestaurants) {
        Queue<List<Integer>> pq = new PriorityQueue<>((a, b) -> {
            int ax = a.get(0);
            int ay = a.get(1);
            long asum = ((long) ax * (long) ax) + ((long) ay * (long) ay);
            Double aloc = Math.sqrt(asum);

            int x = b.get(0);
            int y = b.get(1);
            long bsum = ((long) x * (long) x) + ((long) y * (long) y);
            Double bloc = Math.sqrt(bsum);
            return aloc.compareTo(bloc);
        }
        );
        allLocations.forEach(
                s -> {
                    pq.add(s);
                    if (pq.size() > numRestaurants) pq.poll();
                }
        );
        System.out.println(pq);
        return pq.stream().collect(Collectors.toList());


//        List<List<Integer>>  sortedRes = allLocations.stream().sorted((a,b)->{
//                    int ax = a.get(0);
//                    int ay = a.get(1);
//                    long asum = ((long)ax*(long)ax)+((long)ay*(long)ay);
//                    Double aloc = Math.sqrt(asum);
//
//                    int x = b.get(0);
//                    int y = b.get(1);
//                    long bsum = ((long)x*(long)x)+((long)y*(long)y);
//                    Double bloc = Math.sqrt(bsum);
//
//                    return aloc.compareTo(bloc);
//                    }
//        ).collect(Collectors.toList());
//        return sortedRes.subList(0,numRestaurants);


    }

//    static int minimumDistance(int numRows, int numColumns, List<List<Integer>> area)
//    {
//        // WRITE YOUR CODE HERE
////        int mat[][]= new int[area.size()][area.get(0).size()];
////        for(int i=0;i<area.size();i++){
////            for(int j=0;j<area.get(i).size();j++){
////                mat[i][j]=area.get(i).get(j);
////            }
////        }

    static int minimumDistance(int mat[][]){
        int col=mat[0].length;
        int row=mat.length;

        int minimumCostPath[][] = new int[row+1][col+1];

        for (int i = 1; i <= row; i++) {
            if(mat[0][i]!=0)
                minimumCostPath[i][0] = minimumCostPath[i - 1][0] + mat[i][0];
        }

        for (int j = 1; j <= col; j++) {
            if(mat[0][j]!=0)
                minimumCostPath[0][j] = minimumCostPath[0][j - 1] + mat[0][j];
        }

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {

                if(mat[i][j]==9){
                    return Math.min(Math.min(minimumCostPath[i][j - 1],minimumCostPath[i][j+1]),
                            Math.min(minimumCostPath[i-1][j],minimumCostPath[i+1][j]));
                }
                minimumCostPath[i][j] = mat[i][j]
                        + Math.min(Math.min(minimumCostPath[i][j - 1],minimumCostPath[i][j+1]),
                                        Math.min(minimumCostPath[i-1][j],minimumCostPath[i+1][j]));
            }
        }
        return 0;
    }


}
