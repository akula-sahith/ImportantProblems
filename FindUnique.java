package ImportantProblems;
import java.util.*;
public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,6,4,2};
        System.out.println(ans(arr));
      //  System.out.println(0^5);
      //  System.out.println(0^2^4^6^9^6^4^2);
    }
    static int ans(int[] arr){
        int unique = 0;
        for(int n  : arr){
            unique = unique^n;
        }
        return unique;
    }
}
