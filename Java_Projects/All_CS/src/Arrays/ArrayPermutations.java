package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayPermutations {
    Set<String> st = new HashSet<>();
    public static void main(String[] args) {
        int[] ar = new int[]{1,2,3,4};
        int n = 4;
        ArrayPermutations ap = new ArrayPermutations();
//        ap.permutation(ar, n);
        ap.permutation_iterative(ar, n);
//        ap.permutation2(ar, 0, n-1);
//        ap.permutation2_order(ar, 0, n-1);

//        String s = "aba";
//        ap.permutationString(s, 0, s.length()-1);

    }

    //Heap's algorithm - recursive approach
    private void permutation(int[] ar, int n) {
        if (n == 1) {
            //no print duplicates
            if (!st.contains(Arrays.toString(ar))) {
                printArray(ar);
                st.add(Arrays.toString(ar));
            }
        }
        else {
            for (int i = 0; i < n - 1; i++) {
                permutation(ar, n-1);
                if (i % 2 == 0) {
                    swap(ar, i, n - 1);
                } else {
                    swap(ar, 0, n - 1);
                }
            }
            permutation(ar, n-1);
        }
    }

    //Heap's algorithm - iterative approach
    private void permutation_iterative(int[] ar, int n){
        int[] indexes = new int[n];
        for (int i = 0; i < n; i++) {
            indexes[i] = 0;
        }

        printArray(ar);

        int i = 0;
        while (i < n) {
            if (indexes[i] < i) {
                swap(ar, i % 2 == 0 ?  0: indexes[i], i);
                printArray(ar);
                indexes[i]++;
                i = 0;
            }
            else {
                indexes[i] = 0;
                i++;
            }
        }
    }

    private void printArray(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.print("\n");
    }

    private void swap(int[] ar, int a, int b) {
        int tmp = ar[a];
        ar[a] = ar[b];
        ar[b] = tmp;
    }


    //Second way
    private void permutation2(int[] ar, int left, int right) {
        if (left == right) {
            printArray(ar);
        }
        else {
            for (int i = left; i <= right; i++) {
                swap(ar, left, i);
                permutation2(ar, left+1, right);
                swap(ar, left, i);
            }
        }
    }

    //Second way
    private void permutation2_order(int[] ar, int left, int right) {
        if (left == right) {
            printArray(ar);
        }
        else {
            for (int i = left; i <= right; i++) {
                if (ar[left] > ar[i]) {
                    swap(ar, left, i);
                    permutation2(ar, left + 1, right);
                    swap(ar, left, i);
                }
            }
        }
    }



    //print all distinct permutations of a string
    private void permutationString(String s, int left, int right) {
        if (left == right) {
            if (!st.contains(s)) {
                System.out.println(s);
                st.add(s);
            }
        }
        else {
            for (int i = left; i <= right; i++) {
                s = swapString(s, left, i);
                permutationString(s, left+1, right);
                s = swapString(s, left, i);
            }
        }
    }

    private String swapString(String s, int a, int b) {
        char[] chars = s.toCharArray();
        char tmp = chars[a];
        chars[a] = chars[b];
        chars[b] = tmp;
        return String.valueOf(chars);
    }

}
