/*In this reset the bit the ith has to be changed to 0 if 1 
 * we do '&' operation
*/
package ImportantProblems;
import java.util.*;
public class ResetTheBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(Reset(n,i));
    }
    static String Reset(int n,int i){
        int ans = n&~(1<<(i-1));
        String s = Integer.toBinaryString(ans);
        return s;
    }
}
