package Recursion;

public class MakeCoinChange {
    public static void main(String[] args) {
        int n = 200;
        System.out.println("Change  " + n + " = " + change(n));
    }

    private static int change(int amount) {
        if (amount < 0 ) {
            return -1;
        }

        if (amount >= 25) {
            return amount/25 + change(amount % 25);
        }
        else if (amount >= 10) {
            return amount/10 + change(amount % 10);
        }
        else if (amount >= 5) {
            return amount/5 + change(amount % 5);
        }
        else {
            return amount;
        }
    }
}
