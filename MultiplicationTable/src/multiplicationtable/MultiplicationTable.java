package MultiplicationTable;
import java.util.Scanner;


public class MultiplicationTable {

    public static void main(String[] args) {
        // Create scanner Object
        Scanner input = new Scanner(System.in);
        // take input from the user
        int number = input.nextInt();
        
        // print the heading of the table
        for(int i=1; i<=9; i++){
            System.out.print("      " + i);
        }
        System.out.print("\n-----------------------------------------------\n");
        System.out.print(number  + "      " + "|");
        
        // prnt Multiplications 
        for(int i=1; i<=9; i++){
            System.out.printf("%4d", number * i);
        }
        
        System.out.print("\n");
    }
}
