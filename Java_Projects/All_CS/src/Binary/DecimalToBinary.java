package Binary;

import java.util.ArrayList;
import java.util.List;

public class DecimalToBinary {


    public static void main(String[] args) {
//        System.out.println("\nBinary of 999 : " + printBinary(999));
        for (int i = 0; i < 35; i++) {
            System.out.println("\nBinary of " + i + ": " + printBinary3(i) + " -> Count 1s: " + countOnes(i) + " -> Count 0s: " + countZeros(i));
        }

    }

    private static int countOnes(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 1)
                count++;
            num = num / 2;
        }
        return count;
    }

    private static int countZeros(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 0)
                count++;
            num = num / 2;
        }
        return count;
    }

    private static String printBinary(int num) {
        String result = "";
        while (num > 0) {
            result = (num % 2) + result;
            num = num / 2;
        }
        return result;
    }

    private static String printBinary2(int num) {
        List<Integer> stack = new ArrayList<Integer>();
        String result = "";
        while (num > 0) {
            stack.add(num % 2);
            num = num / 2;
        }

        for (int i = stack.size() - 1; i >= 0; i--) {
            result = result + stack.get(i);
        }
        return result;
    }

    //using recursion
    private static String printBinary3(int num) {
//        String result = "0";
        if (num == 0)
            return "";
        return printBinary3(num/2) + (num % 2);
//        return result;
    }
}
