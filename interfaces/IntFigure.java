package interfaces;
import enumtypes.Column;

/** 
 * Represents the interface that the chess pieces should implement to their own specifications.
 * 
 * @author Alexa Hernandez, Ivan Luna Torres, Itzel Salazar
 * @version 1.0 (04/30/24)
 */
public interface IntFigure {

    /** 
      * Checks if the given target position is a valid move for the piece.
      *
      * @param col The starting coordinate for the column position.
      * @param row The starting coordinate for the row position.
      * @return True if the move is valid; false otherwise.
      */
    boolean moveTo(Column col, int row);

}
