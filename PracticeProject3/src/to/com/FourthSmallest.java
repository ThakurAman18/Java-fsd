package to.com;

import java.util.Arrays;

public class FourthSmallest {
    public static int fourthSmallest(int[] nums) {
        if (nums.length < 4) {
            throw new IllegalArgumentException("List must have at least 4 elements.");
        }

        Arrays.sort(nums);
        return nums[3];
    }

    public static void main(String[] args) {
        int[] nums = {90, 30, 60, 1, 2, 80, 400, 700000, 5000000};
        int fourthSmallest =fourthSmallest(nums);
        System.out.println("The fourth smallest element is: " + fourthSmallest);
    }
}

