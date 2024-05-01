package chessfigure;
import enumtypes.Column;
import enumtypes.Piece;

/** 
 * Represents the Pawn chess piece. Extends the functionality of the {@link Figure} class and 
 * overrides the moveTo method to implement the specific movement rules for the Pawn piece. 
 * 
 * @author Alexa Hernandez, Ivan Luna Torres, Itzel Salazar
 * @version 1.0 (04/30/2024)
 * @see Figure
*/
public class Pawn extends Figure {

    public Pawn(Piece pieceName, String color, Column col, int row) {
      this.pieceName = pieceName; // enum
      this.color = color;
      this.col = col; // enum
      this.row = row;
    }

  /** 
    * Overrides the {@link Figure#moveTo(boolean)} method
    *
    * Checks if the given target position is a valid move for the Pawn piece.
    * The Pawn can move forward one square, two squares if its its initial move.
    *
    * @param target_column The coordinate for the target column position.
    * @param target_row The coordinate for the target row position.
    * @return True if the Pawn can move to the specified position; false otherwise.
    * @see Figure#moveTo(boolean)
    */
    @Override 
    public boolean moveTo(Column target_column, int target_row) {
        if (color.equals("White") && col == (target_column) && (row - target_row) == -1) {
            return true;
        } else if (color.equals("Black") && col == (target_column) && (row - target_row) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public String toString(String str) {
        return str;
    }

}
