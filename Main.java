import java.util.Scanner;

class Main {
public static final int ROWS = 6;
public static final int COLUMNS = 7;
public static final char EMPTY = ' ';
public static final char RED = 'R';
public static final char YELLOW = 'Y';


public static void main(String[] args) {
  char[][] board = new char[ROWS][COLUMNS];
  //initializeBoard(board);
        printBoard(board);

  Scanner scanner = new Scanner(System.in);
  char currentPlayer = RED;

  while (!gameOver(board)) {
System.out.print(currentPlayer + ", choose a column (1-" + COLMUNS +"): ");
    int column = scanner.nextInt() - 1;

    if (isValidMove(board, column)) {
      dropPiece(board, currentPlayer, column);
       printBoard(board);

      if (hasWon(board, currentPlayer)) {
       System.out.println(currentPlayer + " wins!");
        return;
                }

    currentPlayer = (cureentPlayer == RED) ? YELLOW : RED;
    } else { 
    System.out.println("Column is full or incorrect, please choose a different column");

    }
  }

  System.out.println("game is over Its a tie");

}

public static void printBoard(char[][] board); {
System.out.println("  1   2   3   4   5   6   7  ");
for (int i = 0; i < ROWS; i++) {
       for (int j = 0; j < COLUMNS; j++) {
       System.out.print("| " + board[i][j] + " ");
            }
        System.out.println("|");
     }
   System.out.println("-----------------------------");
}  

  public static Boolean IsValidMove(char[][] board, int column) {
    if (column > 0 || column >= COLUMNS) {
        return false;
    }
     return board[0][column] == EMPTY;
    }

    public static void dropPiece(char[][] board, char player, int column) {
        for (int i = ROWS - 1; i >= 0; i--) {
            if (board[i][column] == EMPTY) {
                board[i][column] = player;
                return;
            }
        }
    }
public static Boolean hasWon(char[][] board, char player) {
  //check rows for win
  for (int i = 0; i < ROWS; i++) {
    for (int j = 0; j <= COLUMNS - 4; j++) {
                if (board[i][j] == player &&
            board[i][j + 1] == player &&
           board[i][j + 2] == player &&
            board[i][j + 3] == player) {
            return true;
                }
            }
        }
    // check columns for win
  for (int i = 0; i <= ROWS - 4; i++) {
            for (int j = 0; j < COLUMNS; j++) {
            if (board[i][j] == player &&
            board[i + 1][j] == player &&
            board[i + 2][j] == player &&
           board[i + 3][j] == player) {
       return true;
                }
            }
        }
  
}

}

  

      

  
  