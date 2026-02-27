package NeetCode150.SlidingWindow;

import java.util.HashMap;

public class LongestRepeatingSubstringWithReplacement {
    public static int characterReplacement(String s, int k) {

        HashMap<Character, Integer> count = new HashMap<>();
        int res = 0, l = 0;

        for (int r = 0; r < s.length() ; r++ ){
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r) , 0) + 1);
            while ((r-l+1) - count.get(s.charAt(r)) > k ){
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(res, r-l+1);
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "XYYX";
        int k = 2;
        System.out.println("Original String : " + str);
        int result = characterReplacement(str, k);
        System.out.println("Longest Substring Length With Replacement is : "+ result);
        System.out.println("Time complexity: O(n)");
        System.out.println("Space Complexity: O(m)");
    }
}
