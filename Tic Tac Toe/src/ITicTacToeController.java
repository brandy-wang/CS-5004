public interface ITicTacToeController {

    /**
     * Starts a new Tic-Tac-Toe game and prepares the board.
     */
    void startGame();

    /**
     * Makes a move for the given player at the specified position.
     *
     * @param player The player making the move ('X' or 'O').
     * @param row The row index (0-based) of the move.
     * @param col The column index (0-based) of the move.
     * @return true if the move was valid and successfully made; false otherwise.
     */
    boolean makeMove(char player, int row, int col);

    /**
     * Checks if there is a winner in the game.
     *
     * @return The winning player ('X' or 'O'), or null if there is no winner yet.
     */
    Character checkWinner();

    /**
     * Checks if the game has ended in a draw.
     *
     * @return true if the game is a draw; false otherwise.
     */
    boolean isDraw();

    /**
     * Displays the current state of the game board (for debugging or console-based version).
     */
    void displayBoard();

    /**
     * Resets the game to its initial state.
     */
    void resetGame();

    /**
     * Sets the view for the controller to interact with.
     *
     * @param view The view instance to associate with this controller.
     */
    void setView(ITicTacToeView view);

    /**
     * Retrieves the current player ('X' or 'O').
     *
     * @return The current player's symbol.
     */
    char getCurrentPlayer();

    /**
     * Switches to the next player.
     */
    void switchPlayer();
}
