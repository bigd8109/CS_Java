package DynamicProgramming;

public class Fibonacci {
    final int MAX = 100;
    final int NIL = -1;
    int[] lookup = new int[MAX];

    private void init() {
        for (int i = 0; i < MAX; i++) {
            lookup[i] = NIL;
        }
    }

    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci();
        int n = 9;
        System.out.println("Fibo 1 = " + fibo.fibo1(n));

        fibo.init();
        System.out.println("Fibo 2 = " + fibo.fibo2(n));
        System.out.println("Fibo 3 = " + fibo.fibo3(n));

    }

    //Using recursion
    private int fibo1(int n) {
        if (n <= 1) {
            return n;
        }
        return fibo1(n-1) + fibo1(n-2);
    }

    //Using DP - Memoization - Top down approach
    private int fibo2(int n) {
        if (lookup[n] == NIL) {
            if (n <= 1) {
                lookup[n] = n;
            } else {
                lookup[n] = fibo2(n - 1) + fibo2(n - 2);
            }
        }
        return lookup[n];
    }

    //Using DP - Tabulation - Bottom up approach
    private int fibo3(int n) {
        int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n; i++) {
            System.out.println("Running i = " + i);
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}
