package enumtypes;

/** 
 * Enumeration representing the chess piece type constants used for a chess game. 
*/
public enum Piece {

    QUEEN("Queen"), KING("King"), ROOK("Rook"), BISHOP("Bishop"), KNIGHT("Knight"), PAWN("Pawn");

    private final String nm;

    Piece(String n) {
        nm = n;
    }

    public String getName() {
        return nm;
    }
    

}
