public void uc8(char[][] board) {
    char currentPlayer = 'X';
    boolean gameOver = false;

    while (!gameOver) {
        // Player makes a move
        makeMove(board, currentPlayer);

        // Check for winner
        if (checkWinner(board, currentPlayer)) {
            System.out.println("Player " + currentPlayer + " wins!");
            gameOver = true;
        }
        // Check for draw
        else if (isDraw(board)) {
            System.out.println("Game is a draw!");
            gameOver = true;
        }
        // Switch turn
        else {
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }
}