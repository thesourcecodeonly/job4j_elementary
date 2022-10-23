package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (j != board.length - 1 && board[i][j] != board[i][j + 1]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
