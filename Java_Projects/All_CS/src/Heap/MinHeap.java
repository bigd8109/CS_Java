package Heap;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class MinHeap {
    //    int[] Heap = new int[]{3, 5, 6, 8};
    List<Integer> heap;

    public MinHeap() {
        this.heap = new ArrayList<>();
    }

    public MinHeap(ArrayList<Integer> list) {
        this.heap = list;
    }

    private void swap(int parent_idx, int child_idx) {
        int temp = heap.get(parent_idx);
        heap.set(parent_idx, heap.get(child_idx));
        heap.set(child_idx, temp);
    }


    public void addElement(int e) {

    }

    public int getHeight() {
        return 0;
    }

    public int getSize() {
        return 0;
    }

    public void printHeap() {

    }

    public boolean isEmpty() {
        return false;
    }

    public void maxHeapify() {

    }

    public void minHeapify() {

    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + ", ");
        }
    }
    public static void main (String[] args) {
//        int[] a = new int[]{9,9};
//        printArray(plusOne(a));
//        System.out.println("MinHeap test:" + );
//        System.out.println("MinHeap test:" + Integer.toString((int)Math.pow(10,2)));

        long num = 0;
        int[] digits = new int[]{9,8,7,6,5,4,3,2,1,0};
        int len = digits.length;
        System.out.println("len = " + len);
        String st ="";

        for (int i = 0; i < len; i++) {
            st = st + String.valueOf(digits[i]);

//            num = num + digits[i]*((int) Math.pow(10, len-i-1));
//            System.out.println("i: " + i +  "num:" + num);
        }
        BigInteger bigNum = new BigInteger(st);
        BigInteger result = bigNum.add(new BigInteger("1"));


        System.out.println("MinHeap num:" + result);
        System.out.println("MinHeap num:" + result);
    }

    public static int[] plusOne(int[] digits) {

        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 2;

        return newNumber;
    }
}
