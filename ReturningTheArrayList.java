package ImportantProblems;
import java.util.*;
public class ReturningTheArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,1,2,2,2,3,3,};
         ArrayList<Integer>list = new ArrayList<>();
         Find(arr,2,0,list);
         
    }
    static ArrayList  Find(int[] arr,int target,int i,ArrayList<Integer>list){
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        return Find(arr,target,i+1,list);
    }
}
