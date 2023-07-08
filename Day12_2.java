import java.util.Scanner;
public class Day12_2 {

    public static void Hollow_rectangle(int Rows,int Columns){
        // outer loops-rows
        for (int i=1; i<=Rows; i++){
            // inner loop -columns
            for (int j=1; j<=Columns;j++){

                if (i==1||i==Rows || j==1|| j== Columns){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Rows: ");
        int Rows= sc.nextInt();
        System.out.println("Enter your Rows: ");
        int Columns= sc.nextInt();
        Hollow_rectangle(Rows,Columns);

    }
    
}
