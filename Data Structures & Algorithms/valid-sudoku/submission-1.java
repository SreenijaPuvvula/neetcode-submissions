class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row = 9, col = 9, boxInd;
        HashSet<Character> rowSet, colSet, boxSet[];
        rowSet = new HashSet<>();
        colSet = new HashSet<>();
        boxSet = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            boxSet[i] = new HashSet<>();
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] != '.') {
                    if (rowSet.contains(board[i][j])) {
                        return false;
                    } else {
                        rowSet.add(board[i][j]);
                    }
                    boxInd = (i / 3) * 3 + (j / 3);
                    if (boxSet[boxInd].contains(board[i][j])) {
                        return false;
                    } else {
                        boxSet[boxInd].add(board[i][j]);
                    }
                }

                if (board[j][i] != '.') {
                    if (colSet.contains(board[j][i])) {
                        return false;
                    } else {
                        colSet.add(board[j][i]);
                    }
                }
            }
            colSet.clear();
            rowSet.clear();
        }

        return true;
    }
}
