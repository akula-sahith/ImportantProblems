package ImportantProblems;
import java.util.*;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        int c = 2;
        for(int i=2;i<=n;i++){
            boolean ans = true;
        while(c*c<=i){
            if(i%c==0||i==1){
                ans = false;
                break;
            }
            c++;
        }
        if(ans == true){
        System.out.println(i);
        }
    }
}
}