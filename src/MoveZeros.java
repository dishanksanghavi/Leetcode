import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoveZeros {
    public static List<Integer> moveZeroes(int[] nums) {
        int i=0;
        for(int j=0; j<nums.length; j++){
            if(nums[j] != 0){
                nums[i++] = nums[j];
            }
        }
        for(int j=i; j<nums.length; j++){
            nums[j] = 0;
        }
        return Arrays.stream(nums).boxed().collect(Collectors.toList());
    }
    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        List<Integer> result1 = moveZeroes(nums1);
        System.out.println("Original array: " + Arrays.toString(nums1));
        System.out.println("Result (List): " + result1);
        System.out.println("Time Complexity: O(n), where n is the length of the array.");
        System.out.println("Space Complexity: O(1), since we are modifying the array in place without using additional storage.");
    }
}
