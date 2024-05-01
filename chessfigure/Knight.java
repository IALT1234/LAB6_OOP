package chessfigure;
import enumtypes.Column;
import enumtypes.Piece;

/** 
 * Represents the Knight chess piece. Extends the functionality of the {@link Figure} class and 
 * overrides the moveTo method to implement the specific movement rules for the Knight piece. 
 * 
 * @author Alexa Hernandez, Ivan Luna Torres, Itzel Salazar
 * @version 1.0 (04/30/2024)
 * @see Figure
 */
public class Knight extends Figure {

    public Knight(Piece pieceName, String color, Column col, int row) {
      this.pieceName = pieceName;
      this.color = color;
      this.col = col;
      this.row = row;
    }

  /** 
    * Overrides the {@link Figure#moveTo(boolean)} method
    *
    * Checks if the given target position is a valid move for the Knight piece.
    * The Knight can move two squares vertically and one square horizontally or two squares
    * horizontally and one square vertically.
    *
    * @param target_column The coordinate for the target column position.
    * @param target_row The coordinate for the target row position.
    * @return True if the Knight can move to the specified position; false otherwise.
    * @see Figure#moveTo(boolean)
    */
    @Override 
    public boolean moveTo(Column target_column, int target_row) {
        if ((Math.abs(col.getValue() - target_column.getValue()) == 2 && Math.abs(row - target_row) == 1) || 
        (Math.abs(col.getValue() - target_column.getValue()) == 1 && Math.abs(row - target_row) == 2)) {
            return true;
        }
        return false;
    }

    
    @Override
    public String toString(String str) {
        return str;
    }

}
