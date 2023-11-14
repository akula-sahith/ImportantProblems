package ImportantProblems;
import java.util.*;
public class ReverseArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    reverse(arr,0,arr.length-1);
    System.out.println(Arrays.toString(arr));

  }  
  static void reverse(int[] arr,int first,int last){
    while(first<last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
        first++;
        last--;
    }
  }
}
