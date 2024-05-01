package interfaces;
import enumtypes.Column;

/** 
 * Represents the chess board interface for the chess game.
 * 
 * @author Alexa Hernandez, Ivan Luna Torres, Itzel Salazar
 * @version 1.0 (04/30/24)
 */
public interface IntChessBoard {
    
    /**
     * Checks if a piece at the given row and column is within the chessboard.
     * 
     * @param col An indexed column coordinate in the chessboard.
     * @param row An indexed row coordinate in the chessboard.
     * @return True if the row and column are within the chessboard; false otherwise.
     */
    boolean verifyCoordinate(Column col, int row); // verifies that the coordinates are within the chessboard

}
