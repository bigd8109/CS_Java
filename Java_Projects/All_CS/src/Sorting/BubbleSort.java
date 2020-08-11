package Sorting;

public class BubbleSort extends AbstractSort{

    public void sort(int[] ar) {
        for (int i = 0; i < ar.length - 1; i++) {
            // (ar.length - i - 1) is for ignoring comparisons of elements which have already been compared in earlier iterations
            for (int j = 0; j < ar.length - i - 1; j++) {
                if (ar[j] > ar[j+1]) {
                    swap(ar, j, j+1);
                }
            }
        }
    }
}
