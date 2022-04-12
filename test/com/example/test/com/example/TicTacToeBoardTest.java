package test.com.example;
import com.example.TicTacToeBoard;

public class TicTacToeBoardTest {
 // @Test
  public void testValidBoardNoWinner() { 
    TicTacToeBoard board = new TicTacToeBoard("O...X.X..");
   System.out.println(board.evaluate("O...X.X.."));
    System.out.println(board.evaluate("...Xxx.oo"));
    System.out.println(board.evaluate("oo....xxx"));
    System.out.println(board.evaluate("x..x..xoo"));
    System.out.println(board.evaluate(".x..xoox."));
    System.out.println(board.evaluate("..xoox..x"));
    System.out.println(board.evaluate("x...x.oox"));
    System.out.println(board.evaluate("..x.x.xoo"));
    System.out.println(board.evaluate("O.."));
    System.out.println(board.evaluate("O...X.X...."));
    System.out.println(board.evaluate("Oooxxx..."));
    System.out.println(board.evaluate("oxooxooxo"));
  }
  public static void main(String[] args) {
    TicTacToeBoardTest evaluateboard = new TicTacToeBoardTest();
    evaluateboard.testValidBoardNoWinner();
  }
}




