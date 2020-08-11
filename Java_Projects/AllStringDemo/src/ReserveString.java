public class ReserveString {
    public String reverse(String s) {
        String result = "";
        if (s.isEmpty() || s == null) {
            return null;
        }
        for (int i = s.length(); i > 0; i--) {
            result = result + s.charAt(i-1);
        }
        return result;
    }

    public String reverse2(String s) {
        String result = "";

        while (s.length() > 0) {
            result = result + s.charAt(s.length() - 1);
            s = s.substring(0, s.length() - 1);
        }
        return result;
    }

    public static int reverseInteger(int num) {
        int result = 0;
        int remaining = Math.abs(num);
        while (remaining != 0) {
            result = result*10 + remaining % 10;
            remaining /= 10;
        }
        return (num > 0) ? result : (-1) * result;
    }

    public static boolean isNumPalindrome(int num) {
        if (num < 0) return false;

        int remaining = Math.abs(num);
        int numDigits = (int)(Math.log10(num)+1);
        while (numDigits > 0) {
            System.out.println("Comparing:" + (int) (remaining / Math.pow(10, numDigits -1)) + "  and  " + (remaining % 10));
            if ((int)(remaining / Math.pow(10, numDigits - 1)) != (remaining % 10)) {
                return false;
            }
            remaining = (int) (remaining % Math.pow(10, numDigits - 1)/10); //remove the left number by %, then remove the right number by /
            System.out.println("remaining: " + remaining);
            numDigits = numDigits - 2;
        }
        return true;
    }

    public static String reverseString(String st) {
        char[] ca = st.toCharArray();
        int len = ca.length;
        if (len <= 1)
            return st;

        for (int i = 0; i < len / 2; i++) {
            char tmp = ca[i];
            ca[i] = ca[len - i - 1];
            ca[len - i - 1] = tmp;
        }
        return String.copyValueOf(ca);
    }

    public static boolean isPalindrome(String st) {
        char[] ca = st.toCharArray();
        int len = ca.length;
        if (len <= 1)
            return true;

        for (int i = 0; i < len / 2; i++) {
            if (ca[i] != ca[len - i - 1])
                return false;
        }
        return true;
    }

    public static boolean isPalindrome2(String st) {
        if (st.isEmpty()) return false;
        int i = 0;
        int j = st.length() - 1;

        while (i < j) {
            if (st.charAt(i) != st.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public String reverseWords(String input) {
        String result = "";
        String[] st = input.split(" ");
        for (int i = st.length - 1; i >= 0; i--) {
            result = result + st[i] + " ";
        }
        return result.trim();
    }

    public String reverseWords2(String input) {
        String result = "";
        String tmp = reverseString(input);
        String[] st = tmp.split(" ");
        for (int i = 0; i < st.length; i++) {
            result = result + reverseString(st[i]) + " ";
        }
        return result.trim();
    }
}
