import java.util.Scanner;

public class Day5 {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the your number : ");
        int input=sc.nextInt();

        if (input >=0){
            System.out.println("It is positive number");
        }else{
            System.out.println("It is negative number");
        }

    }


    
}
