package NeetCode150.SlidingWindow;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        int[] ans = new int[nums.length-k+1];
        int indx = 0;
        for (int i = 0; i <= nums.length-1; i++){
            heap.offer(new int[]{nums[i], i});
            if (i >= k-1 ){
                while (heap.peek()[1] <= i - k){
                    heap.poll();
                }
                ans[indx++] = heap.peek()[0];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,1,0,4,2,6};
        int k = 3;
        System.out.println("Original Array : " + Arrays.toString(nums));
        int[] result = maxSlidingWindow(nums, k);
        System.out.println("Sliding Window Maximum : "+ Arrays.toString(result));
        System.out.println("Time complexity: O(n log n)");
        System.out.println("Space Complexity: O(n)");
    }
}
