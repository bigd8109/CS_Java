package Recursion;

public class ArraySum {
    private static int sum(int[] ar, int n) {
        if (n <=0) {
            return 0;
        }
        return sum(ar, n-1) + ar[n-1];
    }

    private static void sum2(int[] ar, int n, int sum) {
        if (n <= 0) {
            System.out.println("Sum2 = " + sum);
        }
        else {
            sum = sum + ar[n-1];
            sum2(ar, n - 1, sum);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4, 5};

        System.out.println("Sum = " + sum(a, a.length));

        sum2(a, a.length, 0);
    }


}
