package chessfigure;
import enumtypes.Column;
import enumtypes.Piece;

/** 
 * Represents the King chess piece. Extends the functionality of {@link Queen} class and overrides 
 * the moveTo method to implement the specific movement rules for the King piece.
 * 
 * @author Alexa Hernandez, Ivan Luna Torres, Itzel Salazar
 * @version 1.0 (04/30/2024)
 * @see Queen
*/
public class King extends Queen {

  public King(Piece pieceName, String color, Column col, int row) {
    this.pieceName = pieceName; // enum
    this.color = color;
    this.col = col; // enum
    this.row = row;
}

    /**
      * Overrides the {@link Figure#moveTo(boolean)} method
      *
      * Checks if the given target position is a valid move for the King piece.
      * The King can move one square in any direction. 
      *
      * @param target_column The coordinate for the target column position.
      * @param target_row The coordinate for the target row position.
      * @return True if the King can move to the specified position; false otherwise.
      * @see Figure#moveTo(boolean)
      */
    @Override 
    public boolean moveTo(Column target_column, int target_row) {
        if ((target_column.getValue() - col.getValue() == 1)|| (target_row - row == 1)) {
          return true; // error bc of col is of Column type
        }
        return false;
      }

}
