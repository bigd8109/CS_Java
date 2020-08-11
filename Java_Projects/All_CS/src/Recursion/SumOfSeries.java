package Recursion;

public class SumOfSeries {
    //n = 3 -> sum = 1^1 + 2^2 + 3^3 = 32
    private static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return (int) Math.pow(n, n) + sum(n-1);
        }
    }

    //Solving f(n)= (1) + (2*3) + (4*5*6) … n
    private static int sumSeries(int n, int current, int addedUp) {
        int i, cur = 1;
        if (current == n + 1) {
            return 0;
        }

        for (i = addedUp; i < addedUp + current; i++) {
            cur *= i;
        }
        return cur + sumSeries(n, current+1, i);

    }

    //Sum of digit of a number using recursion
    private static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        else {
            return n % 10 + sumDigits((n/10));
        }
    }

    public static void main(String[] args) {
        int n = 123450;
//        System.out.println("sum = " + sum(n));
        System.out.println("sumDigits = " + sumDigits(n));
//        System.out.println("sumSeries = " + sumSeries(n, 1, 1));
    }
}
