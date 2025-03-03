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
    }
}
