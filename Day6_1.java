import java.util.Scanner;
public class Day6_1 {

    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter you natural number: ");
        int number= sc.nextInt();
        int sum=0;
        int counter=1;

        while(number>=counter){
            sum=sum+counter;
            counter++;

        }
        System.out.println("Total natural number sum is : "+ sum);
    }
    
    
}
