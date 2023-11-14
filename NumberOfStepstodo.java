package ImportantProblems;
import java.util.*;
class NumberOfStepstodo{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int count = 0;
    int ans = numberOfSteps(num,count);
    System.out.println(ans);
    }
    static int numberOfSteps(int num,int count) {
        if(num==0){
            return count;
        }
        if(num%2==0){
            count++;
            num = num/2;
            return numberOfSteps(num,count);
        }
        count++;
        return numberOfSteps(num-1,count);
    }
}