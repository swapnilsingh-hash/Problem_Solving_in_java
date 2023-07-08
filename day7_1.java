import java.util.Scanner;
public class day7_1 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter you number: ");
        int num=sc.nextInt();
        int evenSum=0;
        int OddSum=0;

        if (num % 2 ==0){
            evenSum= evenSum+num;
            System.out.println("EvenSum number is :"+ evenSum);
        }else{
            OddSum=OddSum+num;
            System.out.println("OddSum number is :" + OddSum);
        }
    }
    
}
