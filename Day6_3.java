import java.util.Scanner;
public class Day6_3 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number : ");
    int number = sc.nextInt();

    while (number > 0){
        int lastDigit = number % 10;
        System.out.print(lastDigit);
        number = number/10;


    }
    System.out.println();



    }
    
}
