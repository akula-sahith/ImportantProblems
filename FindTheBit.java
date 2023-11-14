package ImportantProblems;
import java.util.*;
public class FindTheBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int i = 3; 
        System.out.println(find(n,i));
    }
    static int  find(int n,int i){
        int ans = n&(1<<(i-1));
      //  String binaryResult = Integer.toBinaryString(ans);
       // int re = Integer.parseInt(binaryResult);
      ///  System.out.println(re);

        return ans;
    }
}
