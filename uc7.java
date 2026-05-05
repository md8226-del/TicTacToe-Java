import java.util.Random;

public void uc7(char[][] board, char symbol) {
    Random rand = new Random();
    boolean movePlaced = false;

    while (!movePlaced) {
        int slot = rand.nextInt(9) + 1; // Generate 1–9

        // Convert slot to row and column
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        // Check if cell is empty
        if (board[row][col] == ' ') {
            board[row][col] = symbol;
            movePlaced = true;
        }
    }
}