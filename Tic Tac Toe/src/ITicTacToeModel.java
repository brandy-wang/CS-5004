public interface ITicTacToeModel {
    boolean makeMove(int row, int col);
    boolean checkWin();
    boolean isDraw();
    void switchPlayer();
    char getCurrentPlayer();
    char[][] getBoard();
}

