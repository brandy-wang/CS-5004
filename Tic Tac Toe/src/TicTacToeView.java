import javax.swing.*;
import java.awt.*;


public class TicTacToeView implements ITicTacToeView {

    private JFrame mainWindow;
    private JPanel gridButtonLayout;
    private JButton[][] buttons;
    private JLabel statusMessages;

    public TicTacToeView() {
        this.initializeView();
    }

    @Override
    public void initializeView() {
        mainWindow = new JFrame("Tic Tac Toe");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(400, 400);
        mainWindow.setLayout(new BorderLayout());

        // Status message label
        statusMessages = new JLabel("Welcome to Tic Tac Toe!", SwingConstants.CENTER);
        mainWindow.add(statusMessages, BorderLayout.NORTH);

        // Grid layout for buttons
        gridButtonLayout = new JPanel();
        gridButtonLayout.setLayout(new GridLayout(3, 3));
        buttons = new JButton[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(new Font("Arial", Font.BOLD, 40));
                gridButtonLayout.add(buttons[i][j]);
            }
        }

        mainWindow.add(gridButtonLayout, BorderLayout.CENTER);
        mainWindow.setVisible(true);
    }

    @Override
    public void updateBoard(int row, int col, String symbol) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
            buttons[row][col].setText(symbol);
        }
    }

    @Override
    public void showMessage(String message) {
        statusMessages.setText(message);
    }

    @Override
    public void resetBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
            }
        }
        statusMessages.setText("Board reset. Let's play again!");
    }

    @Override
    public JButton getButton(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
            return buttons[row][col];
        }
        return null;
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(TicTacToeView::new);
    }
}