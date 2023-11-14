package ImportantProblems;
import java.util.*;
public class LetterCombinationsOfAPhone{
    public static String[] keypad = {".","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static ArrayList<String> PrintCombination(String str,int index,String combination,ArrayList<String> list){
         if(index==str.length()){
          list.add(combination);
          return list;
         }
        char currentChar = str.charAt(index);
        String mapping = keypad[currentChar-'0'];
        for(int i = 0;i<mapping.length();i++){
            char ch = mapping.charAt(i);
           PrintCombination(str, index+1, combination+ch, list);
        }

        return list;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.isEmpty()){
            System.out.println(new ArrayList<>());
        }
        else if(s.length()==1){
            ArrayList<Character> list = new ArrayList<>();
         String ans = Find(s.charAt(0));
         for (int i = 0; i < ans.length(); i++) {
            list.add(ans.charAt(i));
         }
         System.out.println(list);
        }
        else{
       int temp1 = Character.getNumericValue(s.charAt(0));
        int temp2 = Character.getNumericValue(s.charAt(1));
        String s1 = Find(temp1);

        String s2 = Find(temp2);
        ArrayList<String> answer = new ArrayList<>();
        Method1(s1, s2, answer );
        System.out.println(answer);
        }
       System.out.println(PrintCombination(s,0,"",new ArrayList<String>()));
    }
    static String Find(int temp){
        switch(temp){
            case 2 : return "abc";
           
            case 3 : return "def";
            
            case 4 : return  "ghi";
           
            case 5 : return "jkl";
       
            case 6 : return  "mno";
           
            case 7 : return  "pqrs";
           
            case 8: return  "tuv";
           
            case 9 :return "wxyz";
        }
        return " ";
    }
         
  
    static ArrayList<String> Method1(String s1,String s2,ArrayList<String> list){
     for (int i = 0; i < s1.length(); i++) {
        char ch = s1.charAt(i);
        list.addAll(GetCombinations(ch,s2));
     }
     return list;
    }
   static ArrayList<String> GetCombinations(char ch, String s2) {
    ArrayList<String> temp = new ArrayList<>();
       for(int i = 0;i<s2.length();i++){
       String s = ch + String.valueOf(s2.charAt(i));
       temp.add(s);
       }
       return temp;
    }
   
}
