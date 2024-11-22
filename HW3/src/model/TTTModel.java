package model;

/**
 * The TTTModel interface defines the main functions for the game.
 * It is implemented by a class that handles the game logic.
 */

//Design Decision: This interface hides the model's details and exposes only what the controller needs.
public interface TTTModel {

    /**
     * Initializes the game with two players.
     * @param player1 the first player
     * @param player2 the second player
     *
     */
    //Design Decision: This method accepts two player objects for easy management.
    void initializeGame(model.Player player1, model.Player player2);

    // Pros: Clean separation of concerns.
    // Cons: Changing player logic may require updates in both Player and TTTModel.

    /**
     * Switches the turn between players.
     *
     */
    //Design Decision: This method allows the controller to switch turns without worrying about details.
    void switchTurn();

    // Pros: Simplifies turn management in the controller.
    // Cons: Changes to turn logic could require more updates in the interface.

    /**
     * Makes a move for the current player on the board.
     * @param row the row where the move will be made
     * @param col the column where the move will be made
     * @throws IllegalStateException if the move is illegal, e.g., if the game is over or the cell is already occupied
     * @throws IllegalArgumentException if the row or column is invalid
     * @return true if the move is valid
     */
    //Design Decision: An exception is thrown for illegal moves, making it easier for the controller to handle errors.
    boolean makeMove(int row, int col) throws IllegalStateException,IllegalArgumentException;

    // Pros: Centralizes error handling in the model.
    // Cons: Exception handling adds complexity for the controller.

    // How certain exceptions are prevented/avoided:
    // 1. IllegalStateException: Prevented by checking game state (e.g., whether the game is over) before processing a move.
    // 2. IllegalArgumentException: Prevented by validating the row and column input before processing the move (ensuring values are within bounds).


    /**
     * Checks if the game is over.
     * @return true if the game is over
     *
     */
    //Design Decision: This method provides a simple boolean to check if the game is over.
    boolean isGameOver();

    // Pros: Simple for the controller to use.
    // Cons: Doesn't explain why the game ended or provide additional details.

    /**
     * Gets the name of the current player.
     * @return the current player's name
     *
     */
    //Design Decision: This method lets the controller get the player's name without accessing player objects directly.
    String getCurrentPlayerName();

    // Pros: Keeps the controller simple and decouples from the Player class.
    // Cons: Doesn't provide detailed player information, only the name.

    /**
     * Displays the current game board.
     *
     */
    //Our game board is represented as 2D array
    //Design Decision: This method shows the board which is represented as 2D array without revealing internal details.
    void displayBoard();

    // Pros: Keeps view and model separated.
    // Cons: Limited to basic display, no advanced features like graphics.

    /**
     * Gets the winner of the game, if any.
     * @return the winning player, or null if there is no winner yet
     *
     */
    //Design Decision: This method provides a way for the controller to access the winning player, if applicable.
    model.Player getWinner();

    // Pros: Enables the controller to easily access the winning player.
    // Cons: Additional logic in the implementing class to determine the winner.
}


