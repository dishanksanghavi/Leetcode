package NeetCode150;

import java.util.*;

public class GroupAnagrams {
        public static List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> res = new HashMap<>();
            for (String s : strs) {
                int[] count = new int[26];
                for (char c : s.toCharArray()) {
                    count[c - 'a']++;
                }
                String key = Arrays.toString(count);
                res.putIfAbsent(key, new ArrayList<>());
                res.get(key).add(s);
            }
            return new ArrayList<>(res.values());
        }

    public static void main(String[] args) {
        String[] str1 = {"eat","tea","tan","ate","nat","bat"};
        System.out.println("Original String List : " + Arrays.toString(str1));
        List<List<String>> result1 = groupAnagrams(str1);
        System.out.println("Is Anagram : "+ result1);
        System.out.println("Time complexity: O(n+m)");
        System.out.println("Space Complexity: O(1)");

    }
}
