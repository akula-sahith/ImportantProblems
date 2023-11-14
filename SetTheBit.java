/*In this set bit we have to change the given ith bit 0 to 1 if it is 1 dont make any changes 
 * So we use '|' operator for that
 */
package ImportantProblems;
import java.util.*;
public class SetTheBit {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int i = sc.nextInt();
         System.out.println(Set(n,i));
    }
    static String Set(int n,int i){
        int ans = n|(1<<(i-1));
        String s = Integer.toBinaryString(ans);
        return s;
    }
}
