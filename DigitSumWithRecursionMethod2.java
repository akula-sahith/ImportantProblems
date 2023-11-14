package ImportantProblems;
import java.util.*;
public class DigitSumWithRecursionMethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
        System.out.println(product(n));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }
    static int product(int n){
        if(n==0){
        return 1;
        }
        int remo = n%10;
        return remo * product(n/10);
    }
}
