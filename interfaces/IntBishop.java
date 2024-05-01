package interfaces;
import enumtypes.Column;

/** 
 * Represents the interface that a Bishop chess piece  class should implement to its own specifications.
 * 
 * @author Alexa Hernandez, Ivan Luna Torres, Itzel Salazar
 * @version 1.0 (04/30/24)
 */
public interface IntBishop {

    /**
     * Checks if the given target position is a valid move for the Bishop piece.
     * The Bishop can move diagonally in any direction but cannot jump over any pieces.
     *  
     * @param col The starting coordinate for the column position.
     * @param row The starting coordinate for the row position.
     * @param target_column The coordinate for the target column position.
     * @param target_row The coordinate for the target row position.
     * @return True if the Bishop can move to the specified position; false otherwise.
     */
    static boolean moveToBishop(Column col, int row, Column target_column, int target_row) {
        if (Math.abs(col.getValue() - ((target_column.getValue()))) == Math.abs(row - ((target_row)))) {
            System.out.println(Math.abs(col.getValue() - ((target_column.getValue()))) == Math.abs(row - ((target_row))));
            return true;
        } 
        System.out.println(Math.abs(col.getValue() - target_column.getValue())); // errors are due to col being type Column
        System.out.println(Math.abs(row - target_row));
        return false;
    }

    // boolean moveToBishop();

}

// Extra Credit : do 6(f) as follows: Create interface “IntBishop” which is not related to IntFigure 
// and define a default method moveTo - you provide the implementation here.
