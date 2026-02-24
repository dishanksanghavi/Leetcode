package NeetCode150.TwoPointers;

import java.util.Arrays;

public class TwoSum2 {
    public static int[] twoSum(int[] numbers, int target) {

        int i = 0;
        int j = numbers.length-1;
        while (i<j){
            int currentSum = numbers[i]+numbers[j];
            if (currentSum > target)
                j--;
            else if (target > currentSum)
                i++;
            else
                return new int[]{i,j};
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int target = 6;
        System.out.println("Original array: " + Arrays.toString(nums1) + " target sum : " + target);
        int[] result1 = twoSum(nums1, target);
        System.out.println("Output : "+ Arrays.toString(result1));
        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(1)");

    }
}
