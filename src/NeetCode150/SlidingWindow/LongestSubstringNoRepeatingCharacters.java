package NeetCode150.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringNoRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {

        int l = 0;
        Set<Character> subString = new HashSet<>();
        int res = 0;

        for (int r = 0; r < s.length(); r++){
            if (subString.contains(s.charAt(r))){
                subString.remove(s.charAt(r));
                l++;
            }
            subString.add(s.charAt(r));
            res = Math.max(res, r-l+1);
        }

        return res;
    }

    public static void main(String[] args) {
        String str = "zzzzz";
        System.out.println("Original String : " + str);
        int result = lengthOfLongestSubstring(str);
        System.out.println("Longest Substring Length Without Repeating Characters is : "+ result);
        System.out.println("Time complexity: O(n)");
        System.out.println("Space Complexity: O(m)");
    }
}
