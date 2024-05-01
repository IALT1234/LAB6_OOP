import enumtypes.*;
import chessfigure.*;

import java.util.Scanner;
public class Lab4 {

//
//
//  public static boolean inputVerification(String[] userI, Figure[] figures, int ln) {
//      try {
//        if (userI.length != 2) {
//            throw new Exception("User input doesn't have exactly 2 elements separated by a space" + "\n\n");
//        }
//        // String color = userI[0];
//        String piece = userI[1];
//
//        Piece.valueOf(piece.toUpperCase());
//        }  catch (IllegalArgumentException e) {
//            System.out.print("Given elements are not a valid color (White/Black) or a valid piece  (Queen, King, Rook, Bishop, Knight, Pawn)" + "\n\n");
//            System.out.print(e + "\n\n");
//            return false;
//        } catch (Exception e) {
//            System.out.print(e + "\n\n");
//            return false;
//        }
//      for (int j = 0; j < ln; j++) {
//        if (userI[1].equalsIgnoreCase(figures[j].getName())) {
//          // System.out.print("plsdfmakfg");
//            return false;
//        }
//      }
//      return true;
//  }
//
//
    public static void main(String[] args) {
        System.out.println("Commented everything so it would compile.");

    }
//      Bishop bs1 = new Bishop();
//      ChessBoard brd = new ChessBoard();
//      int strLen = 0;
//      //String[] pieces_array = new String[5];
//      // ChessBoard chessboard = new ChessBoard();
//      Figure[] pieces_array = new Figure[6];
//      Scanner sc ;
//      String[] user_input;
//
//      while ((true && strLen <5 )|| bs1.getColor().equals("")) {
//        sc = new Scanner(System.in);
//        System.out.print("\nSelect a chess piece and color (Ex. White Bishop) or type STOP: " + "\n\n");
//        user_input = sc.nextLine().split(" ");
//
//        //System.out.print("Length: " + strLen);
//
//        if (user_input[0].equals("STOP")) {
//          // break while loop
//          break;
//        }
//
//
//        if (inputVerification(user_input, pieces_array, strLen)) {
//          // pieces_array[strLen] = Piece()
//
//          Scanner sc1 = new Scanner(System.in);
//          System.out.print("\nEnter the piece's position (h 2): " + "\n\n");
//          String[] user_input2 = sc1.nextLine().split(" ");
//          try {
//            if (brd.verifyCoordinate(Column.valueOf(user_input2[0]),Integer.parseInt(user_input2[1]))) {
//              //System.out.print("plss");
//              switch (user_input[1]) {//switch
//
//                  case "Pawn":
//                      System.out.println("\nPawn selected.\n");
//                      pieces_array[strLen] = new Pawn(Piece.valueOf(user_input[1].toUpperCase()), user_input[0], Column.valueOf(user_input2[0]), Integer.parseInt(user_input2[1]));
//                      strLen++;
//                      break;
//
//                  case "Bishop":
//                      System.out.println("\nBishop selected.\n");
//                      bs1 = new Bishop(Piece.valueOf(user_input[1].toUpperCase()), user_input[0], Column.valueOf(user_input2[0]), Integer.parseInt(user_input2[1]));
//                      // pieces_array[strLen] = new Bishop(Piece.valueOf(user_input[0]), user_input[1], Column.valueOf(user_input2[0]), Integer.parseInt(user_input2[1]));
//                      break;
//
//                  case ("Rook"):
//                      System.out.println("\nRook selected.\n");
//                      pieces_array[strLen] = new Rook(Piece.valueOf(user_input[1].toUpperCase()), user_input[0], Column.valueOf(user_input2[0]), Integer.parseInt(user_input2[1]));
//                      strLen++;
//                      break;
//
//                  case ("Queen"):
//                      System.out.println("\nQueen selected.\n");
//                      pieces_array[strLen] = new Queen(Piece.valueOf(user_input[1].toUpperCase()), user_input[0], Column.valueOf(user_input2[0]), Integer.parseInt(user_input2[1]));
//                      strLen++;
//                      break;
//
//                  case ("King"):
//                      System.out.println("\nKing selected.\n");
//                      pieces_array[strLen] = new King(Piece.valueOf(user_input[1].toUpperCase()), user_input[0], Column.valueOf(user_input2[0]), Integer.parseInt(user_input2[1]));
//                      strLen++;
//                      break;
//
//                  case ("Knight"):
//                      System.out.println("\nKnight selected.\n");
//                      pieces_array[strLen] = new Knight(Piece.valueOf(user_input[1].toUpperCase()), user_input[0], Column.valueOf(user_input2[0]), Integer.parseInt(user_input2[1]));
//                      strLen++;
//                      break;
//              }//switch
//          } else {
//              System.out.print("Repeated piece. Enter new piece please. \n\n");
//          }
//
//
//
//
//
//          } catch (Exception e) {
//            System.out.print("Given column is not valid." + "\n\n");
//            System.out.print(e + "\n\n");
//          }
//
//
//
//    } else {
//      System.out.print("Invalid input. Please retry. Chess piece may be repeated.\n\n\n" );
//    }
//
//  }
//  // sc.close();
//
//          Scanner sc2 = new Scanner(System.in);
//          System.out.print("\nPlease enter target position (h 2): " + "\n\n");
//          String[] user_input3 = sc2.nextLine().split(" ");
//          try {
//            if (brd.verifyCoordinate(Column.valueOf(user_input3[0]),Integer.parseInt(user_input3[1]))) {
//            for (int k = 0; k < pieces_array.length-1; k++) {
//                if (pieces_array[k].moveTo(Column.valueOf(user_input3[0]), Integer.parseInt(user_input3[1]))) {
//                    System.out.print(pieces_array[k].getName() + " in position " + ((char) (pieces_array[k].getColumn().getValue())) + ", " + pieces_array[k].getRow() + " can move to position " + user_input3[0] + ", " + user_input3[1] + "\n\n");
//                } else {
//                    System.out.print(pieces_array[k].getName() + " in position " + ((char) (pieces_array[k].getColumn().getValue())) + ", " + pieces_array[k].getRow() + " cannot move to position " + user_input3[0] + ", " + user_input3[1] + "\n\n");
//                }
//            }
//          if (bs1.moveToBishop(bs1.getColumn(), bs1.getRow(),Column.valueOf(user_input3[0]), Integer.parseInt(user_input3[1]))) {
//              System.out.print("Bishop in position " + ((char) (bs1.getColumn().getValue())) + ", " + bs1.getRow() + " can move to position " + user_input3[0] + ", " + user_input3[1] + "\n\n");
//          } else {
//              System.out.print("Bishop in position " + ((char) (bs1.getColumn().getValue())) + ", " + bs1.getRow() + " cannot move to position " + user_input3[0] + ", " + user_input3[1] + "\n\n");
//          }
//            sc2.close();
//          }
//        } catch(Exception e) {
//            System.out.print("Invalid input. " + e + "\n\n");
//            Scanner sc4 = new Scanner(System.in);
//            System.out.print("\nPlease enter target position (h 2): " + "\n\n");
//            String[] user_input4 = sc4.nextLine().split(" ");
//            try {
//              // System.out.print(user_input4.length + "   " + pieces_array.length);
//              if (brd.verifyCoordinate(Column.valueOf(user_input4[0]),Integer.parseInt(user_input4[1]))) {
//              for (int k = 0; k < pieces_array.length-1; k++) {
//                  if (pieces_array[k].moveTo(Column.valueOf(user_input4[0]), Integer.parseInt(user_input4[1]))) {
//                      System.out.print(pieces_array[k].getName() + " in position " + ((char) (pieces_array[k].getColumn().getValue())) + ", " + pieces_array[k].getRow() + " can move to position " + user_input4[0] + ", " + user_input4[1] + "\n\n");
//                  } else {
//                      System.out.print(pieces_array[k].getName() + " in position " + ((char) (pieces_array[k].getColumn().getValue())) + ", " + pieces_array[k].getRow() + " cannot move to position " + user_input4[0] + ", " + user_input4[1] + "\n\n");
//                  }
//              }
//            if (bs1.moveToBishop(bs1.getColumn(), bs1.getRow(),Column.valueOf(user_input4[0]), Integer.parseInt(user_input4[1]))) {
//                System.out.print("Bishop in position " + ((char) (bs1.getColumn().getValue())) + ", " + bs1.getRow() + " can move to position " + user_input4[0] + ", " + user_input4[1] + "\n\n");
//            } else {
//                System.out.print("Bishop in position " + ((char) (bs1.getColumn().getValue())) + ", " + bs1.getRow() + " cannot move to position " + user_input4[0] + ", " + user_input4[1] + "\n\n");
//            }
//              sc4.close();
//            }
//          } catch(Exception e1) {
//              System.out.print( e1 + "\n\n");
//          }
//        }
//
//
//}
}
        
