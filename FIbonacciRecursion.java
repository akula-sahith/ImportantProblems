package ImportantProblems;
import java.util.*;
public class FIbonacciRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = fibo(5);
        System.out.println(ans);

    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
