package ImportantProblems;
import java.util.*;
public class FindTheRightMostSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int count = 0;
        String s = Integer.toBinaryString(n);
        for (int i = s.length()-1; i >= 0; i--) {
      //   System.out.println(count);
        count++;
            if(s.charAt(i)=='1'){
                break;
            }
        }
        System.out.println(count);
    }
}

