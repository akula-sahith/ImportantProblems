package ImportantProblems;
import java.util.*;
public class MatrixOperations{
    static void MatrixInput(int[][] arr,Scanner sc){
        System.out.println("Enter the elements of the matrix");
      for (int i = 0; i < arr.length; i++) {
        for(int j = 0;j<arr[0].length;j++){
           arr[i][j] = sc.nextInt();
      }
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        System.out.println("Enter number of columns");
        int m = sc.nextInt();
        int[][] matrix1 = new int[n][m];
        MatrixInput(matrix1, sc);
        int[][] matrix2 = new int[n][m];
        MatrixInput(matrix2, sc);
        System.out.println("Choose what to perform");
        System.out.println("1.Trace of a Matrix");
        System.out.println("2.Addition of matrices");
        System.out.println("3.Subraction of Matrices");
        System.out.println("4.Multiplication of matrices");
        int operation = sc.nextInt();
        switch(operation){
            case 1 : Trace(matrix1);
            case 2 : Addition(matrix1,matrix2);
        }
    }
    static void Trace(int[][] arr){
      int trace = 0;
      if()
    }
    static void Addition(int[][]...arr){
     int[][] ans = new int[arr.length][arr[0].length];
     for(int i = 0;i<arr[0].length;i++){
        for(int j = 0;j<arr[0][0].length;j++){
            ans[i][j] = arr[0][i][j] + arr[1][i][j];
        }
     }
     System.out.println("Resulted matrix is");
    for(int i = 0;i<ans.length;i++){
        for(int j =0;j<ans[0].length;j++){
            System.out.print(ans[i][j] + " ");
        }
        System.out.println();
    }
    }
    static void Subraction(int[][]...arr){
   
    }
    static void Multiplication(int[][]...arr){

    }
}