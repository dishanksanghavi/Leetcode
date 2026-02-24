package NeetCode150.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++){
            if (nums[i] > 0) break;
            int l = i+1;
            int r = nums.length-1;
            int target = -nums[i];
            while (l<r){
                int currentSum = nums[l]+nums[r];
                if (currentSum > target)
                    r--;
                else if (target > currentSum)
                    l++;
                else {
                    res.add(List.of(nums[i], nums[l], nums[r]));
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums1 = {0,0,0};
        System.out.println("Original array: " + Arrays.toString(nums1));
        List<List<Integer>> result1 = threeSum(nums1);
        System.out.println("Output : "+ result1.toString());
        System.out.println("Time Complexity: O(n^2)");
        System.out.println("Space Complexity : O(1) or O(n) extra space depending on the sorting algorithm. O(m) space for the output list.");

    }
}
