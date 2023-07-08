import java.util.Scanner;
public class Day10_3 {


    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n; i++){
            fact = fact * i;
        }
        return fact;
    } 


        public static int biocoffec(int n,int r){
            int fact_n= factorial(n);
            int fact_r= factorial(r);
            int fact_nmr= factorial(n-r);
            int biocoffec = fact_n/(fact_r * fact_nmr);
            return biocoffec;
        }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println(biocoffec(5,2));

    }
    
}
