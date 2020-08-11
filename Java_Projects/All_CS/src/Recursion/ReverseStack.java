package Recursion;

import java.util.ArrayList;

public class ReverseStack {
//    static ArrayList<Integer> ar = new ArrayList<Integer>();
    static ArrayList<Integer> res = new ArrayList<Integer>();

    private static boolean isEmpty(ArrayList<Integer> ar) {
        return ar != null && ar.size() == 0;
    }

    private static int pop(ArrayList<Integer> ar) {
        if (ar.size() > 0) {
            return ar.get(ar.size() - 1);
        }
        return -1;
    }

    private static void push(ArrayList<Integer> ar, int num) {
        ar.add(num);
    }

    private static void reverse(ArrayList<Integer> ar) {
        System.out.println("Processing: ");
        printList(ar);
        if (!isEmpty(ar)) {
            push(res, pop(ar));
            ar.remove(ar.size() -1);
            reverse(ar);
        }
        else {
            printList(res);
        }
    }

    private static void printList(ArrayList<Integer> ar) {
        for (int i = 0; i < ar.size(); i++) {
            System.out.print(ar.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);

        reverse(ar);
    }

}
