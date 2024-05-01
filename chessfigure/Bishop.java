package chessfigure;
import enumtypes.Column;
import enumtypes.Piece;

/** 
 * Represents the Bishop chess piece. Extends the {@link Figure} class and overrides 
 * the moveTo method to implement the specific movement rules for the Bishop.
 * 
 * @author Alexa Hernandez, Ivan Luna Torres, Itzel Salazar
 * @version 1.0 (04/30/2024)
 * @see Figure
*/
public class Bishop extends Figure {

    public Bishop() {
        this.pieceName = Piece.valueOf("ROOK"); // enum error HERE
        this.color = "";
        this.col = getColumn(); // enum
        this.row = 0;
    }

    public Bishop(Piece pieceName, String color, Column col, int row) {
        this.pieceName = pieceName; // enum
        this.color = color;
        this.col = col; // enum
        this.row = row;
    }

    /**
    * Overrides the {@link Figure#moveTo(boolean)} method
    *
    * Checks if the given target position is a valid move for the Bishop piece.
    * The Bishop can move diagonally in any direction but cannot jump over any pieces. 
    *
    * @param target_column The coordinate for the target column position.
    * @param target_row The coordinate for the target row position.
    * @return True if the Bishop can move to the specified position; false otherwise.
    * @see Figure#moveTo(boolean)
    */
    @Override
    public boolean moveTo(Column target_column, int target_row) {
        if (Math.abs(col.getValue() - ((target_column.getValue()))) == Math.abs(row - ((target_row)))) {
            System.out.println(Math.abs(col.getValue() - ((target_column.getValue()))) == Math.abs(row - ((target_row))));
            return true;
        }
        System.out.println(Math.abs(col.getValue() - target_column.getValue())); // errors are due to col being type Column
        System.out.println(Math.abs(row - target_row));
        return false;
    }

    @Override
    public String toString(String str) {
        return str;
    }

}


//package chessfigure;
//import enumtypes.Column;
//import enumtypes.Piece;
//import interfaces.IntBishop;
//
//public class Bishop implements IntBishop {
//    protected Piece pieceName; // enum
//    protected String color;
//    protected Column col; // enum
//    protected int row;
//
//    public Bishop() {
//        this.pieceName = Piece.valueOf("QUEEN"); // enum error HERE
//        this.color = "";
//        this.col = getColumn(); // enum
//        this.row = 0;
//    }
//    public Bishop(Piece pieceName, String color, Column col, int row) {
//      this.pieceName = pieceName; // enum
//      this.color = color;
//      this.col = col; // enum
//      this.row = row;
//    }
//    public String getColor() {
//        return color;
//      }
//
//      public Column getColumn() {
//        return col; // enum
//      }
//
//      public int getRow() {
//        return row;
//      }
//
//      public String getName() {
//        return pieceName.getName();
//      }
//
//      public boolean moveToBishop(Column col, int row, Column target_column, int target_row) {
//        if (Math.abs(col.getValue() - ((target_column.getValue()))) == Math.abs(row - ((target_row)))) {
//            System.out.println(Math.abs(col.getValue() - ((target_column.getValue()))) == Math.abs(row - ((target_row))));
//            return true;
//        }
//        System.out.println(Math.abs(col.getValue() - target_column.getValue())); // errors are due to col being type Column
//        System.out.println(Math.abs(row - target_row));
//        return false;
//    }
//    // The class implementing IntBishop is Queen and IntBishop has default method
//    // Create class Bishop that implements interface. Default method already defines this.
//
//    // public boolean moveTo(int column, int row, int target_column, int target_row) {
//    //     if (Math.abs(column - ((target_column))) == Math.abs(row - ((target_row)))) {
//    //         System.out.println(Math.abs(column - ((target_column))) == Math.abs(row - ((target_row))));
//    //         return true;
//    //     }
//    //     System.out.println(Math.abs(column - target_column));
//    //     System.out.println(Math.abs(row - target_row));
//    //     return false;
//    // }
//
//}
