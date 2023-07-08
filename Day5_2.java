import java.util.Scanner;
public class Day5_2 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you number between 1 to 7: ");
        int number=sc.nextInt();

        switch(number){
            case 1: System.out.print("Monday");
            break;

            case 2: System.out.print("Tuesday");
            break;

            case 3: System.out.print("Wednesday");
            break;

            case 4: System.out.print("thursday");
            break;

            case 5: System.out.print("Friday");
            break;

            case 6: System.out.print("saturday");
            break;

            case 7: System.out.print("Sunday");
            break;

            default: System.out.println("Invalid number");
            
            
                  

            
        }

    }
    
}
