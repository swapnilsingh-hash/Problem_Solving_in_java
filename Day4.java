import java.util.Scanner;

public class Day4 {
    public static void main(String args[]){

    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the first number : ");
    int n1=sc.nextInt();
    System.out.println("Enter the second number : ");
    int n2= sc.nextInt();
    System.out.println("Enter the third number : ");
    int n3=sc.nextInt();

    if(n1 >= n2){
        if(n1 >= n3)
        {
            System.out.println("n1 is bigger than other two's");
        } else{
            System.out.print("n3 is bigger than other two's");
        }
    }else if (n2 >= n3){
        System.out.println("n2 is bigger than other two's");

        
    }else{
        System.out.println("exit");
    }
    

    }

    
     
    

    
   
    
}
