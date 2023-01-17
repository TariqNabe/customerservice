import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    // Static variables for the TicTacToe class, effectively configuration options
    // Use these instead of hard-coding ' ', 'X', and 'O' as symbols for the game
    // In other words, changing one of these variables should change the program
    // to use that new symbol instead without breaking anything
    // Do NOT add additional static variables to the class!
    static char emptySpaceSymbol = ' ';
    static char playerOneSymbol = 'X';
    static char playerTwoSymbol = 'O';

    public static void main(String[] args) {
        // TODO
        // This is where the main menu system of the program will be written.
        // Hint: Since many of the game runner methods take in an array of player names,
        // you'll probably need to collect names here.
        
        String[] playerNames = new String[2];
        Scanner in = new Scanner(System.in);
        
        String option;
       
        do {
        System.out.print("\n 1. Single Player \n 2. Two player \n D. Display last match \n Q. Quit\nWhat do you want to do: ");
        option = in.nextLine();
        
        if(option.equals("1"))
        {
           
        }
       else if(option.equals("2"))
      {
         for(int i=0; i<2; i++)
         {
            System.out.print("\n Enter player "+(i+1)+" name: ");
            playerNames[i] = in.nextLine();
         }
          runTwoPlayerGame(playerNames);
      }
        
        
        
        else if(option.equalsIgnoreCase("D"))
        {
           
        }
        else if(option.equalsIgnoreCase("Q"))
        {
           break;
        }
       }while(!option.equals("1") || !option.equals("2") || !option.equalsIgnoreCase("D") || !option.equalsIgnoreCase("Q"));
        
        
        
    }

    // Given a state, return a String which is the textual representation of the tic-tac-toe board at that state.
    private static String displayGameFromState(char[][] state) {
        // TODO
        // Hint: Make use of the newline character \n to get everything into one String
        // It would be best practice to do this with a loop, but since we hardcode the game to only use 3x3 boards
        // it's fine to do this without one.
        
        
        for(int i = 0; i < 3; i++) {
              System.out.print("\n " + state[i][0] + " | "  + state[i][1] + " | "  + state[i][2]); 
              if(i < 2){
                 System.out.print("\n ---------");  
              }                 
          }

        
        
        

        return null;
    }

    // Returns the state of a game that has just started.
    // This method is implemented for you. You can use it as an example of how to utilize the static class variables.
    // As you can see, you can use it just like any other variable, since it is instantiated and given a value already.
    private static char[][] getInitialGameState() {
        return new char[][]{{emptySpaceSymbol, emptySpaceSymbol, emptySpaceSymbol},
                {emptySpaceSymbol, emptySpaceSymbol, emptySpaceSymbol},
                {emptySpaceSymbol, emptySpaceSymbol, emptySpaceSymbol}};
    }

    // Given the player names, run the two-player game.
    // Return an ArrayList of game states of each turn -- in other words, the gameHistory

    private static ArrayList<char[][]> runTwoPlayerGame(String[] playerNames) {
          Random rand = new Random();
          System.out.print("\n Tossing a coin to decide who goes first!!!");
          int number = rand.nextInt(3);
          if(number == 1)
          {
            System.out.print("\n "+playerNames[0]+" gets to go first.");
          }
           else
           {
            System.out.print("\n "+playerNames[1]+" gets to go first.");
           }
           char curGameStat[][]  =  new char[3][3];
           curGameStat = getInitialGameState();
           displayGameFromState(curGameStat); 
                  
        return null;
    }

    // Given the player names (where player two is "Easy Computer", "Medium Computer", etc.), and the difficulty,
    // Run the one-player game.
    // Return an ArrayList of game states of each turn -- in other words, the gameHistory
    private static ArrayList<char[][]> runOnePlayerGame(String[] playerNames, char difficulty) {
        // TODO

        return null;
    }

    // Repeatedly prompts player for move in current state, returning new state after their valid move is made
    private static char[][] runPlayerMove(String playerName, char playerSymbol, char[][] currentState) {
        Scanner sc = new Scanner(System.in);
        // TODO

        return null;
    }

    // Repeatedly prompts player for move. Returns [row, column] of their desired move such that row & column are on
    // the 3x3 board, but does not check for availability of that space.
    private static int[] getInBoundsPlayerMove(String playerName) {
        Scanner sc = new Scanner(System.in);
        int[] move = new int[2]; 
         System.out.print("\n " + playerName+"'s turn:");
         System.out.print("\n " + playerName+" enter row:");
         move[0] = sc.nextInt();
         System.out.print("\n " + playerName+" enter col:");
         move[1] = sc.nextInt();

       
       
        // TODO

        return move;
    }

    // Given a [row, col] move, return true iff a space is unclaimed.
    // Doesn't need to check whether move is within bounds of the board.
    private static boolean checkValidMove(int[] move, char[][] state) {
        // TODO
        return false;
    }

    // Given a [row, col] move, the symbol to add, and a game state,
    // Return a NEW array (do NOT modify the argument currentState) with the new game state
    private static char[][] makeMove(int[] move, char symbol, char[][] currentState) {
        // TODO:
        // Hint: Make use of Arrays.copyOf() somehow to copy a 1D array easily
        // You may need to use it multiple times for a 1D array
        return null;
    }

    // Given a state, return true iff some player has won in that state
    private static boolean checkWin(char[][] state) {
        // TODO
        // Hint: no need to check if player one has won and if player two has won in separate steps,
        // you can just check if the same symbol occurs three times in any row, col, or diagonal (except empty space symbol)
        // But either implementation is valid: do whatever makes most sense to you.

        // Horizontals
        // Verticals
        // Diagonals
        return false;
    }

    // Given a state, simply checks whether all spaces are occupied. Does not care or check if a player has won.
    private static boolean checkDraw(char[][] state) {
        // TODO
        return false;
    }

    // For all AI methods, assume the AI is player two.

    // Given a game state, return a new game state with the move from the easy AI
    // The easy AI should simply make a move at random from the available spaces
    private static char[][] getEasyCPUMove(char[][] gameState) {
        // TODO
        return null;
    }

    // Given a game state, return a new game state with move from the hard AI
    // The behavior of the medium AI is up to you, as long as its skill/algorithm
    // is better than easy but worse than hard
    private static char[][] getMediumCPUMove(char[][] gameState) {
        // TODO
        return null;
    }

    // Given a game state, return a new game state with move from the hard AI
    // The hard AI follows the algorithm in the PDF to ensure a tie (or win if possible)
    private static char[][] getHardCPUMove(char[][] gameState) {
        // TODO

        // Hint: you can call makeMove() and not end up returning the result, in order to "test" a move
        // and see what would happen. This is one reason why makeMove() does not modify the state argument

        // Determine all available spaces

        // If there is a winning move available, make that move

        // If not, check if opponent has a winning move, and if so, make a move there

        // If not, move on center space if possible

        // If not, move on corner spaces if possible

        // Otherwise, move in any available spot

        return null;
    }

    // Given a game state, return an ArrayList of [row, column] positions that are unclaimed on the board
    private static ArrayList<int[]> getValidMoves(char[][] gameState) {
        // TODO
        return null;
    }

    // Given player names and the game history, display the past game as in the PDF sample code output
    private static void runGameHistory(String[] playerNames, ArrayList<char[][]> gameHistory) {
        // TODO
        // We have the names of the players in the format [playerOneName, playerTwoName]
        // Player one always gets 'X' while player two always gets 'O'
        // However, we do not know yet which player went first, but we'll need to know...
        // Hint for the above: which symbol appears after one turn is taken?

        // Hint: iterate over gameHistory using a loop
    }
}