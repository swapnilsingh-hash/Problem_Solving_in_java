import java.util.Scanner;
public class Day14 {

    public static void inverted_rotated_half_pyramind_with_number(int number){
        // outer loop for rows
        for(int i=1;i<=number;i++){
            // innter loop for columns and number
            for(int j=1;j<=number-i+1;j++){
                System.out.print(j+ " ");
                
            }
            System.out.println();

        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        inverted_rotated_half_pyramind_with_number(number);

    }
    
}
