import java.util.Scanner;

public class Day15_2 {

    public static void Diamond_patten(int number){
        // 1st half
        for(int i=1;i<=number;i++){

            // space
            for(int j=1;j<=(number-i);j++){
                System.out.print(" ");

            }

            // stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2st half
        for(int i=number;i>=1;i--){

            // space
            for(int j=1;j<=(number-i);j++){
                System.out.print(" ");

            }

            // stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number= sc.nextInt();
        Diamond_patten(number);
        
    }
    
}
