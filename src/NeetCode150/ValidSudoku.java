package NeetCode150;

import java.util.Arrays;
import java.util.HashSet;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        int N = 9;
        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] cols = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];

        for (int r = 0; r<N; r++){
            rows[r] = new HashSet<>();
            cols[r] = new HashSet<>();
            boxes[r] = new HashSet<>();
        }

        for (int r = 0; r<N; r++){
            for (int c = 0; c<N; c++){
                char val = board[r][c];
                if (val == '.')
                    continue;
                if (rows[r].contains(val))
                    return false;
                rows[r].add(val);
                if (cols[c].contains(val))
                    return false;
                cols[c].add(val);
                int idx = (r / 3) * 3 + (c / 3);
                if (boxes[idx].contains(val))
                    return false;
                boxes[idx].add(val);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        char[][] nums1 = 
                        {{'1','2','.','.','3','.','.','.','.'}, 
                        {'4','.','.','5','.','.','.','.','.'},
                        {'.','9','8','.','.','.','.','.','3'},
                        {'5','.','.','.','6','.','.','.','4'},
                        {'.','.','.','8','.','3','.','.','5'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','.','.','.','.','.','2','.','.'},
                        {'.','.','.','4','1','9','.','.','8'},
                        {'.','.','.','.','8','.','.','7','9'}};
        System.out.println("Original array: " + Arrays.toString(nums1));
        boolean result1 = isValidSudoku(nums1);
        System.out.println("Majority Element : "+ result1);
        System.out.println("Time Complexity: O(n*n)");
        System.out.println("Space Complexity: O(n*n)");

    }
}
