package NeetCode150;

import java.util.*;

public class TopKFrequent {
    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for (int n : freq[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }
        return res;

    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,3,3,3,4,4};
        int frequent = 2;
        System.out.println("Original array: " + Arrays.toString(nums1) + " frequent elements : " + frequent);
        int[] result1 = topKFrequent(nums1, frequent);
        System.out.println("Output : "+ Arrays.toString(result1));
        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(n)");

    }
}
