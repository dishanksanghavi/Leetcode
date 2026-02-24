package NeetCode150.TwoPointers;

import java.util.Arrays;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class MaxArea {
    public static int maxArea(int[] heights) {

        int l = 0;
        int r = heights.length-1;
        int maxSum = 0;
        while (l < r){
            int sum = (r-l) * min(heights[l], heights[r]);
            if ( heights[l] <= heights[r])
                l++;
            else
                r--;
            maxSum = max(sum, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,7,2,5,4,7,3,6};
        System.out.println("Original array: " + Arrays.toString(nums1));
        int result1 = maxArea(nums1);
        System.out.println("Output : "+ result1);
        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(1)");

    }
}
