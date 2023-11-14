package ImportantProblems;
import java.lang.reflect.Array;
import java.util.*;
public class ReturningArrayListWithoutPassingArgument {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {1,2,3,4,4,4,5};
    int t = 4;
   
   ArrayList<Integer> ans = findall(arr,t,0);
   System.out.println(ans);
}   
//static ArrayList<Integer> answers = new ArrayList<>();
static ArrayList<Integer> findall(int[] arr,int t,int start){
   ArrayList<Integer> list = new ArrayList<>();
   if(start==arr.length){
      return list;
   }
   if(arr[start]==t){
      list.add(start);
   }
   ArrayList<Integer> ansfrombelowcalls = findall(arr, t, start+1);
   list.addAll(ansfrombelowcalls);
    
   return list;
}
}
