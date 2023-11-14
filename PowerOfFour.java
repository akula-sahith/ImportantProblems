package ImportantProblems;
import java.util.*; 
public class PowerOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter number");
         int n = sc.nextInt();
         
         if(((n & (n - 1)) == 0)){
            int ans = (int)(Math.log(n)/Math.log(2)) + 1;
            int use = ans - 1;
            if(use%2==0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
         }
         else{
            System.out.println("no");
         }
    }
}
