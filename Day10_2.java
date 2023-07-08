import java.util.Scanner;
public class Day10_2 {


    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n; i++){
            fact = fact * i;
        }
        return fact;
    } 

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your numbers : ");
        int n=sc.nextInt();
        int fact=factorial(n);
        System.out.println(fact);

    }
    
}
