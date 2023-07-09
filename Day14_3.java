import java.util.Scanner;
public class Day14_3 {

    public static void Butterfly_pattern(int number){
        // 1st Half-OUter loop 
        for(int i=1;i<=number;i++){
            // star-i 
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }

            // spaces 
            for (int j=1; j<=2*(number-i);j++){
                System.out.print(" ");
            }


            // star-i
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();

        }
    
        // 2st Half-OUter loop 
        for(int i=number;i>=1;i--){

            // star-i 
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }

            // // spaces 
            // for (int j=1; j<=2*(number-i);j++){
            //     System.out.print(" ");
            // }


            // star-i
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();

        }
        
    }

    

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number= sc.nextInt();
        Butterfly_pattern(number);
    }
    
}
