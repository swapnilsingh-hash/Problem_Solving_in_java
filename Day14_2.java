import java.util.Scanner;
public class Day14_2 {

    /**
     * @param number
     */
    public static void zero_one_triangle(int number){
        for (int i=1;i<=number;i++){
            for(int j=1;j<=i;j++){
                if((j +i)% 2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();

        }

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number= sc.nextInt();
        zero_one_triangle(number);
    
}
}
