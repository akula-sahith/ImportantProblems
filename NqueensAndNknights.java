package ImportantProblems;
import java.util.*;
    public class NqueensAndNknights{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     //   int n = sc.nextInt();
        char[][] board = {{'X','X','X','X','X'},
                          {'X','X','X','X','X'},
                          {'X','X','X','X','X'},
                          {'X','X','X','X','X'},
                          {'X','X','X','X','X'}};
                          GetAllTheWaysToPlaceTheQueens(board, 0);
    }
    static void GetAllTheWaysToPlaceTheQueens(char[][] board,int row){
        if(row==board.length){
         displayBoard(board);
         System.out.println();
          return;
        }
         for(int col= 0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col] = 'Q';
                GetAllTheWaysToPlaceTheQueens(board, row+1);
                board[row][col] = 'X';
            }
   
    
         }
    }
   static boolean isSafe(char[][] board, int row, int col) {
       //CheckForHorizontal
       for (int i = 0; i < board.length; i++) {
        if(board[row][i]=='Q'){
            return false;
        }
       }
       //CheckForVertical
       for (int i = 0; i < board.length; i++) {
        if(board[i][col]=='Q'){
            return false;
        }
       }
       //UpperLeft
       int r = row;
       for (int c = col;r>=0&&c>=0;r-- ,c--) {
         if(board[r][c]=='Q'){
            return false;
         }
       }
       r = row;
       for (int c = col;r>=0&&c<board.length;r-- ,c++) {
         if(board[r][c]=='Q'){
            return false;
         }
       }
        return true;
    }
    static void displayBoard(char[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
             System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}