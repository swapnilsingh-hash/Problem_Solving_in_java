import java.util.Scanner;
public class Day5_4 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your year : ");
        int year =sc.nextInt();

        if (year % 4==0){
            if (year % 100 ==0){
                if (year % 400 ==0){
                    System.out.println("Yes,It is leap year");
                }
            }else{
                System.out.println("yes,It is a leap year");
            }
        }else{
            System.out.println("No,it is not a leap year");
        }

    }
    
}
