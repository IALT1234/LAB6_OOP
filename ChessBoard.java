import enumtypes.Column;
import interfaces.IntChessBoard;

/** 
 * Represents the chessboard for the chess game.
 * Responsible for verifying that the selected piece's position is within valid boundaries of the chessboard.
 * 
 * @author Alexa Hernandez, Ivan Luna Torres, Itzel Salazar
 * @version 1.0 (04/30/24)
*/
public class ChessBoard implements IntChessBoard {
    final int MIN_ROW = 1;
    final int MAX_ROW = 8;

    public ChessBoard() {
      // comment
    }

  /** 
   * Checks if a piece at the given row and column is within the chessboard.
   * 
   * @param row An indexed row coordinate in the chessboard.
   * @param column An indexed column coordinate in the chessboard.
   * @return True if the row and column are within the chessboard; false otherwise.
   */
    public boolean verifyCoordinate(Column col, int row) {
      return row >= MIN_ROW && row <= MAX_ROW && col.getValue() >= MIN_ROW && col.getValue() <= MAX_ROW; // error bc col is of type Column
    }
}
