public boolean uc10(char[][] board) {
    boolean isBoardFull = true;

    // Traverse the board
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (board[i][j] == ' ') {
                isBoardFull = false;
                break;
            }
        }
    }

    // If board is full and no winner
    if (isBoardFull && !checkWinner(board)) {
        return true;
    }

    return false;
}