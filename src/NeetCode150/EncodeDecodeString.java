package NeetCode150;

import java.util.List;

public class EncodeDecodeString {

    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s:strs){
            sb.append(s);
            sb.append((char)258);
        }
        return String.valueOf(sb.deleteCharAt(sb.length()-1));
    }

    public static List<String> decode(String str) {
        return List.of(str.split(String.valueOf((char) 258)));
    }

    public static void main(String[] args) {
        List<String> encode = List.of("we","say",":","yes");
        System.out.println("Original List : " + encode);
        String encodedString = encode(encode);
        System.out.println("Encoded String : " + encodedString);
        List<String> decodedString = decode(encodedString);
        System.out.println("Decoded String : " + decodedString.toString());
        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(1)");

    }
}
