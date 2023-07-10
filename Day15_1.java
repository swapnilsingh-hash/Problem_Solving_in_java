import java.util.Scanner;

public class Day15_1 {


    public static void Hollow_rhombus(int number){
        // for outer loop or rows
        for(int i=1;i<=number;i++){

            // space
            for(int j=1;j<=(number-i);j++){
                System.out.print(" ");
            }

            // hollow rectangle
            for(int j=1;j<=number;j++){
                if(i==1 || i== number ||j==1 ||j == number){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number= sc.nextInt();
        Hollow_rhombus(number);

    }
    
}
