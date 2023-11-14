package ImportantProblems;
import java.util.*;
public class Npuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int[][] board = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,0}
                         };
                         SolveTheNpuzzle(board);
    }
    static void SolveTheNpuzzle(int[][] board){
        int k = 1;
        for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board.length; j++) {
              if(board[i][j]!=k){
                
              }
              else{
                System.out.println("Board is in order");
              }
              k++;
            }
        }
    }
}
