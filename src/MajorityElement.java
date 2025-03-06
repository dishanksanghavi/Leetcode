import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
        public static int majorityElement(int[] nums) {
            int len = nums.length;
            Map<Integer, Integer> counts = new HashMap<>();
            for (int num : nums) {
                counts.compute(num, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
                if (counts.get(num) > len/2)
                    return num;
            }
            return 0;
        }

    public static void main(String[] args) {
        int[] nums1 = {3,2,3};
        int result1 = majorityElement(nums1);
        System.out.println("Majority Element : "+ result1);
        System.out.println("Time Complexity: O(n) because we iterate over the array once.");
        System.out.println("Space Complexity: O(n) because we might store all elements in the map in the worst case.");

    }
}
