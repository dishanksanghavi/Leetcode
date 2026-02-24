package NeetCode150.TwoPointers;

import java.util.Arrays;

public class TrappingRainWater {
    public static int trap(int[] height) {

        if (height == null || height.length == 0) {
            return 0;
        }

        int l = 0, r = height.length-1;
        int maxL = height[l], maxR = height[r];
        int res = 0;
        while (l < r){
            if (maxL < maxR) {
                l++;
                maxL = Math.max(maxL, height[l]);
                res += maxL - height[l];
            } else {
                r--;
                maxR = Math.max(maxR, height[r]);
                res += maxR - height[r];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {0,2,0,3,1,0,1,3,2,1};
        System.out.println("Original array: " + Arrays.toString(nums1));
        int result1 = trap(nums1);
        System.out.println("Output : "+ result1);
        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(1)");

    }
}
