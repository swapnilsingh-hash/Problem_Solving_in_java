import java.util.Scanner;
public class Day14_1 {

    public static void Floyds_triangle(int number){
        int counter=1;
        // outer loop to check number of row
        for (int i=1;i<=number;i++){
            // inner loop to check how many times couter will be printed
            for(int j=1;j<=i;j++){
               
                System.out.print(counter+" ");
                counter++;
                
            }
            System.out.println();
           

        }



    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number= sc.nextInt();
        Floyds_triangle(number);


    }
    
}
