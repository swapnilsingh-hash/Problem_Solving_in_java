import java.util.Scanner;
public class Day12 {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your number :");
        int palindrome= sc.nextInt();

        if (ispalindrome(palindrome)){

            System.out.println("It is palindrome");

        }else{
            System.out.println("it is not palindrome.");
        }





    }

    public static boolean ispalindrome(int Number){
        int palindrome = Number;
        int reverse = 0;

        while (palindrome > 0){
            int remainder = palindrome % 10;
            reverse = reverse *10  + remainder;
            palindrome = palindrome / 10;
        }
        return true;
        
    }







}



    