package ImportantProblems;
import java.util.*;
public class SubSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next();
         subset(s, "");
        
    }
    
    static void subset(String s,String ans){

         if(s.isEmpty()){
             System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        subset(s.substring(1),ans+ch);
        subset(s.substring(1),ans);
    }
}
