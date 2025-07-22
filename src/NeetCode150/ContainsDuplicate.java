package NeetCode150;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums){
            if (seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        System.out.println("Original array: " + Arrays.toString(nums1));
        boolean result1 = containsDuplicate(nums1);
        System.out.println("Contains Duplicate : "+ result1);
        System.out.println("Time Complexity: O(n),We traverse the array with a single pass and store in HashTable.");
        System.out.println("Space Complexity: O(n), as the hash set might store all unique elements if no duplicates are found.");

    }
}
