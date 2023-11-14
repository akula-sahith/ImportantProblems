package ImportantProblems;
import java.util.*;
public class SkippinjACharacter {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String");
    String s = sc.next();
    System.out.println("Enter character to remove");
    char ch = sc.next().charAt(0);
    String ans = "";
    String finans = remove(s,ans,ch);
    System.out.println(finans);
}
static String remove(String s,String ans,char ch){
    if(s.isEmpty()){
        return ans;
    }
     if(s.charAt(0)==ch){
     return remove(s.substring(1),ans,ch);
     }

      ans = ans + s.charAt(0);
      return remove(s.substring(1),ans,ch);
    }
}


 
