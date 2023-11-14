package ImportantProblems;
import java.util.*;
public class PrintAllPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.next();
        System.out.println("The permutations of the given String are as Follows");
       PrintPermutationsOfString(s,"");
       // System.out.println("Enter array elements");
     //   int[] arr = {1,2,3};
       // PrintPermutationOfArray(arr,new ArrayList<>());
    //   ArrayList<String> ans = PrintPermutationsOfStringAsAList(s, "", new ArrayList<>());
   // System.out.println("Number of Permutations");
      // System.out.println(ans);

    }
    public static void PrintPermutationsOfString(String s,String ans){
       if(s.isEmpty()){
        System.out.println(ans);
        return;
       }

        for(int i = 0;i<s.length();i++){
           char ch  = s.charAt(i);
           String temp = s.substring(0, i) + s.substring(i+1);
        PrintPermutationsOfString(temp, ans+ch);
        }
      
    }
 /*    public static ArrayList<String> PrintPermutationsOfStringAsAList(String s,String ans,ArrayList<String> list){
       if(s.isEmpty()){
        list.add(ans);
       
       }

        for(int i = 0;i<s.length();i++){
           char ch  = s.charAt(i);
           String temp = s.substring(0, i) + s.substring(i+1);
           return PrintPermutationsOfStringAsAList(temp,ans+ch,list);
        }
        return list;
    }*/
  public static void PrintPermutationOfArray(int[] arr,ArrayList<Integer> list){
      if(arr.length==0){
        System.out.println(list);
        list.clear();
        return;
      }
    for(int i = 0;i<arr.length;i++){
        list.add(arr[i]);
        int[] arr1 = Arrays.copyOfRange(arr, 0, i);
        int[] arr2 = Arrays.copyOfRange(arr,i+1,arr.length);
        int[] temp = Merge(arr1,arr2);
        PrintPermutationOfArray(temp, list);
    }
  }
public static int[] Merge(int[] arr1, int[] arr2) {
 int[] mix = new int[arr1.length+arr2.length];
 int k = 0;
 for (int i = 0; i < arr1.length; i++) {
     mix[k] = arr1[i];
     k++;
 }  
 for(int j = 0;j<arr2.length;j++){
  mix[k] = arr2[j];
  k++;
 }
 return mix;
}
}
