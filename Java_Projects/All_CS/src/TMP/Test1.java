package TMP;

public class Test1 {
    public static void main(String[] args) {
//        for (int i = 1; i < 9; i++) {
//            System.out.println("n = " + i + ": " + countAndSay(i));
//        }
        int[] ar = {2,2,3,7,0,1,2,3,8};
        count(ar);
    }

    private static void count(int[] ar) {
        int[] re = new int[9];
        for (int i = 0; i < ar.length; i++) {
            re[ar[i]]++;
        }

        for (int i = 0; i< re.length; i++) {
            System.out.println(i + " - count = " + re[i]);
        }
    }

    private static void test(int[] ar) {
//        int i = 0;
//        while (i < ar.length - 1) {
//            System.out.println(ar[i] + ar[i+1]);
//            i++;
//        }

        int count = 0;
        for (int i = 0; i < ar.length -1; i++) {
            System.out.println("Compare " + ar[i] + " vs. " + ar[i+1] + ": " + (ar[i] < ar[i+1]));
        }
    }

    private static String countAndSay(int num) {
        if (num == 1) return "1";
        if (num == 2) return "11";

        String result = "11";

        for (int i = 3; i <= num; i++) {
            String previous = result;
            int index = 1;
            int count = 0;

            Character ch = previous.charAt(0);
            while (index <= previous.length()) {
                if (previous.charAt(index) == ch) {
//                    previous = previous.substring(index);
                    count++;
                    index++;
                    ch = previous.charAt(index);
                }
                else {
                    result = Integer.toString(count) + ch;
                    previous = previous.substring(index);
                    count = 0;
                    ch = previous.charAt(0);
                    index = 1;
                }
            }



            while (previous.length() > 0) {
                if (previous.charAt(index) == ch) {
                    previous = previous.substring(index);
                    count++;
                    index++;
                }
                else {
                    result = Integer.toString(count) + ch;
                    previous = previous.substring(index);
                    count = 0;
                    ch = previous.charAt(0);
                    index = 1;
                }
//            tmp = tmp.substring(index, tmp.length() -1);
            }
            previous = result;
        }
        return result;
    }
}
