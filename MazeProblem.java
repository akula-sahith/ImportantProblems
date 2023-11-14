package ImportantProblems;
import java.util.*;
public class MazeProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int m = 3;
     //   int ans = CountPaths(0,0,n,m);
    //    System.out.println(ans);
         /*  PrintPaths("",0,0,n,m);
         int ans2 = PathsIncludingDiagonal(0,0,n,m);
         System.out.println(ans2);
         PrintPathsIncludingDiagonal("",0,0,n,m);*/
  //       int ans3 = CountPathsWithObstacles(0, 0, n, m, 1, 1);
   //      System.out.println(ans3);
  //       System.out.println("Paths with obstacles");
   //      PrintPathsWithObstacles("",0,0,n,m,1,1);
         boolean[][] arr = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
         };
        PrintIncludingAllPaths(arr," ",0, 0, n, m);
        
         
     
    }
static void PrintIncludingAllPaths(boolean[][] maze,String s, int i,int j,int n,int m){
    if(i==(n-1)&&j==(m-1)){
         System.out.println(s);
         return;
        }
       
        if(maze[i][j]==false){
        return;
        }
        maze[i][j] = false;
       
       
       if(j<(m-1)){
        PrintIncludingAllPaths(maze, s+"R", i, j+1, n, m);
       }
       if(i<(m-1)){
        PrintIncludingAllPaths(maze,s+'D',i+1,j,n,m);
       }
       if(i>0){
        PrintIncludingAllPaths(maze, s+"U", i-1, j, n, m);
       }
       if(j>0){
        PrintIncludingAllPaths(maze,s+'L',i,j-1,n,m);
       }
       maze[i][j] = true;
      
    }
    static int IncludingAllPaths(boolean[][] maze,int i,int j,int n,int m){
        if(i<0||j<0){
            return 0;
        }
        if(maze[i][j]==false){
        return 0;
        }
        maze[i][j] = false;
        if(i==(n-1)||j==(m-1)){
        return 1;
        }
       
       int Up = IncludingAllPaths(maze, i-1, j, n, m);
       int down = IncludingAllPaths(maze,i+1,j,n,m);
       int right = IncludingAllPaths(maze, i, j+1, n, m);
       int left  = IncludingAllPaths(maze, i, j-1, n, m);
       maze[i][j] = true;
       return Up+down+right+left;
    }
    static void PrintPathsWithObstacles(String s,int i,int j,int n,int m,int a,int b){
        if(i==a&&j==b){
            return;
        }
        if(i==(n-1)&&j==(m-1)){
            System.out.println(s);
            return;
        }
        if(j<(m-1)){
            PrintPathsWithObstacles(s + 'R', i, j+1, n, m, a, b);
        }
        if(i<(n-1)){
            PrintPathsWithObstacles(s+'D',i+1,j,n,m,a,b);
        }
    }
    static int CountPathsWithObstacles(int i,int j,int n,int m,int a,int b){
       if(i==a&&j==b){
        return 0;
       }
       if(i==(n-1)||j==(m-1)){
        return 1;
       }
        int right = CountPathsWithObstacles(i,j+1,n,m,a,b);
        int down = CountPathsWithObstacles(i+1, j, n, m,a,b);
        return right+down;

    }
    static int CountPathsWithObstacles2(int i,int j,int n,int m,boolean[][] arr){
       if(arr[i][j]==false){
        return 0;
       }
       if(i==(n-1)||j==(m-1)){
        return 1;
       }
        int right = CountPathsWithObstacles2(i,j+1,n,m,arr);
        int down = CountPathsWithObstacles2(i+1, j, n, m,arr);
        return right+down;

    }
    static int CountPaths(int i,int j,int n,int m){
      // if(i==n||j==m){
     //   return 0;
     //  }
     if(i==(n-1)&&j==(m-1)){
        return 1;
     }
       if(i==(n-1)||j==(m-1)){
       return 1;
       }
       int downwards =  CountPaths(i+1,j,n,m);
       int  rightward  = CountPaths(i,j+1,n,m);
      return  downwards + rightward; 
    }
    static void PrintPaths(String s,int i,int j,int n,int m){
        if(i==2&&j==2){
            System.out.println(s);
            return;
        }
        if(j<m-1){
            PrintPaths(s + 'R', i, j+1, n, m);
        }
        if(i<n-1){
           PrintPaths(s + 'D',i+1,j,n,m);
        }
       
    }
    static int PathsIncludingDiagonal(int i,int j,int n,int m){

        if(i==(n-1)||j==(m-1)){
          return 1;
        }

        int downwards = PathsIncludingDiagonal(i+1,j,n,m);
        int rightward = PathsIncludingDiagonal(i, j+1, n, m);
        int diagonally = PathsIncludingDiagonal(i+1, j+1, n, m);
         return downwards + rightward + diagonally;
        }
        static void PrintPathsIncludingDiagonal(String s,int i,int j,int n,int m){
        if(i==(n-1)&&j==(m-1)){
            System.out.println(s);
            return;
        }
        if(i<(n-1)&&j<(m-1)){
           PrintPathsIncludingDiagonal(s+'D',i+1,j+1,n,m);
        }
        if(j<m-1){
            PrintPathsIncludingDiagonal(s + 'H', i, j+1, n, m);
        }
        if(i<n-1){
           PrintPathsIncludingDiagonal(s + 'V',i+1,j,n,m);
        }
       
    }
}

