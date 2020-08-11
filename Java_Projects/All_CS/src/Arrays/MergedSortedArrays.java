package Arrays;


public class MergedSortedArrays {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 7, 8, 0, 0, 0,0,0};
        int[] b = {1, 2, 3, 6, 9};
//        System.out.println(merge(a, b).toString());
        printArray(a);
        printArray(b);
//        printArray(merge(a,b));
        printArray(merge2(a,5,b,5));



//        int[] c = {-3, -1, 0, 4, 6, 7};
        int[] c = {-4,-1,0,3,10};
//        int[] c = {-2, 0};
//        printArray(c);
//        sortedSquare(c);


    }

    private static void sortedSquare(int[] ar) {
        int idx = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] >= 0) {
                idx = i;
                break;
            }
        }

        System.out.println("\nidx: " + idx);
        int[] part1 = new int[idx];
        int[] part2 = new int[ar.length - idx];
        System.arraycopy(ar, 0           , part1, 0     , part1.length);
        System.arraycopy(ar, part1.length, part2, 0     , part2.length);

        printArray(part1);
        printArray(reverseChangeSign(part1));
        printArray(part2);
        printArray(merge(part1, part2));

        int[] merged = merge(reverseChangeSign(part1), part2);
        //square
        for (int j = 0; j < merged.length; j++) {
            merged[j] = (int) Math.pow(merged[j], 2);
        }
        printArray(merged);
//        printArray(reverseChangeSign(part1));
//        printArray(part2);
//        printArray(merge(part1, part2));
//        return merge(reverse(part1), part2);
    }

    private static int[] reverseChangeSign2(int[] ar) {
        if (ar == null) return null;
        if (ar.length == 1) {
            ar[0] = Math.abs(ar[0]);
            return ar;
        }
        int i = 0;
        int tmp;
        while (i < ar.length / 2) {
            tmp = Math.abs(ar[i]);
            ar[i++] = Math.abs(ar[ar.length - 1]);
            ar[ar.length - 1] = tmp;
        }
        return ar;
    }

    private static int[] reverseChangeSign(int[] ar) {
        if (ar == null) return null;
        int[] res = new int[ar.length];
        for (int i = ar.length - 1; i >= 0; i--) {
            res[ar.length - i -1] = Math.abs(ar[i]);
        }

        return res;
    }

    //merged 2 sorted arrays using a new array
    private static int[] merge(int[] ar1, int[] ar2) {
        int[] merged = new int[ar1.length + ar2.length];
        int i = 0, j = 0, index = 0;
        while (i < ar1.length && j <ar2.length) {
            if (ar1[i] < ar2[j]) {
                merged[index++] = ar1[i++];
            } else if (ar1[i] > ar2[j]) {
                merged[index++] = ar2[j++];
            }
            else {
                merged[index++] = ar1[i++];
                merged[index++] = ar2[j++];
            }
        }
        while (i < ar1.length) {
            merged[index++] = ar1[i++];
        }
        while (j < ar2.length) {
            merged[index++] = ar2[j++];
        }
        return merged;
    }

    //merged 2 sorted arrays in-place
    public static int[] merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, index = 0;
        while (j < n) {
            System.out.println("Step i: " + i + " -  j: " + j);
//            printArray(nums1);
            if (nums1[i] < nums2[j]) {
                i++;
            }
            else if (nums1[i] >= nums2[j]) {
                for (int k = nums1.length - 1; k >= i; k--) {
//                    System.out.println("k = " + k + " - nums1[k] =" + nums1[k]);
                    nums1[k] = nums1[k-1];
                }

                nums1[i++] = nums2[j++];
                printArray(nums1);
//                m2++;
            }
//            if (i == m2) {
//                System.out.println("i-m2 = " + i + " - nums1[i] =" + nums1[i]);
//            }

        }

        return nums1;
    }

    private static void printArray(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.print("\n");
    }

}
