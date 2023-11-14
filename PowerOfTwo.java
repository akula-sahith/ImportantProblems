/*This code works only for smaller number it will become stack overflow for larger numbers */
package ImportantProblems;
import java.util.*;
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(exist(num,1));
        
    }
    static boolean exist(int num,int pro){
      if(num==1||num==pro){
        return true;
      }
      else if(pro>num){
        return false;
      }
      pro = pro * 2;
      return exist(num,pro);
    }
}
