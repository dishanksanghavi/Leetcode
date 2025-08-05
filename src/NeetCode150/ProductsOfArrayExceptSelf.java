package NeetCode150;

import java.util.Arrays;

public class ProductsOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int pre = 1, post = 1;
        int[] ans = new int[nums.length];
        Arrays.fill(ans,1);
        for (int i=0; i< nums.length; i++){
            ans[i] = pre;
            pre = pre*nums[i];
        }

        for (int i= nums.length-1; i>=0; i--){
            ans[i] = post*ans[i];
            post = post*nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,4,6};
        System.out.println("Original array: " + Arrays.toString(nums1));
        int[] result1 = productExceptSelf(nums1);
        System.out.println("Result (List): " + Arrays.toString(result1));
        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(1)");
    }
}
