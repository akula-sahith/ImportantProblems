package ImportantProblems;
import java.util.*;
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         boolean[] arr = new boolean[n+1];
         //initially in a boolean array all the values are falase;
         //so let us comsider all false elements as prime
         //so after that we have to make all the multiples of prime numbers to true
         sieve(n,arr);
        }
        static void sieve(int n,boolean[] arr){
         for (int i = 2; i*i<=n; i++) {
           if(arr[i]==false){
            for (int j = i*2; j<=n; j = j + i) {//this loop will make all multiples of 'i' which is a prime number will make multiples of it to true
            //we used j + i you can observe the pattern for making all 2 multiples to true we have to increment the value by 2
            //similarly when dealing with 3 we to make it multiples to true every time we should incremnt it by 3.
               arr[j] = true; 
            }
           } 
         }
         for (int i = 2; i < arr.length; i++) {
            if(arr[i]==false){
                System.out.println(i + "");
            }
         }
        }
    }
