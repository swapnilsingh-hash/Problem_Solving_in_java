import java.util.Scanner;
public class Day5_1 {
    public static void main(String arg[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter you temperature: ");
    double temp=sc.nextDouble();

    if(temp>=100){
        System.out.print("You have a fever");
    }else{
        System.out.print("You do not have a fever");
    }


    }
    
}
