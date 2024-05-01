package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import chessfigure.*;
import enumtypes.*;

public class ChessGame extends JFrame {
    // buttons
    private JButton selectButton;
    private JButton moveButton;

    //
    private JLabel chessPieceLabel;
    private JPanel canvasPanel;



    // dropdown menu
    private JComboBox<String> chessPieceSelector;
    private JComboBox<String> colorSelector;

    // NOTES: to reset the board you can use the .clear

    public ChessGame() {
        setTitle("CHESS GAME");
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);

        // select piece with drop down menu
        // should we prompt user prompt user for move coordinates
        // new move button

        // Create components
        selectButton = new JButton("Select");
        moveButton = new JButton("New Move");
        chessPieceLabel = new JLabel();
        chessPieceLabel.setIcon(new ImageIcon("apple.png"));

        // Create JComboBox for Chess Piece selection
        String[] chessPieces = {"Bishop", "Pawn", "Knight", "King", "Queen"};
        chessPieceSelector = new JComboBox<>(chessPieces);

        // Create JComboBox for Color selection
        String[] pieceColor = {"White", "Black "};
        colorSelector = new JComboBox<>(pieceColor);

        // Set layout for the frame
        setLayout(new BorderLayout());

        // Create canvas panel with a checkered background
        canvasPanel = new JPanel(new GridLayout(2, 2)) { // edited here to try and create the grid layour
            @Override
            protected void paintComponent(Graphics g) {

                Color green = new Color(119, 149, 86);
                // Color beige = new Color(242, 240, 216);

                super.paintComponent(g);
                g.setColor(green);
                g.fillRect(0, 0, getWidth(), getHeight());

                // TO-DO: Make it in a checkered pattern ala chess.com
            }
        };

        // Set layout for the canvas panel
        canvasPanel.setLayout(null);
        canvasPanel.add(chessPieceLabel);

        // Create panel for buttons and selector
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(chessPieceSelector);
        buttonPanel.add(colorSelector);
        buttonPanel.add(selectButton);
        buttonPanel.add(moveButton);

        // Add components to the frame
        add(canvasPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Add action listeners
        moveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveChessPieceToTargetLocation();
            }
        });

        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeChessPieceIconFromSelector();
            }
        });
    }

    private void moveChessPieceToTargetLocation() {
        Random rand = new Random();
        int canvasWidth = canvasPanel.getWidth();
        int canvasHeight = canvasPanel.getHeight();
        int maxX = canvasWidth - chessPieceLabel.getWidth();
        int maxY = canvasHeight - chessPieceLabel.getHeight();

        int newX = rand.nextInt(maxX);
        int newY = rand.nextInt(maxY);

        chessPieceLabel.setBounds(newX, newY, chessPieceLabel.getIcon().getIconWidth(),
                chessPieceLabel.getIcon().getIconHeight());
        canvasPanel.repaint();
    }

    private void changeChessPieceIconFromSelector() {
        String selectedChessPiece = (String) chessPieceSelector.getSelectedItem();
        if (selectedChessPiece != null) {
            switch (selectedChessPiece) {
                case "Pawn":
                    chessPieceLabel.setIcon(new ImageIcon("pawn.png"));
                    break;
                case "Knight":
                    chessPieceLabel.setIcon(new ImageIcon("knight.png"));
                    break;
                case "Bishop":
                    chessPieceLabel.setIcon(new ImageIcon("bishop.png"));
                    break;
                case "King":
                    chessPieceLabel.setIcon(new ImageIcon("king.png"));
                    break;
                case "Queen":
                    chessPieceLabel.setIcon(new ImageIcon("queen.png"));
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Invalid chess piece selection.");
            }
        }
    }

    // gustavo put his chessboard in this file

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ChessGame app = new ChessGame(); // Corrected class name here
                app.setVisible(true);

            }
        });
    }
}
