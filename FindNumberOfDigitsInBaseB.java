package ImportantProblems;
import java.util.*;
public class FindNumberOfDigitsInBaseB {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   //Enter in which base you want to know number of digits
   System.out.println("Enter in which base you want to know number of digits");
   int b = sc.nextInt();
    int ans = (int)(Math.log(n)/Math.log(b)) + 1;
   System.out.println(ans);
   //Method 2:-
   //run a counter by right shifting the given number until you get zero;
}
}
