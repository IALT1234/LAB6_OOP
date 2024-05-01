package chessfigure;
import interfaces.IntFigure;
import enumtypes.*;

/** 
 * Represents a generalized version of the chess pieces in the chess game.
 * Defines common features of the chess pieces such as color, column, and row.
 * Each piece type implements the method {@link #moveTo()} where each move is 
 * validated based on the piece type and its respective rules. 
 * 
 * @author Alexa Hernandez, Ivan Luna Torres, Itzel Salazar
 * @version 1.0 (04/30/24)
 */
public class Figure implements IntFigure {  

    protected Piece pieceName;
    protected String color;
    protected Column col;
    protected int row;

    // CONSTRUCTORS
    public Figure() { 
      this.pieceName = Piece.valueOf("QUEEN");
      this.color = "";
      this.col = getColumn();
      this.row = 0;
    }

    public Figure(Piece pieceName, String color, Column col, int row) {
      this.pieceName = pieceName; // enum
      this.color = color;
      this.col = col; // enum
      this.row = row;
    }

    public Figure(String color, Column col, int row) { // constructor wo name
      this.color = color;
      this.col = col; // enum
      this.row = row;
    }

    // GETTERS AND SETTERS
    public String getColor() {
      return color;
    }

    public Column getColumn() { 
      return col; // enum
    }

    public int getRow() {
      return row;
    }

    public String getName() {
      return pieceName.getName();
    }

    public void setColumn(Column col) {
      this.col = col; // enum
    }

    public void setRow(int row) {
      this.row = row;
    } 

    public String toString(String str) {
      return str;
    }

    /** 
     * Checks if the given target position is a valid move for the piece.
     *
     * @param target_column The coordinate for the target column position.
     * @param target_row The coordinate for the target row position.
     * @return True if the move is valid; false otherwise.
     */
    public boolean moveTo(Column target_column, int target_row){
        return false;
    }

}
