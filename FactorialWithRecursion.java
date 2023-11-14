package ImportantProblems;
import java.util.*;
public class FactorialWithRecursion {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(fact(n,1));
 }   
 static int fact(int n,int pro){
    if(n==0){
        return pro;
    }
    pro = pro * n;
    return fact(n-1,pro);
 }
}
