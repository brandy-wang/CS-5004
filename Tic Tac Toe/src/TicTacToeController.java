import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeController implements ITicTacToeController {

    private ITicTacToeView view;
    private char[][] board;
    private char currentPlayer;
    private boolean gameActive;

    public TicTacToeController() {
        board = new char[3][3];
        currentPlayer = 'X';
        gameActive = true;
    }

    @Override
    public void startGame() {
        resetGame();
        view.showMessage("Game started! Player X's turn.");
    }

    @Override
    public boolean makeMove(char player, int row, int col) {
        if (!gameActive) {
            view.showMessage("Game is not active. Please reset to start a new game.");
            return false;
        }

        if (board[row][col] == '\u0000') { // '\u0000' is the default value for char (empty cell)
            board[row][col] = player;
            view.updateBoard(row, col, String.valueOf(player));

            if (checkWinner() != null) {
                gameActive = false;
                view.showMessage("Player " + player + " wins!");
                return true;
            }

            if (isDraw()) {
                gameActive = false;
                view.showMessage("It's a draw!");
                return true;
            }

            switchPlayer();
            view.showMessage("Player " + currentPlayer + "'s turn.");
            return true;
        } else {
            view.showMessage("Cell is already occupied. Try another move.");
            return false;
        }
    }

    @Override
    public Character checkWinner() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '\u0000' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][0];
            }
            if (board[0][i] != '\u0000' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return board[0][i];
            }
        }
        // Check diagonals
        if (board[0][0] != '\u0000' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0];
        }
        if (board[0][2] != '\u0000' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2];
        }

        return null;
    }

    @Override
    public boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '\u0000') {
                    return false;
                }
            }
        }
        return checkWinner() == null;
    }

    @Override
    public void displayBoard() {
        StringBuilder boardDisplay = new StringBuilder("Current board:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boardDisplay.append(board[i][j] == '\u0000' ? "-" : board[i][j]).append(" ");
            }
            boardDisplay.append("\n");
        }
        System.out.println(boardDisplay);
    }

    @Override
    public void resetGame() {
        board = new char[3][3];
        currentPlayer = 'X';
        gameActive = true;
        view.resetBoard();
        view.showMessage("Board reset. Player X starts!");
    }

    @Override
    public void setView(ITicTacToeView view) {
        this.view = view;

        // Add action listeners to buttons
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                int finalRow = row;
                int finalCol = col;
                view.getButton(row, col).addActionListener(e -> makeMove(currentPlayer, finalRow, finalCol));
            }
        }
    }




    @Override
    public char getCurrentPlayer() {
        return currentPlayer;
    }

    @Override
    public void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
}




