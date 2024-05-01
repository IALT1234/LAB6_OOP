package Game;

import chessfigure.*;
import enumtypes.Column;
import enumtypes.Piece;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class ChessGameMainFrame extends JFrame implements ActionListener {

    // dropdown menu
    private JComboBox<String> chessPieceSelector;
    private JComboBox<String> colorSelector;

    JPanel panel, chessboardPanel;
    JLabel labelPosX, labelPosY;
    JTextField textFieldPosX, textFieldPosY; // Changed from JTextArea to JTextField
    JButton selectButton;
    JButton moveButton;
    Tile[][] boardCells = new Tile[8][8];
    HashMap<String, Figure> set = new HashMap<>();
    // ChessBoard brd = ChessBoard();

    public ChessGameMainFrame() {
        setTitle("CHESS GAME");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        panel = new JPanel(new BorderLayout()); // Use BorderLayout for the main panel
        chessboardPanel = new JPanel(new BorderLayout()); // Use BorderLayout for the main panel
        chessboardPanel.setLayout(new GridLayout(8, 8));

        // Create JComboBox for Chess Piece selection
        String[] chessPieces = {"Bishop", "Pawn", "Knight", "King", "Queen"};
        chessPieceSelector = new JComboBox<>(chessPieces);

        // Create JComboBox for Color selection
        String[] pieceColor = {"White", "Black "};
        colorSelector = new JComboBox<>(pieceColor);



        labelPosX = new JLabel("Column:");
        textFieldPosX = new JTextField(5); // Create JTextField for user input
        labelPosY = new JLabel("Row:");
        textFieldPosY = new JTextField(5); // Create JTextField for user input

        selectButton = new JButton("Select");
        // moveButton = new JButton("New Move");

        // boardCells = new Tile[8][8];
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Color backgroundColor = (row + col) % 2 == 0 ? Color.WHITE : Color.GRAY;
                Tile tile = new Tile(backgroundColor);
                boardCells[row][col] = tile;
                chessboardPanel.add(tile);
            }
        }

//        moveButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                moveChessPieceToTargetLocation();
//            }
//        });

        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeChessPieceIconFromSelector();
            }
        });

        // Create panel for buttons and selector
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(chessPieceSelector);
        buttonPanel.add(colorSelector);
        buttonPanel.add(labelPosX);
        buttonPanel.add(textFieldPosX); // Add textFieldPosX
        buttonPanel.add(labelPosY);
        buttonPanel.add(textFieldPosY); // Add textFieldPosY
        buttonPanel.add(selectButton);
        // buttonPanel.add(moveButton);


        // Add components to the frame


        panel.add(buttonPanel, BorderLayout.SOUTH);
        panel.add(chessboardPanel, BorderLayout.CENTER);

        add(panel);


        setLocationRelativeTo(null);
        setSize(700, 700); // Increase height to accommodate text fields
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


//    private void moveChessPieceToTargetLocation() {
////        String result = (String)JOptionPane.showInputDialog(
////               panel,
////               "Input target position.",
////               "New Move",
////               JOptionPane.PLAIN_MESSAGE,
////               null,
////               null,
////               "a 2"
////            );
////        System.out.println(result);
////        String[] user_input3 = result.split(" ");
////        Figure curr = set.get((String) chessPieceSelector.getSelectedItem());
////        if (curr.moveTo(Column.valueOf(user_input3[0]), Integer.parseInt(user_input3[1]))) {
////                        String finalMessg = (curr.getName() + " in position " + curr.getColumn().getValue() + ", " +  curr.getRow() + " can move to position " + user_input3[0] + ", " + user_input3[1] + "\n\n");
////                        JOptionPane.showMessageDialog(null, finalMessg);
////        } else {
////            String finalMessg = (curr.getName() + " in position " + curr.getColumn().getValue() + ", " +  curr.getRow() + " cannot move to position " + user_input3[0] + ", " + user_input3[1] + "\n\n");
////            JOptionPane.showMessageDialog(null, finalMessg);
////
////        }
////        curr.setRow(user_input3[0].charAt(0)-'a');
////        curr.setColumn(Column.valueOf(user_input3[1]));
////        boardCells[user_input3[0].charAt(0)-'a'][Integer.parseInt(user_input3[1])].setPieceIcon(icon);
//
////        String[] user_input3 = result.split(" ");
////        String finalMessg = "";
////        // try {
////            // if (input verification) {
////                for (Map.Entry<String, Figure> set1 :
////                        set.entrySet()) {
////                    Figure curr = set1.getValue();
////                    if (curr.moveTo(Column.valueOf(user_input3[0]), Integer.parseInt(user_input3[1]))) {
////                        finalMessg += (curr.getName() + " in position " + curr.getColumn().getValue() + ", " +  curr.getRow() + " can move to position " + user_input3[0] + ", " + user_input3[1] + "\n\n");
////                    } else {
////                        finalMessg += (curr.getName() + " in position " + curr.getColumn().getValue() + ", " +  curr.getRow() + " cannot move to position " + user_input3[0] + ", " + user_input3[1] + "\n\n");
////                    }
////                }
////
////            // }
// //        JOptionPane.showMessageDialog(null, finalMessg);
//        System.out.println("Test");
//    }

    private void changeChessPieceIconFromSelector() {
        String selectedChessPiece = (String) chessPieceSelector.getSelectedItem();
        String posX = textFieldPosX.getText();
        String posY = textFieldPosY.getText();



        int row = Integer.parseInt(posY);
        // int col = Integer.parseInt(posX);
        // Column colN = Column.getColumnFromValue(col); use if input is integer


        if(posX.length() != 1 || !Character.isLetter(posX.charAt(0)) || !Character.isLowerCase(posX.charAt(0))) {
            JOptionPane.showMessageDialog(null, "Invalid column input. Please enter a single lowercase letter (a-h) for the column.");
            return; // Exit the method if the column input is invalid
        }

        Column colN = Column.valueOf(posX);

        String iconName ;
        String iconPath;
        String finalMessg = "";
        ImageIcon icon = new ImageIcon("./art./BB.gif");
        boolean corrct = false;
        Figure c1;


        if(!isValid(colN.getValue(), row)){
            JOptionPane.showMessageDialog(null, "Out of bounds!");
        }

        else if (selectedChessPiece != null) {
            switch (selectedChessPiece) {
                case "Pawn":
                    // chessPieceLabel.setIcon(new ImageIcon("pawn.png"));
                    //System.out.println(colorSelector.getSelectedItem().toString() );
                    iconName = "BP.gif";
                    if (colorSelector.getSelectedItem().toString().equals("White")) {
                        iconName = "WP.gif";
                    }
                    iconPath = "./art/" + iconName;
                    icon = new ImageIcon(iconPath);
                    c1 = new Pawn(Piece.PAWN, colorSelector.getSelectedItem().toString(),colN,row);
                    if (set.containsKey(selectedChessPiece)) {
                        JOptionPane.showMessageDialog(null, "Piece is already used");
                    } else {
                        boardCells[row][posX.charAt(0)-'a'].setPieceIcon(icon);
                        set.put(selectedChessPiece, c1);
                    }
                    corrct = true;
                    break;
                case "Knight":
                    iconName = "BN.gif";
                    if (colorSelector.getSelectedItem().toString().equals("White")) {
                        iconName = "WN.gif";
                    }
                    iconPath = "./art/" + iconName;
                    icon = new ImageIcon(iconPath);
                    c1 = new Knight(Piece.KNIGHT, colorSelector.getSelectedItem().toString(),colN,row);
                    if (set.containsKey(selectedChessPiece)) {
                        JOptionPane.showMessageDialog(null, "Piece is already used");
                    } else {
                        boardCells[row][posX.charAt(0)-'a'].setPieceIcon(icon);
                        set.put(selectedChessPiece, c1);
                    }
                    corrct = true;
                    break;
                case "Bishop":
                    // chessPieceLabel.setIcon(new ImageIcon("bishop.png"));
                    iconName = "BB.gif";
                    if (colorSelector.getSelectedItem().toString().equals("White")) {
                        iconName = "WB.gif";
                    }
                    iconPath = "./art/" + iconName;
                    icon = new ImageIcon(iconPath);
                    c1 = new Bishop(Piece.BISHOP, colorSelector.getSelectedItem().toString(),colN,row);
                    if (set.containsKey(selectedChessPiece)) {
                        JOptionPane.showMessageDialog(null, "Piece is already used");
                    } else {
                        boardCells[row][posX.charAt(0)-'a'].setPieceIcon(icon);
                        set.put(selectedChessPiece, c1);
                    }
                    corrct = true;
                    break;
                case "King":
                    iconName = "BK.gif";
                    if (colorSelector.getSelectedItem().toString().equals("White")) {
                        iconName = "WK.gif";
                    }
                    iconPath = "./art/" + iconName;
                    icon = new ImageIcon(iconPath);
                    c1 = new King(Piece.KING, colorSelector.getSelectedItem().toString(),colN,row);
                    if (set.containsKey(selectedChessPiece)) {
                        JOptionPane.showMessageDialog(null, "Piece is already used");
                    } else {
                        boardCells[row][posX.charAt(0)-'a'].setPieceIcon(icon);
                        set.put(selectedChessPiece, c1);
                    }
                    corrct = true;
                    // chessPieceLabel.setIcon(new ImageIcon("king.png"));
                    break;
                case "Queen":
                    // chessPieceLabel.setIcon(new ImageIcon("queen.png"));
                    iconName = "BQ.gif";
                    if (colorSelector.getSelectedItem().toString().equals("White")) {
                        iconName = "WQ.gif";
                    }
                    iconPath = "./art/" + iconName;
                    icon = new ImageIcon(iconPath);
                    c1 = new Queen(Piece.QUEEN, colorSelector.getSelectedItem().toString(),colN,row);
                    if (set.containsKey(selectedChessPiece)) {
                        JOptionPane.showMessageDialog(null, "Piece is already used");
                    } else {
                        boardCells[row][posX.charAt(0)-'a'].setPieceIcon(icon);
                        set.put(selectedChessPiece, c1);
                    }
                    corrct = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Invalid chess piece selection.");
            }
        }
        if (corrct) {
            String result = (String)JOptionPane.showInputDialog(
                    panel,
                    "Input target position.",
                    "New Move",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    null,
                    "a 2"
            );

            System.out.println(result);
            String[] user_input3 = result.split(" ");
            Figure curr = set.get((String) chessPieceSelector.getSelectedItem());
            Column final_pos = Column.valueOf(user_input3[0]);
            if(samePositions(colN.getValue(), row,final_pos.getValue(), Integer.parseInt(user_input3[1]))){
                JOptionPane.showMessageDialog(null, "Same position as initial.");
            }

            else if (curr.moveTo(Column.valueOf(user_input3[0]), Integer.parseInt(user_input3[1]))) {
                finalMessg = (curr.getName() + " in position " + curr.getColumn().getValue() + ", " +  curr.getRow() + " can move to position " + user_input3[0] + ", " + user_input3[1] + "\n\n");
                // JOptionPane.showMessageDialog(null, finalMessg);
                curr.setRow(Integer.parseInt(user_input3[1]));
                curr.setColumn(Column.getColumnFromChar(user_input3[0].charAt(0)));
                boardCells[row][posX.charAt(0)-'a'].clearPieceIcon();
                boardCells[Integer.parseInt(user_input3[1])][user_input3[0].charAt(0)-'a'].setPieceIcon(icon);
            } else {
                finalMessg = (curr.getName() + " in position " + curr.getColumn().getValue() + ", " +  curr.getRow() + " cannot move to position " + user_input3[0] + ", " + user_input3[1] + "\n\n");
                // JOptionPane.showMessageDialog(null, finalMessg);
            }
            int choice = JOptionPane.showOptionDialog(null, finalMessg, "Results",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[]{"New Piece", "Terminate"}, null);

            // Check the user's choice
            if (choice == 0) {
                // "New Piece" button clicked
                // Perform actions for "New Piece" button
                System.out.println("New Piece button clicked");
            } else if (choice == 1) {
                System.exit(0);
            }
        }

    }
    public static void main(String[] args) {
        ChessGameMainFrame cgMainFrame = new ChessGameMainFrame();
    }


    public boolean isValid(int initial_col, int initial_row){
        return initial_col >= 0 && initial_col <= 7 && initial_row >= 0 && initial_row <= 7;
    }
    public boolean samePositions(int initial_col, int initial_row,int final_col, int final_row){
        return initial_col == final_col && initial_row == final_row ;
    }




    @Override
    public void actionPerformed(ActionEvent e) {
//        String selectedPiece = (String) pieceList.getSelectedItem();
//        String posX = textFieldPosX.getText();
//        String posY = textFieldPosY.getText();
//
//        int row = Integer.parseInt(posY);
//        int col = Integer.parseInt(posX);
//
//        if (row >= 0 && row < 8 && col >= 0 && col < 8) {
//            String iconName = "BB.gif";
//            String iconPath = "./art/" + iconName;
//            ImageIcon icon = new ImageIcon(iconPath);
//            boardCells[row][col].setPieceIcon(icon);
//
//        } else {
//            JOptionPane.showMessageDialog(this, "Invalid position!");
//        }
        System.out.println("girl idk");
    }
}