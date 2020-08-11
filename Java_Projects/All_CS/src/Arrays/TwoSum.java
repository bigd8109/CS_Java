package Arrays;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
//        int[] a = new int[]{2,3,1,5,6,8,7};
        int[] a = new int[]{1,2,-1,8,9,-2,0};
        twoSum2(a, 0);
    }

    //find two number in array has the sum = sum
    private static void twoSum(int[] nums, int sum) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == sum) {
                    System.out.println("Numbers: " + nums[i] + " , " + nums[j]);
                }
            }
        }
    }

    //find two number in array has the sum = sum
    private static void twoSum2(int[] nums, int sum) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (h.containsKey(sum - nums[i])) {
                System.out.println("Numbers: " + nums[i] + " , " + h.get(sum - nums[i]));
            }
            else {
                h.put(nums[i], i);
            }
        }
    }
}
