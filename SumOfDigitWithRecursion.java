package ImportantProblems;
import java.util.*;
public class SumOfDigitWithRecursion {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       int num = sc.nextInt();
       System.out.println(sum(num,0));
    }
    static int sum(int num,int count){
     if(num==0){
        return count;
     }
       int re = num%10;
       count = count + re;
       num = num / 10;
      return sum(num,count);
    }
}
