package ImportantProblems;
import java.util.*;
public class ValidCalibrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         printNos(1,n);
    }

  static void printNos(int N,int n)
    {
       
        //Your code here
        if(N==n){
            System.out.print(n);
            return;
        }
        System.out.print(N + " ");
        printNos(N+1,n);
    }
}


