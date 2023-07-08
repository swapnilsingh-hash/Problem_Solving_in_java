import java.util.Scanner;
public class Day12_1 {

    public static int SumOfDigits(int number){
        int temp =  number;
        int sum=0;
        while(number >0){
        int lastdigits = number %10;
        sum=sum+lastdigits;
        number = number /10;
        }
        
        System.out.println(temp + " Total sum is :"+ sum);
        return 1;

    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number= sc.nextInt();
        SumOfDigits(number);



    }
    
}
