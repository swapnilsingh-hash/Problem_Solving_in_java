import java.util.Scanner;
public class day6_4 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter yours number : ");
    int number=sc.nextInt();

    if(number==2){
        System.out.println("Given number is prime number");
    }else{
        boolean isprime=true;
    for(int i=2; i<= number-1;i++){
        if(number %i==0){
            isprime=false;
        }
    }

    if(isprime==true){
        System.out.println(" Given number is prime number");
    }else{
        System.out.println("Given number is not a prime number");
    }

    }

    
    


    }
    
}
