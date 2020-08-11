package Arrays;

// Reorder array of integers so that the even entries appear first.
public class SortEvenOdd {
    private static int[] sortEvenOdd(int[] a) {
        int even_index = 0;
        int odd_index = a.length - 1;
        int total = a.length - 1;

        while (total > 0) {
            if (a[even_index] % 2 == 0) {
                total--;
                even_index++;
            }
            else {
                if (a[odd_index] %2 == 0) {
                    swap(a, even_index, odd_index);
                    even_index++;
                    odd_index--;
                    total = total - 2;
                }
                else {
                    odd_index--;
                    total--;
                }
            }
        }
        return a;
    }

    //better solution
    private static int[] sortEvenOdd2(int[] a) {
        int even_index = 0;
        int odd_index = a.length - 1;

        while (even_index < odd_index) {
            if (a[even_index] % 2 == 0) {
                even_index++;
            }
            else {
                swap(a, even_index, odd_index);
                even_index++;
                odd_index--;
            }
        }
        return a;
    }

    private static void swap (int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private static void printArray(int[] a) {
        for (int i=0; i< a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
//        int[] a = new int[]{2,3,1,5,6,8,7};
        int[] a = new int[]{1,2,1,8,9,3,0};
//        printArray(a);
//        System.out.println("\nAfter:");
//        printArray(sortEvenOdd2(a));

//        System.out.println("\nTest:" + Integer.toString(test(6)));
        System.out.println("\nBinary of 999 : " + printBinary(999));
        for (int i = 0; i < 35; i++) {
            System.out.println("\nBinary of " + i + ": " + printBinary(i) + " -> Count 1s: " + test(i));
        }

    }

    private static int test(int num) {
        int count = 0;
//        if (num % 2 == 1) {
//            count++;
//        }
        while (num > 0) {
            if (num % 2 == 1)
                count++;
            num = num / 2;
        }
        return count;
    }

    private static String printBinary(int num) {
        String result = "";
        int index = 0;
        while (num > 0) {
            result = (num % 2) + result;
            num = num / 2;
        }
        return result;
    }
}
