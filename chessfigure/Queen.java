package chessfigure;
import interfaces.IntBishop;
import enumtypes.Column;
import enumtypes.Piece;

/** 
 * Represents the Queen chess piece. Extends the functionality of the {@link Rook}
 * class and implements the {@link IntBishop} interface. It overrides the moveTo method 
 * to implement the specific movement rules for the Queen piece.
 * 
 * @author Alexa Hernandez, Ivan Luna Torres, Itzel Salazar
 * @version 1.0 (04/30/2024)
 * @see Rook, IntBishop
*/
public class Queen extends Rook implements IntBishop {

    // When overriding moveTo method in Queen, make use of Rook's 
    // moveTo implementation and Bishop's default moveTo implementation 

    public Queen() { 
        this.pieceName = Piece.valueOf("QUEEN"); 
            this.color = "";
            this.col = getColumn();
            this.row = 0;
       }

    public Queen(Piece pieceName, String color, Column col, int row) {
        this.pieceName = pieceName;
      this.color = color;
      this.col = col;
      this.row = row;
    }

  /**
    * Overrides the {@link Rook#moveTo(boolean)} method.
    * Implements the {@link IntBishop#moveToBishop(boolean)} interface.
    *
    * Checks if the given target position is a valid move for the Queen piece.
    * The Queen combines the movement capabilities of Rook and Bishop. The Queen
    * can move in any direction any number of squares. 
    *
    * @param target_column The coordinate for the target column position.
    * @param target_row The coordinate for the target row position.
    * @return True if the Queen can move to the specified position; false otherwise.
    * @see Rook#moveTo(boolean), IntBishop#moveToBishop(boolean)
    */
    @Override 
    public boolean moveTo(Column target_column, int target_row) {
        if (super.moveTo(target_column, target_row) || IntBishop.moveToBishop(col, row, target_column, target_row)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString(String str) {
        return str;
    }

}
