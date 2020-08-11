package Arrays;
//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//
//Return the array in the form [x1,y1,x2,y2,...,xn,yn].
public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8};
        ShuffleArray s = new ShuffleArray();

    }

    public int[] shuffle0(int[] nums, int n) {
        int[] res = new int[nums.length];

        int j = 0;
        for (int i = 0; i < nums.length/2; i++) {
            res[j++] = nums[i];
            res[j++] = nums[nums.length/2  + i];
        }
        return res;
    }

    public int[] shuffle2(int[] nums, int n) {
        int result[] = new int[2*n];

        for (int i=0; i<n; i++){
            result[2*i] = nums[i];
            result[2*i +1] = nums[i + n];
        }

        return result;
    }

    public int[] shuffle3(int[] nums, int n) {
        int[] res = new int[2 * n];
        for(int i = 0; i < nums.length; i++)
            res[i] = i % 2 == 0 ? nums[i/2] : nums[n + i/2];
        return res;
    }

    //in-place
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        for(int i = 0; i < nums.length; i++)
            res[i] = i % 2 == 0 ? nums[i/2] : nums[n + i/2];
        return res;
    }
}
