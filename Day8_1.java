import java.util.Scanner;
public class Day8_1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number =sc.nextInt();

        for (int i=1;i<=number;i++){
            for (int j=1;j<=(number-i+1);j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }

}
