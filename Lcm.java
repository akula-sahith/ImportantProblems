package ImportantProblems;
import java.util.*;
public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("LCM :"+LCM(a,b));
    }
    static int LCM(int a,int b){
           int hcf =   gcd(a,b);
           System.out.println("HCF:"+hcf);
           int lcm =  (a*b)/hcf;
           return lcm;
    }
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}
