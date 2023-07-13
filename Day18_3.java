import java.util.*;
public class Day18_3 {

    public static void PrintSubarray(int numbers[]){
        int total_Subarray=0;
        for(int i=0;i< numbers.length;i++){
            int start=i;
            for(int j=1;j<numbers.length;j++){
                int end=j;
                for(int k=start; k<=end;k++){
                    System.out.print(numbers[k]+" ");
                    total_Subarray++;
                    
                }
                System.out.println();

                
                
            }
            System.out.println();
           
            
        }
         System.out.println("total subarray is :"+total_Subarray);
         
         
    }

    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        PrintSubarray(numbers);

    }
    
}
