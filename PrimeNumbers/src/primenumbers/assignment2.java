package PrimeNumbers;
import java.util.Scanner;

public class assignment2 {
    
    public static void main(String[] args) {
        // Create scanner Object
        Scanner input = new Scanner(System.in);
        // the count of prime numbers to print
        int count = input.nextInt();
        
        printPrime(count);
    }
    
    public static int isPrime(int N){
        for(int i=2; i < N; i++){
            if(N % i == 0){
                return 0;
            }
        }
        return 1;
    }
    
    public static void printPrime(int count){
        int currentCount = 0;
        int num = 1;
        while(currentCount < count){
            if(isPrime(num) == 1){
                System.out.print(num + " is a prime number" + "\n");
                currentCount++;
            }
            num++;
        }
    }
}
