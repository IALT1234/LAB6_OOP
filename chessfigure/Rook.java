package chessfigure;
import enumtypes.Column;
import enumtypes.Piece;

/** 
 * Represents the Rook chess piece. Extends the functionality of the {@link Figure} class and 
 * overrides the moveTo method to implement the specific movement rules for the Rook piece.
 * 
 * @author Alexa Hernandez, Ivan Luna Torres, Itzel Salazar
 * @version 1.0 (04/30/2024)
 * @see Figure
*/
public class Rook extends Figure {

 public Rook() { 
  this.pieceName = Piece.valueOf("ROOK");
      this.color = "";
      this.col = getColumn();
      this.row = 0;
 }

  public Rook(Piece pieceName, String color, Column col, int row) {
      this.pieceName = pieceName;
      this.color = color;
      this.col = col;
      this.row = row;
    }

   /**
    * Overrides the {@link Figure#moveTo(boolean)} method
    *
    * Checks if the given target position is a valid move for the Rook piece.
    * The Rook can move horizontally and vertically any number of squares.
    *
    * @param target_column The coordinate for the target column position.
    * @param target_row The coordinate for the target row position.
    * @return True if the Rook can move to the specified position; false otherwise.
    * @see Figure#moveTo(boolean)
    */
  @Override
  public boolean moveTo(Column target_column, int target_row) {
    if (col == (target_column) || row == (target_row)) {
      return true;
    }
    return false;
  }

  @Override
  public String toString(String str) {
    return str;
  }

}
