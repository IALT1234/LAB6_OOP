package Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChessGameMainFrameTest {
    @Test
    public void testFinalPositionTypeAndLimits() {
        ChessGameMainFrame frame = new ChessGameMainFrame();
        assertTrue(frame.isValid(2, 3)); // Same position
        assertTrue(frame.isValid(6, 6)); // Valid position
        assertFalse(frame.isValid(8, 5)); // 
        assertFalse(frame.isValid(20, 5)); // Invalid position, expect false
    }
    @Test
    public void test_Same_Initial_and_Final() {
        ChessGameMainFrame frame = new ChessGameMainFrame();
        assertFalse(frame.samePositions(1, 3, 2, 4)); // Different positions
        assertFalse(frame.samePositions(4, 2, 2, 4));
        assertFalse(frame.samePositions(5, 4, 3, 1));
        assertFalse(frame.samePositions(3, 6, 3, 2)); 



        assertTrue(frame.samePositions(1, 3, 1, 3)); //Same positions
        assertTrue(frame.samePositions(0, 0, 0, 0)); //Same positions
        assertTrue(frame.samePositions(7, 7, 7, 7)); //Same positions
        assertTrue(frame.samePositions(3, 5, 3, 5)); //Same positions

    }
}
