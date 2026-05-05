public boolean uc6(char[][] board, int row, int col, char symbol) {
    // Check if position is valid and empty
    if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
        board[row][col] = symbol;
        return true;
    }
    return false;
}