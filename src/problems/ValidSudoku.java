package problems;

import java.util.ArrayList;
import java.util.HashMap;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        HashMap<Character, ArrayList<int[]>> map = new HashMap<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (map.get(board[i][j]) == null && board[i][j] != '.') {
                    map.put(board[i][j], new ArrayList<>());
                    map.get(board[i][j]).add(new int[]{i, j});
                } else if (board[i][j] != '.') {
                    for (int k = 0; k < map.get(board[i][j]).size(); k++) {
                        int x = map.get(board[i][j]).get(k)[0];
                        int y = map.get(board[i][j]).get(k)[1];

                        if (x == i && y != j) {
                            return false;
                        }

                        if (x != i && y == j) {
                            return false;
                        }

                        int boxCurrentPos = ((i/3) * 9) + (j/3);
                        int boxLastPos = ((x/3) * 9) + (y/3);

                        if (boxCurrentPos == boxLastPos) {
                            return false;
                        }
                    }


                    map.get(board[i][j]).add(new int[]{i, j});
                }
            }
        }

        return true;
    }
}
