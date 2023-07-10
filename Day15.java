import java.util.Scanner;
public class Day15 {

    public static void solid_rhombus(int number){
        // outer loops
        for(int i=1;i<=number;i++){

            // spaces
            for(int j=1;j<=(number-i);j++){
                System.out.print(" ");
            }
            // Start
            for(int j=1;j<=number;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number= sc.nextInt();
        solid_rhombus(number);

    }
    
}
