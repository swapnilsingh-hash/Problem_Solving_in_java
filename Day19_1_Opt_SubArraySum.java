import java.util.Scanner;
import java.util.*;
public class Day19_1_Opt_SubArraySum {


    // Optimizaton method for SubArray sum
    public static void Opt_PrintMaxSubarray(int numbers[]){
        int CurrSum=0;
        int MaxSum=Integer.MIN_VALUE;

        // Create prefix array
        int prefix[]= new int [numbers.length];
        prefix[0]=numbers[0];

        // Calculate the prefix array
        for(int i=1;i<numbers.length;i++){
            prefix[i]= prefix[i-1] + numbers[i];
        }
        
        for(int i=0;i< numbers.length;i++)
         {
             int start=i;
             for(int j=1;j<numbers.length;j++)
             {
                 int end=j;
                 
                //  if start value will be Zero then prefix[start-1] value will be Zero then We have written the below
                // code the same if start value will be zero then the value will be prefix[end].
                 CurrSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                 if(MaxSum < CurrSum){
                     MaxSum= CurrSum;
                 }
                
             }
              
      }
         System.out.println("Total SubArray max Sum is:"+MaxSum);
 }
 
     public static void main(String args[]){
         int numbers[]={2,4,6};
         Opt_PrintMaxSubarray(numbers);
 
     }
    
}
