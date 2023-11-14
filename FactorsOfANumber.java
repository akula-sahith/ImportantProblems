package ImportantProblems;
import java.util.*;
public class FactorsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factors(n);
    }
    static void factors(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                System.out.println(i + " " + n/i);
            }
        }
    }
}
