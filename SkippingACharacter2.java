package ImportantProblems;
import java.util.*;
public class SkippingACharacter2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String q = sc.next();
        String ans1  = answer(q);
        System.out.println(ans1);
        String ans2  = answer2(q);
        System.out.println(ans2);
        String ans3 = answer3(q); 
     System.out.println(ans3);
    }
    static String answer(String s){
    if(s.isEmpty()){
        return "";
    }
    char ch = s.charAt(0);
    if(ch=='a'){
        return answer(s.substring(1));
    }
    return ch + answer(s.substring(1));

    }
    static String answer2(String s){
    if(s.isEmpty()){
        return "";
    }
    if(s.startsWith("apple")){
        return answer2(s.substring(5));
    }
    else{
    return s.charAt(0) + answer2(s.substring(1));
    }
    }
    static String answer3(String s){
      if(s.isEmpty()){
        return "";
    }
    if(s.startsWith("app")&&!s.startsWith("apple")){
        return answer3(s.substring(3));
    }
    else{
    return s.charAt(0) + answer3(s.substring(1));
    }  
    }
}
