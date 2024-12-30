import javax.swing.*;

public class TicTacToeView implements ITicTacToeView {

    private JFrame mainWindow;
    private JPanel gridButtonLayout;
    private JButton cell;
    private JLabel statusMessages;

    public TicTacToeView() {
        this.initializeView();
    }

    @Override
    public void initializeView() {
        mainWindow = new JFrame("Tic Tac Toe");
        mainWindow.setVisible(true);
    }

    @Override
    public void updateBoard(int row, int col, String symbol) {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void resetBoard() {

    }


    @Override
    public JButton getButton(int row, int col) {
        return null;
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(TicTacToeView::new);
    }
}
