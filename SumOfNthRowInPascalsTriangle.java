package ImportantProblems;
import java.util.*;
public class SumOfNthRowInPascalsTriangle {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = (int)Math.pow(2,n-1);
    System.out.println(ans);
   } 
}
