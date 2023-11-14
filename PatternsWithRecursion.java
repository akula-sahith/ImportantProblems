package ImportantProblems;
import java.util.*;
public class PatternsWithRecursion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Triangle 1");
         PrintPattern1(5,0);
         System.out.println("Triangle 2");
         PrintPattern2(1,0);
         System.out.println("Triangle 3");
         PrintPattern3();
         System.out.println("Number Triangle : 1");
         PrintPattern4(1, 0);
         System.out.println("Number  Triangle : 2");
         PrintPattern5(5,0);
    }
    static void PrintPattern1(int r,int c){
     if(r==0){
        return;
     }
     if(c<r){
        System.out.print("*" + " ");
        PrintPattern1(r, c+1);
     }
     else{
       System.out.println();
       PrintPattern1(r-1, 0);
     }
    }
    static void PrintPattern2(int r,int c){
        if(r==5){
           return;
        }
        if(r>c){
            System.out.print("*" + " ");
            PrintPattern2(r, c+1);
        }
        else{
            System.out.println();
            PrintPattern2(r+1,0);
        }
    }
    static void PrintPattern3(){
        PrintPattern2(1,0);
        PrintPattern1(3,0);
    }
    static void PrintPattern4(int r,int c){
        if(r==5){
            return;
        }
        if(r>c){
            System.out.print(c+1 + " ");
            PrintPattern4(r, c+1);
        }else{
            System.out.println();
            PrintPattern4(r+1,0);
        }
    }
    static void PrintPattern5(int r,int c){
     if(r==0){
        return;
     }
     if(c<r){
        System.out.print(c+1 + " ");
        PrintPattern5(r, c+1);
     }
     else{
       System.out.println();
       PrintPattern5(r-1, 0);
     }
    }
    
}