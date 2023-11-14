package ImportantProblems;
import java.util.*;
public class Print1toN {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    print(1,n);
 }   
 static void print(int a,int n){
    if(a==n){
      System.out.println(a);
      return;
    }
    System.out.println(a);
    print(a+1,n);
 }
}
