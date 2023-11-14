package ImportantProblems;
import java.util.*;
public class CheckEvenOrOddByBitwise {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     check(n);   
}
static void check(int n){
    if((n&1)==1){
        System.out.println("The given number is odd");
    }
    else{
        System.out.println("The given number is even");
    }
}
}