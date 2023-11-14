package ImportantProblems;
import java.util.*;
public class CollegeCompetition2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String str = sc.next();
    //    System.out.println(Method2(str));
        String s = "Let's take LeetCode contest";
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb  = new StringBuilder(arr[i]);
           arr[i] =  sb.reverse().toString();
        }
        StringBuilder answer = new StringBuilder();
       for (int i = 0; i < arr.length; i++) {
        answer.append(arr[i] + " ");
       }
       System.out.println(answer);
    }
    
    static String defangIPaddr(String address) {
       StringBuilder sb = new StringBuilder(address);
       return address.replace(".", "[.]");
    }
    static String Method2(String str){
        StringBuilder answer = new StringBuilder();
        for(char ch : str.toCharArray()){
          if(ch=='.'){
            answer.append("[.]");
          }
          else{
            answer.append(ch);
          }
        }
        return answer.toString();
    }
}
