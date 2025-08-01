import java.util.*;
public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;

    }
    public static void main(String[] args) {
        int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Original array: " + Arrays.toString(nums1));
        int result1 = removeDuplicates(nums1);
        System.out.println("List length after removing duplicates : "+ result1);
        System.out.println("Time Complexity: O(n), where n is the number of elements in the array. We traverse the array with a single pass using the two pointers.");
        System.out.println("Space Complexity: O(1), as we are using extra space only for the pointers and directly modifying the input array.");

    }
}
