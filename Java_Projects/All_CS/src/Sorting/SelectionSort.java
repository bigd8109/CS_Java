package Sorting;

public class SelectionSort extends AbstractSort{
    public void sort(int[] ar) {
        int min_index;
        for (int i = 0; i < ar.length - 1; i++) {
            min_index = i;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] < ar[min_index]) {
                    min_index = j;
                }
            }
            swap(ar, i, min_index);
        }
    }
}
