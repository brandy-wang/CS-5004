import javax.swing.*;


public class TicTacToeGame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create the view
            ITicTacToeView view = new TicTacToeView();

            // Create the controller
            ITicTacToeController controller = new TicTacToeController();

            // Link the controller with the view
            controller.setView(view);

            // Start the game
            controller.startGame();
        });
    }
}
