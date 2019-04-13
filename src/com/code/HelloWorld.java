package com.code;

import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(reductionCost(list));
    }
    public static int reductionCost(List<Integer> num) {
        // Write your code here
        PriorityQueue<Integer> priorityQueue = new PriorityQueue(num);
        int sum = priorityQueue.poll();
        int cost = 0;
        while (!priorityQueue.isEmpty()) {
            int currentElement = priorityQueue.poll();
            if (currentElement < sum) {
                priorityQueue.add(sum);
                sum = currentElement;
            } else {
                sum += currentElement;
                cost += sum;
                continue;
            }

            sum += priorityQueue.poll();
            cost += sum;
        }

        return  cost;
    }
    public static String findWinner(String[] votes ) {
        String winner = null;
        Map<String, Integer> nameToCount = new HashMap<>();
        for (String vote : votes) {
            if (nameToCount.containsKey(vote)) {
                nameToCount.put(vote, nameToCount.get(vote) + 1);
            } else {
                nameToCount.put(vote, 1);
            }
        }
        int winnerVoteCount = 0;
        // Optional<Integer>
        // max=nameToCount.values().stream().max(Integer::compareTo);
        // int maxValue=max.orElse(0);
        for (String name : nameToCount.keySet()) {
            if (nameToCount.get(name) > winnerVoteCount) {
                winner = name;
                winnerVoteCount = nameToCount.get(name);
            }
            if (nameToCount.get(name) == winnerVoteCount) {
                if (winner.compareTo(name) < 0) {
                    winner = name;
                }
            }
        }

        return winner;
    }

    static int numberOfAlerts(int precedingMinutes, int alertThreshold, List<Integer> numCallsss) {
        int[] numCalls = numCallsss.stream().mapToInt(i->i).toArray();
        int alerts = 0;
        int sum = 0;
        for (int i = 0; i < precedingMinutes; i++) {
            sum = sum + numCalls[i];
        }
        float avrg = (float) sum / (float) (precedingMinutes);
        if (avrg >= (float) alertThreshold) {
            alerts++;
        }

        for (int i = precedingMinutes; i < numCalls.length; i++) {
            sum = sum + numCalls[i];
            sum = sum - numCalls[i - precedingMinutes];
            if (i >= precedingMinutes) {
                avrg = (float) sum / (float) precedingMinutes;
                if (avrg >= alertThreshold) {
                    alerts++;
                }
            }
        }

        return alerts;

    }
}
