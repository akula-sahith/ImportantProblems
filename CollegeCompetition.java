package ImportantProblems;
import java.util.*;
public class CollegeCompetition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases");
       int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println("Enter the string");
            String s = sc.next();
            int k = 1;
            int count = s.length();
            while(k<=s.length()){
               String temp = s.substring(k, s.length());
               for (int j = 0; j < temp.length(); j++) {
                     if(temp.charAt(j)==s.charAt(j)){
                        count++;
                     }   
                     else{
                     break;
                     }
               }
               k++;
            }
            System.out.println(count);
        }
        
   
       
       /*  System.out.println("Enter number of test cases");
        int t = sc.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            System.out.println("Enter the string");
            String s = sc.next();
            
            int count = s.length(); // Initialize count with the length of the string
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(0)) {
                    count++;
                } else {
                    break;
                }
            }
            
            System.out.println(count);
        }

        sc.close();*/
    
}

    }
