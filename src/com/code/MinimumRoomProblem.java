package com.code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MinimumRoomProblem {

    public static void main(String[] args) {
        Interval interval1 = new Interval(0,30);
        Interval interval2 = new Interval(15, 16);
        Interval interval3 = new Interval(15, 20);
        Interval interval4 = new Interval(10, 14);
        Interval interval5 = new Interval(13, 19);
        Interval[] intervals = new Interval[]{interval1, interval2, interval3, interval4, interval5};
        System.out.println(minMeetingRooms(intervals));
    }

    public static int minMeetingRooms(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) return 0;

        Arrays.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval ia, Interval ib) {
                return ia.start - ib.start;
            }
        });

        PriorityQueue<Integer> minEndTimes = new PriorityQueue<>();
        minEndTimes.offer(intervals[0].end);
        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i].start >= minEndTimes.peek()) {
                minEndTimes.poll();
                minEndTimes.offer(intervals[i].end);
            } else {
                minEndTimes.offer(intervals[i].end);
            }
        }
        return minEndTimes.size();
    }
}
