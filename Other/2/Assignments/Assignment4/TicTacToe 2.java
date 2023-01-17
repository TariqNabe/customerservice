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
        ArrayList<char[][]> gameHistory = new ArrayList<>();
        String[] playerNames = new String[2];
        Scanner in = new Scanner(System.in);
        
        String option;//option code
        char difficulty;
       
        do {//do loop for menu
        System.out.print("\n 1. Single Player \n 2. Two player \n D. Display last match \n Q. Quit\nWhat do you want to do: ");
        option = in.nextLine();
        
            if(option.equals("1"))//option one for single player
            {
                do {//inside option one for player one to decide game difficulty
                    System.out.print("\nE: Easy\nM: Medium\nH:Hard\nChoose difficulty: ");
                     
                      difficulty = in.nextLine().charAt(0);

                        if(difficulty == 'E' || difficulty == 'e') {//easy game 
                            playerNames[1] = "Easy Computer";
                            break;
                        } else if(difficulty == 'M' || difficulty == 'm') {//medium game
                                playerNames[1] = "Medium Computer";
                                System.out.print("\n Medium Game. ");
                                break;
                        } else if(difficulty == 'H' || difficulty == 'h') {//hard game
                                playerNames[1] = "Hard Computer";
                                System.out.print("\n Hard Game. ");
                                break;
                        } else {
                                System.out.print("\n '" + difficulty + "'"+"is not a valid option.");
                        }
                    //while not within loop
                    }while(difficulty != 'E' || difficulty != 'e'|| difficulty != 'M' || difficulty != 'm' || difficulty != 'H' || difficulty != 'h');
                    System.out.print("\n Enter player 1 name: ");
                    playerNames[0] = in.nextLine();
                    gameHistory = runOnePlayerGame(playerNames, difficulty);
            }
            else if(option.equals("2"))//option two from main menu
            {
                for(int i=0; i<2; i++)
                {
                    System.out.print("\n Enter player "+(i+1)+" name: ");
                    playerNames[i] = in.nextLine();
                }
                gameHistory =  runTwoPlayerGame(playerNames);
            }
            else if(option.equalsIgnoreCase("D"))//D for display game history
            {
                runGameHistory(playerNames, gameHistory);
            }
            else if(option.equalsIgnoreCase("Q"))//Quit game 
            {
                System.out.print("\n Thanks for playing. Hope you had fun!");
                break;
            }
            else 
            {
                System.out.print("\n " + option + " is not a valid option.");
            }
       }while(!option.equals("1") || !option.equals("2") || !option.equalsIgnoreCase("D") || !option.equalsIgnoreCase("Q"));
        
        
        
    }

    // Given a state, return a String which is the textual representation of the tic-tac-toe board at that state.
    private static String displayGameFromState(char[][] state) {
        // TODO
        // Hint: Make use of the newline character \n to get everything into one String
        // It would be best practice to do this with a loop, but since we hardcode the game to only use 3x3 boards
        // it's fine to do this without one.
        String board = "";
        
        for(int i = 0; i < 3; i++) {
              board = board + "\n " + state[i][0] + " | "  + state[i][1] + " | "  + state[i][2]; 
              if(i < 2){
                board = board + "\n ---------";  
              }                 
          }

        return board;
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
          boolean gameEnd = false;
          int[] move = new int[2];
          ArrayList<char[][]> gameHistory = new ArrayList<>();
          Random rand = new Random();
          System.out.print("\n Tossing a coin to decide who goes first!!!");
          int toss = rand.nextInt(2);
          int playerTurn = toss;
          if(toss == 0)
          {
            System.out.print("\n "+playerNames[toss]+" gets to go first."); 
          }
           else
           {
            System.out.print("\n "+playerNames[toss]+" gets to go first.");
           }
           char curGameStat[][]  =  new char[3][3];
           curGameStat = getInitialGameState();
           System.out.print(displayGameFromState(curGameStat));
           //gameHistory.add(curGameStat);
           while(!gameEnd){
                do {
                    move = getInBoundsPlayerMove(playerNames[playerTurn]);
                    if(!checkValidMove(move, curGameStat)) {
                        System.out.print("\n That space is already taken. Try again.");
                    }
                }while(!checkValidMove(move, curGameStat));
                if(playerTurn == 0) {
                    curGameStat =  makeMove(move, playerOneSymbol, curGameStat);
                    System.out.print(displayGameFromState(curGameStat));
                    if(checkWin(curGameStat)){
                        System.out.print("\n " + playerNames[playerTurn] + " wins!");
                        gameEnd = true;
                    } else if(checkDraw(curGameStat)){
                        System.out.print("\n It's a draw!");
                        gameEnd = true;
                    }
                    playerTurn = 1;
                }else if(playerTurn == 1) {
                    curGameStat = makeMove(move, playerTwoSymbol, curGameStat);
                    System.out.print(displayGameFromState(curGameStat));
                    if(checkWin(curGameStat)){
                        System.out.print("\n " + playerNames[playerTurn] + " wins!");
                        gameEnd = true;
                    } else if(checkDraw(curGameStat)){
                        System.out.print("\n It's a draw!");
                        gameEnd = true;
                    }
                    playerTurn = 0;
                }
                gameHistory.add(curGameStat);
           }

                  
        return gameHistory;
    }

    // Given the player names (where player two is "Easy Computer", "Medium Computer", etc.), and the difficulty,
    // Run the one-player game.
    // Return an ArrayList of game states of each turn -- in other words, the gameHistory
    private static ArrayList<char[][]> runOnePlayerGame(String[] playerNames, char difficulty) {
        // TODO
        boolean gameEnd = false;
          int[] move = new int[2];
          ArrayList<char[][]> gameHistory = new ArrayList<>();
          Random rand = new Random();
          System.out.print("\n Tossing a coin to decide who goes first!!!");
          int toss = rand.nextInt(2);
          int playerTurn = toss;
          if(toss == 0)
          {
            System.out.print("\n "+playerNames[toss]+" gets to go first."); 
          }
           else
           {
            System.out.print("\n "+playerNames[toss]+" gets to go first.");
           }
           char curGameStat[][]  =  new char[3][3];
           curGameStat = getInitialGameState();
           System.out.print(displayGameFromState(curGameStat));
           
           while(!gameEnd){
                if(playerTurn == 0) {
                    do {
                        move = getInBoundsPlayerMove(playerNames[playerTurn]);
                        
                        if(!checkValidMove(move, curGameStat)) {
                            System.out.print("\n That space is already taken. Try again.");
                        }
                    }while(!checkValidMove(move, curGameStat));
                    curGameStat =  makeMove(move, playerOneSymbol, curGameStat);
                    System.out.print(displayGameFromState(curGameStat));
                    if(checkWin(curGameStat)){
                        System.out.print("\n " + playerNames[playerTurn] + " wins!");
                        gameEnd = true;
                    } else if(checkDraw(curGameStat)){
                        System.out.print("\n It's a draw!");
                        gameEnd = true;
                    }
                    playerTurn = 1;
                }else if(playerTurn == 1 && (difficulty == 'E' || difficulty == 'e')) {
                     System.out.print("\n " + playerNames[playerTurn]+"'s turn:");
                    curGameStat = getEasyCPUMove(curGameStat);
                    System.out.print(displayGameFromState(curGameStat));
                    if(checkWin(curGameStat)){
                        System.out.print("\n " + playerNames[playerTurn] + " wins!");
                        gameEnd = true;
                    } else if(checkDraw(curGameStat)){
                        System.out.print("\n It's a draw!");
                        gameEnd = true;
                    }
                    playerTurn = 0;
                }    
                gameHistory.add(curGameStat);
           }
        
        return gameHistory;
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
        // TODO
        int[] move = new int[2]; 
        
        do{
            System.out.print("\n " + playerName+"'s turn:");
            System.out.print("\n " + playerName+" enter row:");
            move[0] = sc.nextInt();
            System.out.print("\n " + playerName+" enter col:");
            move[1] = sc.nextInt();
            if(move[0] < 0 || move[0] > 2 || move[1] < 0 || move[1] > 2){
                System.out.print("\n That row or column is out of bounds. Try again.");
            }
        }while(move[0] < 0 || move[0] > 2 || move[1] < 0 || move[1] > 2);
 
        return move;
    }

    // Given a [row, col] move, return true iff a space is unclaimed.
    // Doesn't need to check whether move is within bounds of the board.
    private static boolean checkValidMove(int[] move, char[][] state) {
        // TODO
        boolean isValidMove = true;
        if(state[move[0]][move[1]] != emptySpaceSymbol){
            isValidMove = false;
        }

        return isValidMove;
    }

    // Given a [row, col] move, the symbol to add, and a game state,
    // Return a NEW array (do NOT modify the argument currentState) with the new game state
    private static char[][] makeMove(int[] move, char symbol, char[][] currentState) {
        // TODO:
        // Hint: Make use of Arrays.copyOf() somehow to copy a 1D array easily
        // You may need to use it multiple times for a 1D array
    
        char[][] newState = new char[currentState.length][];
        for (int i = 0; i < currentState.length; i++) {
            newState[i] = Arrays.copyOf(currentState[i], currentState[i].length);
        }

        newState[move[0]][move[1]] = symbol;
        
        return newState;
    }

    // Given a state, return true iff some player has won in that state
    private static boolean checkWin(char[][] state) {
        // TODO
        // Hint: no need to check if player one has won and if player two has won in separate steps,
        // you can just check if the same symbol occurs three times in any row, col, or diagonal (except empty space symbol)
        // But either implementation is valid: do whatever makes most sense to you.
        boolean isWin = false;
        // Horizontals
        for(int i = 0; i < 3; i++){
            if(state[i][0] == state[i][1] && state[i][1] ==  state[i][2] && state[i][0] != emptySpaceSymbol){
                isWin = true;
                break;
            }
        }

        // Verticals
        for(int i = 0; i < 3; i++){
            if(state[0][i] == state[1][i] && state[1][i] == state[2][i] && state[0][i] != emptySpaceSymbol){
                isWin = true;
                break;
            }
        }
        
        // Diagonals
        if(state[0][0] == state[1][1] && state[1][1] == state[2][2] && state[0][0] != emptySpaceSymbol){
            isWin = true;
        }else if(state[0][2] == state[1][1] && state[1][1] == state[2][0] && state[0][2] != emptySpaceSymbol){
            isWin = true;
        }

        return isWin;
    }

    // Given a state, simply checks whether all spaces are occupied. Does not care or check if a player has won.
    private static boolean checkDraw(char[][] state) {
        // TODO
        boolean isDraw = true;
        for(int i = 0; i < 3; i++){
            if(state[i][0] == emptySpaceSymbol || state[i][1] == emptySpaceSymbol || state[i][2] == emptySpaceSymbol){
                isDraw = false;
                break;
            }
        }
        return isDraw;
    }

    // For all AI methods, assume the AI is player two.

    // Given a game state, return a new game state with the move from the easy AI
    // The easy AI should simply make a move at random from the available spaces
    private static char[][] getEasyCPUMove(char[][] gameState) {
        // TODO
        Random rand = new Random();
        // ArrayList<int[]> validMoves = new ArrayList<>();
        // validMoves = getValidMoves(gameState);
        int[] move = new int[2];
        do {
            move[0] = rand.nextInt(3);
            move[1] = rand.nextInt(3);

        }while (!checkValidMove(move, gameState));

        char[][] newState = makeMove(move, playerTwoSymbol, gameState);

        return newState;
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
        ArrayList<int[]> validMoves = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++){
                if(gameState[i][j] == emptySpaceSymbol){
                    int[] empty = {i,j};
                    validMoves.add(empty);
                }
            }
        }
        return validMoves;
    }

    // Given player names and the game history, display the past game as in the PDF sample code output
    private static void runGameHistory(String[] playerNames, ArrayList<char[][]> gameHistory) {
        // TODO
        // We have the names of the players in the format [playerOneName, playerTwoName]
        // Player one always gets 'X' while player two always gets 'O'
        // However, we do not know yet which player went first, but we'll need to know...
        // Hint for the above: which symbol appears after one turn is taken?

        // Hint: iterate over gameHistory using a loop
        int playerTurn = 0;

        if(gameHistory.size() > 0){

            char[][] firstMove = gameHistory.get(0);

            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++){
                    if(firstMove[i][j] == playerOneSymbol){
                        playerTurn = 0;
                    }else if(firstMove[i][j] == playerTwoSymbol){
                        playerTurn = 1;
                    }
                }
            }

            System.out.print("\n " + playerNames[0] + " (X)  vs " +playerNames[1] + " (O)");
            firstMove = getInitialGameState();
            System.out.print(displayGameFromState(firstMove));
            for(char[][] state: gameHistory) {
                System.out.print("\n " + playerNames[playerTurn] + " :");
                System.out.print(displayGameFromState(state));
                if(checkWin(state)){
                    System.out.print("\n " + playerNames[playerTurn] + " wins!");
                } else if(checkDraw(state)){
                    System.out.print("\n It's a draw!");
                }
                if(playerTurn == 0){
                playerTurn = 1; 
                } else {
                    playerTurn = 0;
                }
            }
        } else {
            System.out.print("\n No game to show.");
        }
    }
}