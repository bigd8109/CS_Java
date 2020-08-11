package Arrays;

/*
Find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum
*/
public class LargestSumContiguousSubarray {
    public static void main(String[] args) {
        int[] ar = new int[] {-8, -2, -3, 4, -1, -2, 1, 5, -3};
        LargestSumContiguousSubarray lsc = new LargestSumContiguousSubarray();

        System.out.println("Largest sum = " + lsc.sum(ar));
        System.out.println("Largest sum DP = " + lsc.sumDP(ar));
    }

    //Kadane’s Algorithm
    private int sum(int[] ar) {
        int max_so_far = 0;
        int max_ending = 0;
        int start_pos = 0;
        int end_pos = 0;

        for (int i = 0; i < ar.length; i++) {
            max_ending += ar[i];
            if (max_so_far < max_ending) {
                max_so_far = max_ending;
                end_pos = i;

            }
            if (max_ending < 0) {
                max_ending = 0;
                start_pos = i + 1;
            }
        }
        System.out.println("start pos = " + start_pos);
        System.out.println("end pos = " + end_pos);
        return max_so_far;
    }

    //Using Dynamic Programming
    private int sumDP(int[] ar) {
        int max_so_far = 0;
        int max_ending = 0;

        for (int i = 0; i < ar.length; i++) {
            max_ending = Math.max(ar[i], max_ending + ar[i]);
            max_so_far = Math.max(max_ending, max_so_far);
        }
        return max_so_far;
    }

}
