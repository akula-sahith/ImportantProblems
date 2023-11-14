package ImportantProblems;
import java.util.*;
public class FindArrayAscendingOrNot {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {1,2,3,4};
    boolean ans = sorted(arr,0);
    System.out.println(ans);
    
 }   
 static boolean sorted(int[] arr,int i){
    if(i==arr.length-1){
        return true;
    }
    boolean temp = arr[i]<arr[i+1];
   
    return temp && sorted(arr,i+1);
 }
}