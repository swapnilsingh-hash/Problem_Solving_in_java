import java.util.Scanner;
public class Day10_4 {

    public static int Sum(int a,int b){
        return a+b;
    }

    public static int Sum(int a,int b,int c){
        return a+b+c;
    }

    public static float Sum(float a,float b){
        return a+b;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println(Sum(5,4));
        System.out.println(Sum(5,4,6));
        System.out.println(Sum(4.3f,6.7f));







    }
    
}
