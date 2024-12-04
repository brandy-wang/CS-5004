/**
 * The TTTView interface defines the methods that a View implementation should provide
 * for interacting with the user in a Tic-Tac-Toe game. It is designed to be flexible
 * and adaptable for different environments, such as a text-based console, a GUI-based
 * interface, or a mock implementation for testing purposes.
 */
public interface TTTView {

    /**
     * Displays the current state of the Tic-Tac-Toe board.
     * The board is typically represented as a 3x3 grid, with each cell containing
     * either an "X", "O", or an empty space.
     *
     * @param board A 2D array representing the current state of the Tic-Tac-Toe board.
     *              Each element is either "X", "O", or an empty string ("").
     */
    void displayBoard(String[][] board);

    /**
     * Displays a message to the user. This could be used for general information, instructions,
     * or any other status update that the game needs to communicate.
     *
     * @param message The message to be displayed to the user.
     */
    void displayMessage(String message);

    /**
     * Prompts the user for input, such as making a move in the game.
     * The exact nature of the input (e.g., the format) depends on the specific implementation.
     *
     * @return The input provided by the user. This could be a move in a form like "row,col",
     *         or any other string-based input as per the game’s rules.
     */
    String getUserInput();

    /**
     * Notifies the user about the result of the game, such as when a player wins,
     * when the game ends in a draw, or any other significant event that ends the game.
     *
     * @param resultMessage The result of the game, for example, "Player X wins!" or "It's a draw!".
     */
    void notifyGameResult(String resultMessage);

    /**
     * Notifies the user that it's their turn to make a move in the game.
     * This method provides a message to indicate whose turn it is to play,
     * such as "Player X, it's your turn".
     *
     * @param currentPlayer The player who is currently taking their turn (either "X" or "O").
     */
    void promptForMove(String currentPlayer);

    /**
     * Asks the user if they would like to play again after the current game has ended.
     * This could be a simple yes/no prompt or a more complex decision mechanism depending on the UI.
     *
     * @return true if the user wants to play again, false if they choose not to.
     */
    boolean askToPlayAgain();

    /**
     * Displays an error message to the user. This could be used to inform the user of invalid
     * input, an invalid move, or other error conditions that need to be addressed.
     *
     * @param errorMessage The error message to be displayed.
     */
    void displayError(String errorMessage);
}



