package Sorting;
import java.util.Arrays;

public class SortingDemo {
    public static void main (String[] args) {
        int[] ar = new int[]{5, 2, 7, 3, 8, 9, 2, 15, 1, 19, 1};
        System.out.println("Input: " + Arrays.toString(ar));

        System.out.println("\nSelection sort:");
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(ar);
        selectionSort.printArray(ar);
        selectionSort.shuffleArray(ar);


        System.out.println("\nBubble sort:");
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(ar);
        bubbleSort.printArray(ar);
        bubbleSort.shuffleArray(ar);
    }
}
