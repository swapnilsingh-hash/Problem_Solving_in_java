import java.util.Scanner;
public class Day10 {

    public static void Swap(int a,int b){
        // Swap two values with third variable
        int temp = a;
        a = b;
        b = temp;
        // System.out.println("a values is :"+ a);
        // System.out.println("b values is :"+ b);

    }
    public static void main(String rgs[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a=sc.nextInt();
        System.out.println("Enter your second values : ");
        int b=sc.nextInt();
        Swap(a,b);
        System.out.println("a values is :"+ a);
        System.out.println("b values is :"+ b);



    }
    
}
