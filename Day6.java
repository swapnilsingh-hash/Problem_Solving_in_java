import java.util.Scanner;
public class Day6 {

    public static void main(String agrs[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter your number : ");
    int number= sc.nextInt();
    int sum = 0;
     
    for (int i =0; i<=number; i++){
         sum = sum+i;
    }

    System.out.println("Total sum of given number :"+ sum);


    }
    
}
