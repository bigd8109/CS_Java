package Recursion;

public class PowerX {
    //This function is overflow when n is very small  = Integer.MIN_VALUE
    public double myPow(double x, int n) {
        if (Math.abs(n) == 0) {
            return 1;
        }
        else {
            if (n > 0) {
                return x * myPow(x, n-1);
            }
            else {
                return (1/x) * myPow(x, n+1);
            }
        }
    }



}
