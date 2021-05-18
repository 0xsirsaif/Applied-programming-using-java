import java.util.Scanner;
        
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("input number of rows:  ");
        int rows = input.nextInt();
        
        System.out.println("input number of columns:  ");
        int columns = input.nextInt();
        
        int [][] Array_1 = new int[rows][columns];
        int [][] Array_2 = new int[rows][columns];
        int [][] result_1 = new int[rows][columns];
        int [][] result_2 = new int[rows][columns];
        
        System.out.println("enter the elemets of the first Matrix");
        for(int i=0; i<Array_1.length; i++){
            for(int j=0; j<Array_1[0].length; j++){
                Array_1[i][j] = input.nextInt();
            }
        }
        
        System.out.println("enter the elemets of the first Matrix");
        for(int i=0; i<Array_2.length; i++){
            for(int j=0; j<Array_2[0].length; j++){
                Array_2[i][j] = input.nextInt();
            }
        }
        
        result_1 = multiply(Array_1, Array_2);
        result_2 = Sum(Array_1, Array_2);
        
        Display(result_1);
        Display(result_2);
        
        
    }
    
    public static int[][] multiply(int [][]Array_1, int [][]Array_2){
        int [][] result = new int[Array_1.length][Array_2[0].length];
        
        if(Array_1.length == Array_2.length){
            for(int i=0; i<result.length; i++){
                for(int j=0; j<result[0].length; j++){ 
                    for(int k=0; k<Array_2.length; k++){
                        result[i][j] += Array_1[i][k] * Array_2[k][j];
                    }
                }
            }
        }else{
            System.out.println("Error");
        }
        
        return result;
    }
    
    public static int[][] Sum(int [][]Array_1, int [][]Array_2){
        int rows = Array_1.length;
        int columns = Array_2[0].length;
        
        int[][] sum = new int[rows][columns];
        if(Array_1.length == Array_2.length){
            for(int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    sum[i][j] = Array_1[i][j] + Array_2[i][j];
                }
            }
        }else {
            System.out.println("Error");
        }
        
        return sum;
    }
    
    public static void Display(int [][]Array){
        for(int i=0; i<Array.length; i++){
            for(int j=0; j<Array[0].length; j++){
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();

        }
    }
}
