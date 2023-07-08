import java.util.Scanner;
public class Day11_4 {

    public static void isEven(int n){
        if (n % 2==0){
            System.out.println("EvenNumbers");
        }
        else{
            System.out.println("OddNumbers");
        }
    }

    public static void main(String agrs[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your number: ");
        int Number= sc.nextInt();
        isEven(Number);

    }
    
}
