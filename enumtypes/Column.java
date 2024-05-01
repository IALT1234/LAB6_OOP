package enumtypes;

/** 
 * Enumeration representing the columns on the chessboard.  
 * 
 * Represents the column constants identifiers for the chessboard which can be identified 
 * by the letters A to H (A being the leftmost and H being the rightmost).
*/
public enum Column {
  
    a(0), b(1), c(2), d(3), e(4), f(5), g(6), h(7);

    private final int value;
    
    private Column(int n) {
        value = n;
    }

    public int getValue() {
        return value;
    }
  
    /**
     * Gets the corresponding Column enumerated value from the integer.
     * 
     * @param value The integer value of the column
     * @return The column object representing the chessboard's column.
     * @throws IllegalArgumentException if the column is not within the chessboard's range
     */
    public static Column getColumnFromValue(int value) {
        for (Column column : Column.values()) {
            if (column.getValue() == value) {
                return column;
            }
        }
        throw new IllegalArgumentException("No column found for value: " + value);
    }

    /**
     * Gets the corresponding Column enumerated value from the given character.
     * 
     * @param ch The character value of the column
     * @return The column object representing the chessboard's column obtained from the given character.
     * @throws IllegalArgumentException if the column is not within the chessboard's range.
     */
    public static Column getColumnFromChar(char ch) {
        // Iterate over the enum constants
        for (Column column : Column.values()) {
            // Compare the name of each enum constant with the given character
            if (column.name().equalsIgnoreCase(String.valueOf(ch))) {
                return column;
            }
        }

        // If no match found, throw an exception
        throw new IllegalArgumentException("Invalid column character: " + ch);
    }
}
