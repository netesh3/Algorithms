package com.code;

import java.util.*;

public class SumOfAllSubArray {
    public static String voteWinner(String[] votes) {
        TreeMap<String,Integer> map = new TreeMap();
        for(var i=0;i<votes.length;i++){
            if(map.containsKey(votes[i])){
                map.put(votes[i],(map.get(votes[i]))+1);
            }else{
                map.put(votes[i],1);
            }
        }
        var max=0;
        TreeSet<String> treeSet = new TreeSet();
        for(var entry : map.entrySet()){
            int val = entry.getValue();
            if(val>max){
                treeSet = new TreeSet();
                treeSet.add(entry.getKey());
                max=val;
            }else if(max==val){
                treeSet.add(entry.getKey());
            }
        }
        TreeSet<String> sortedTreeSet = new TreeSet<>(Collections.reverseOrder());
        sortedTreeSet.addAll(treeSet);
        return sortedTreeSet.pollFirst();
    }
    public static void main(String[] args) {
        var reader = new Scanner(System.in);
        var votesCount = reader.nextInt();
        reader.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        var votes = new String[votesCount];
        for (var i = 0; i < votesCount; i++) {
            var votesItem = reader.nextLine();
            votes[i] = votesItem;
        }
        System.out.println(SumOfAllSubArray.voteWinner(votes));
    }
}
