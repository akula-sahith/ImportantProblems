package ImportantProblems;
import java.util.*;
public class PowerOfThree {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      if(((n&(n-1))==(n-1))){
        System.out.println("True");
      }  
      else{
        System.out.println("False");
      }
    }
}
