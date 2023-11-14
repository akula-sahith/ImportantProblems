package ImportantProblems;
import java.util.*;
public class DigitSumWithRecursion {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(Sum(n,0));
 }   
 static int Sum(int n,int sum){
  if(n<=0){
    return sum;
  }
  int rem = n%10;
  sum = sum + rem;
  return  Sum(n/10,sum);
 }
}
