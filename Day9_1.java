import java.util.Scanner;
public class Day9_1 {

    // Created a function to calculate the two numbers
    // public static void Sumoftwonumber(int a,int b){
    //     int sum= a + b;
    //     System.out.println("sum is :"+ sum);
    //     return;
    // }
        // How too print sum value inside the main function:
    public static int Sumoftwonumber(int a,int b){
        int sum= a + b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int a= sc.nextInt();
        System.out.println("Enter your second number : ");
        int b= sc.nextInt();
        int totalsum= Sumoftwonumber(a,b);
        System.out.println("sum is :"+ totalsum);


    }
    
}
