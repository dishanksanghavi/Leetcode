package NeetCode150;

import java.util.*;

public class TopKFrequent {
    public static int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length){
            return nums;
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num,0)+1);
        }
        Queue<Integer> priorityQueue = new PriorityQueue<>(
                (a,b) -> {
                    return frequencyMap.get(a) - frequencyMap.get(b);
                }
        );

        for (int n: frequencyMap.keySet()){
            priorityQueue.add(n);
            if (priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }

        int[] ans = new int[k];

        for (int i=0; i<k; i++){
            ans[i]= priorityQueue.poll();
        }

        return ans;

    }
    public static void main(String[] args) {
        int[] nums1 = {1,1,1,2,2,3};
        int frequent = 2;
        System.out.println("Original array: " + Arrays.toString(nums1) + " frequent elements : " + frequent);
        int[] result1 = topKFrequent(nums1, frequent);
        System.out.println("Output : "+ Arrays.toString(result1));
        System.out.println("Time Complexity: O(n log k)");
        System.out.println("Space Complexity: O(n)");

    }
}
