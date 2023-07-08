import java.util.Scanner;
public class Day13{

    public static void inverted_rotated_half_pyramind(int number){
        // outer loops
        for (int i=1;i<=number;i++){
            // this loop is for spaceas
            for (int j=1;j<=number-i;j++){
                System.out.print(" ");
            }
            // this is for star
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();

        }
        
        


    }


    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        inverted_rotated_half_pyramind(number);

    }
}