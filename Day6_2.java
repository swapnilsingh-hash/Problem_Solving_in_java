import java.util.Scanner;
public class Day6_2 {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter your number: ");
    int num= sc.nextInt();

    for (int i=1; i<=num;i++){
        for (int j=1;j<=num; j++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }


    }
    
}
