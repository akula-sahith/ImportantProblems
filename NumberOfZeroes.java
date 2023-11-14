package ImportantProblems;
import java.util.*;
public class NumberOfZeroes {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(NumberOfZeroes(n));
}    
static int NumberOfZeroes(int n){
    return  helper(n,0);
}
static int helper(int n,int count){
    if(n==0){
        return count;
    }
    int rem = n % 10;
    if(rem==0){
        count++;
    }
    return helper(n/10, count);
}
}
