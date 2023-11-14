/*This method is golden ratio time complexity */
/*Time Complexity = O((1+√5)/2) */
package ImportantProblems;
import java.util.*;
public class FibonacciWithFormula {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number to find");
    int n = sc.nextInt();
    if(n<0){
        System.out.println("Invalid Enter again");
        n = sc.nextInt();
    }
    for (int i = 0; i <= n; i++) {
        System.out.println(print(i));
    }
}
    static long print(int n){
    double root1 = Math.sqrt(5);
    double root2 = (1/root1)*Math.pow((1+root1)/2,n);
    double root3 = (1/root1)*Math.pow((1-root1)/2,n);
    double ans = root2 - root3;
    long finans = Math.round(ans);
    return finans;
}
}
