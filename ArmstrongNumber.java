package ImportantProblems;
import java.util.*;
public class ArmstrongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        int l = s.length();
        int n1 = Integer.parseInt(s);
        int temp = n1;
        double sum = 0;
        while(n1>0){
        double rem = n1%10;
        sum = sum + Math.pow(rem,l);
        n1 = n1/10;
        }
        if(temp==sum){
            System.out.println("The given number is armstrong");
        }
        else{
            System.out.println("Not armstrong");
        }
    }
}