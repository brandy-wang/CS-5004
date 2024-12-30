import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Interface for the Tic-Tac-Toe game View.
 * Defines the methods to display the game board and messages to the user.
 */
public interface ITicTacToeView {

    /**
     * Initializes the view components, including the JFrame, JPanel, JButtons, and JLabel.
     */
    void initializeView();

    /**
     * Updates the game board with the given symbol ('X' or 'O') at the specified row and column.
     *
     * @param row    The row index of the cell to update.
     * @param col    The column index of the cell to update.
     * @param symbol The symbol to display in the cell ('X' or 'O').
     */
    void updateBoard(int row, int col, String symbol);

    /**
     * Displays a message to the user, such as the game's status or the winner.
     *
     * @param message The message to display.
     */
    void showMessage(String message);

    /**
     * Clears the game board, resetting all cells to their initial state.
     */
    void resetBoard();



    /**
     * Gets the JButton at the specified row and column on the game board.
     * Useful for attaching custom behavior or querying state.
     *
     * @param row The row index of the button.
     * @param col The column index of the button.
     * @return The JButton at the specified row and column.
     */
    JButton getButton(int row, int col);
}

