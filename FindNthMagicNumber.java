//This Question Was Asked In Amazon
package ImportantProblems;
import java.util.*;
public class FindNthMagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int multi = 5;
        while(n>0){
            int temp = n&1;
             n = n>>1;
            ans = ans + temp * multi;
             multi = multi * 5;
        }
        System.out.println(ans);
    }
    }

