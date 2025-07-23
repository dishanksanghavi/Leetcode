package NeetCode150;

import java.util.*;

public class TwoSum {
    public static List<Integer> twoSum(int[] nums, int target){
        HashMap<Integer,Integer> seen = new HashMap<>();
        for (int i = 0; i<nums.length; i++ ){
            int compliment = target - nums[i];
            if (seen.containsKey(compliment)){
                return Arrays.asList(seen.get(compliment),i);
            }
            seen.put(nums[i],i);
        }
        return new ArrayList<>();
    }
    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int target = 9;
        System.out.println("Original array: " + Arrays.toString(nums1) + " target sum : " + target);
        List<Integer> result1 = twoSum(nums1, target);
        System.out.println("Output : "+ result1);
        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(n)");

    }
}
