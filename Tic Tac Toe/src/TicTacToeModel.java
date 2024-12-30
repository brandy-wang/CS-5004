public class TicTacToeModel implements ITicTacToeModel {
    private char[][] board;
    private char currentPlayer;

    public TicTacToeModel() {
        board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' '; // Initialize board with empty spaces
            }
        }
        currentPlayer = 'X'; // X starts the game
    }

    @Override
    public boolean makeMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != ' ') {
            return false; // Invalid move
        }
        board[row][col] = currentPlayer;
        return true;
    }

    @Override
    public boolean checkWin() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }

        return false;
    }

    @Override
    public boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; // Empty space means game is not a draw
                }
            }
        }
        return !checkWin(); // Draw if no spaces left and no winner
    }

    @Override
    public void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    @Override
    public char getCurrentPlayer() {
        return currentPlayer;
    }

    @Override
    public char[][] getBoard() {
        return board;
    }
}
