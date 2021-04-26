package PrimeNumbers;

public class PrimeNumbers {
    
    public static void main(String[] args) {
        int count = 0;
        int N = 1;
        while(count <= 50){
            if(isPrime(N) == 0){
                System.out.print(N + "\t");
                count++;
            }
            N++;
        }
    }
    
    public static int isPrime(int N){
        for(int i=2; i < N; i++){
            if(N % i == 0){
                return 0;
            }
        }
        return 1;
    }
}
