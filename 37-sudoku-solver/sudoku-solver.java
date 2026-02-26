class Solution {

    boolean[][] rows = new boolean[9][9];
    boolean[][] cols = new boolean[9][9];
    boolean[][] boxes = new boolean[9][9];

    public void solveSudoku(char[][] board) {

        // Initialize tracking arrays
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] != '.') {

                    int num = board[i][j] - '1';
                    int box = (i / 3) * 3 + (j / 3);

                    rows[i][num] = true;
                    cols[j][num] = true;
                    boxes[box][num] = true;
                }
            }
        }

        backtrack(board);
    }

    private boolean backtrack(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.') {

                    for (int num = 0; num < 9; num++) {

                        int box = (i / 3) * 3 + (j / 3);

                        if (!rows[i][num] &&
                            !cols[j][num] &&
                            !boxes[box][num]) {

                            // Place number
                            board[i][j] = (char)(num + '1');
                            rows[i][num] = true;
                            cols[j][num] = true;
                            boxes[box][num] = true;

                            if (backtrack(board)) return true;

                            // Undo (Backtrack)
                            board[i][j] = '.';
                            rows[i][num] = false;
                            cols[j][num] = false;
                            boxes[box][num] = false;
                        }
                    }

                    return false; // no number fits
                }
            }
        }

        return true; // board filled
    }
}