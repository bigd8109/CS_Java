package Sorting;

import java.util.Random;

public class AbstractSort {
    protected void swap(int[] ar, int i, int j) {
        int tmp = ar[i];
        ar[i] = ar[j];
        ar[j] = tmp;
    }

    public void printArray(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }

    //for testing
    public void shuffleArray(int[] ar)
    {
        int index, temp;
        Random random = new Random();
        for (int i = ar.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            temp = ar[index];
            ar[index] = ar[i];
            ar[i] = temp;
        }
    }
}
