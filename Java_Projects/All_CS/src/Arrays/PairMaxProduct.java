package Arrays;

//Find a pair of numbers that has maximum product
public class PairMaxProduct {
    public static void main(String[] args) {
        int[] ar = new int[]{-8, 4, 3, 6, -7, 0, 7} ;
        PairMaxProduct mp = new PairMaxProduct();
        mp.findPair(ar);
        mp.findPair3(ar);
    }

    //O(n2)
    private void findPair(int[] ar) {
        int a = ar[0];
        int b = ar[1];

        for (int i = 0; i < ar.length; i++) {
            for (int j = i+ 1; j < ar.length; j++) {
                if (ar[i] * ar[j] > a * b) {
                    a = ar[i];
                    b = ar[j];
                }
            }
        }

        System.out.println("Max at values: " + a + " and " + b);
    }

    //O(nlogn): sort the array, then compare 2 max with 2 min
    private void findPair2(int[] ar){}

    //O(n): find 2 max and 2 min
    private void findPair3(int[] ar) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max1) {
                if (i > 0) {
                    max2 = max1;
                }
                max1 = ar[i];
            }
            else if(ar[i] > max2) {
                max2 = ar[i];
            }

            if (ar[i] < min1) {
                if (i > 0) {
                    min2 = min1;
                }
                min1 = ar[i];
            }
            else if(ar[i] < min2) {
                min2 = ar[i];
            }
        }
        System.out.println("2 max are: " + max1 + " and " + max2);
        System.out.println("2 min are: " + min1 + " and " + min2);

        if (max1 * max2 > min1 * min2) {
            System.out.println("Max at values: " + max1 + " and " + max2);
        }
        else {
            System.out.println("Max at values: " + min1 + " and " + min2);
        }
    }
}
