package ImportantProblems;
import java.util.*;
public class LinearSearchWithRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int ans = find(arr,6,arr.length-1);
        System.out.println(ans);
    }
    static int find(int[] arr,int target,int i){
        if(i>arr.length-1){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return find(arr,target,i+1);
    }
}
