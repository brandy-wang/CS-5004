package model;

/**
 * Enum to represent the type of player (X or O).
 * This enum is used to distinguish between the two players in the game.
 */
public enum PlayerType {

    X("X"),  // Represents player X
    O("O");  // Represents player O

    private final String symbol; // The symbol associated with the player

    // Constructor to initialize the symbol
    PlayerType(String symbol) {
        this.symbol = symbol;
    }

    /**
     * Gets the symbol of the player.
     *
     * @return the symbol associated with the player (either "X" or "O")
     */
    public String getSymbol() {
        return this.symbol;
    }
}