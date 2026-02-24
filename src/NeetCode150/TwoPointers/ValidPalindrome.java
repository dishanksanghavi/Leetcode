package NeetCode150.TwoPointers;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {

        char[] charArray = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase().toCharArray();
        int j = charArray.length-1;
        for (int i = 0; i <= s.length()/2 ; i++ ){
            if(charArray[i] != charArray[j])
                return false;
            j -= 1;
        }
        return true;

    }

    public static void main(String[] args) {
        String str = "tab a cat";
        System.out.println("Original String : " + str);
        boolean result = isPalindrome(str);
        System.out.println("Valid Palindrome : "+ result);
        System.out.println("Time complexity: O(n/2)");
        System.out.println("Space Complexity: O(1)");
    }
}
