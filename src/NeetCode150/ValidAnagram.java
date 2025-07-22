package NeetCode150;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";
        System.out.println("Original String s : " + str1 + " & r : " + str2 );
        boolean result1 = isAnagram(str1, str2);
        System.out.println("Is Anagram : "+ result1);
        System.out.println("Time complexity: O(n+m)");
        System.out.println("Space Complexity: O(1)");

    }
}
