package model;

public class Player {

    private String playerName; // player's user ID
    private int points;        // player's score
    //private String[][] board;  // 2D array(game board)
    private PlayerType symbol;  // Player's symbol ("X" or "O")

    // Constructor to initialize the player with their name and symbol
    // Initializes the player's score to 0 and creates a 3x3 game board.
    public Player(String playerName, PlayerType symbol) {
        this.playerName = playerName; // Set the player's name
        this.symbol = symbol;  // Set the player's symbol ("X" or "O")
        this.points = 0; // Default score is 0
    /*this.board = new String[3][3]; // Initialize a 3x3 game board
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        board[i][j] = "_"; // Set each board position to be empty
      }
    }*/
    }

    /**
     * Get the player's name
     *
     * @return The name of the player
     */
    public String getName() {
        return this.playerName;
    }

    /**
     * Get the player's score
     *
     * @return The current score of the player
     */
    public int getPoints() {
        return this.points;
    }

    /**
     * Add points to the player's score
     *
     * @param points The points to add to the player's current score
     */
    public void addPoints(int points) {
        this.points += points;
    }

    /**
     * Sets the symbol for the player. This symbol will be either "X" or "O", depending on the
     * player's identity.
     *
     * @param symbol the symbol to be assigned to the player ("X" or "O")
     */
    public void setSymbol(PlayerType symbol) {
        this.symbol = symbol;
    }

    /**
     * Gets the symbol representing the player (either "X" or "O").
     *
     * @return the symbol of the player (either "X" or "O").
     */
    public String getSymbol() {
        return this.symbol.getSymbol();  // Return the symbol as a string
    }
}



