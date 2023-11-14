package ImportantProblems;
import java.util.*;
public class BinarySearchRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int target = 5;
        int s = 0;
        int e = arr.length-1;
      int ans   =   bin(arr,target,s,e);
      System.out.println(ans);
    }
    static int bin(int[] arr,int target,int s,int e){
     if(s>e){
        return -1;
     }
     int mid = s + (e-s)/2;
     if(arr[mid]==target){
       return mid;
     }
     else if(arr[mid]<target){
        s = mid + 1;
       return bin(arr,target,s,e);
     }
     else{
        e = mid - 1;
      return   bin(arr,target,s,e);
     }
    
    
    }
}
