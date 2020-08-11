package Sorting;

import java.util.ArrayList;
import java.util.*;

public class TestCollectionSort {
    public static void main (String[] args) {
        System.out.println("Test");
        ArrayList<Interval> lst = new ArrayList<Interval>();
        lst.add(new Interval(1,2));
        lst.add(new Interval(2,3));
        lst.add(new Interval(2,4));
        lst.add(new Interval(1,3));

        System.out.println("Before");
        //printList(lst);
        System.out.println("After");
        Collections.sort(lst);
        printList(lst);
    }

    private static void printList(ArrayList<Interval> lst) {
        int current_end = lst.get(0).getEnd();
        lst.get(0).printInterval();
        for (int i = 1; i < lst.size(); i++) {
            if (lst.get(i).getStart() >= current_end) {
                lst.get(i).printInterval();
                current_end = lst.get(i).getEnd();
            }
        }
    }
}

class Interval implements Comparable<Interval>{
    private int start;
    private int end;

    public Interval (int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getEnd() {
        return this.end;
    }

    public int getStart() {
        return this.start;
    }

    public void printInterval() {
        System.out.println("start: " + start + " - " + "end: " + end);
    }

    public int compareTo(Interval other) {
        return this.end - other.end;
    }
}

