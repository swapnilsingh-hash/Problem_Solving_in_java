import java.util.*;
public class Day19_SubArraySum {


    public static void PrintMaxSubarray(int numbers[]){
       int CurrSum=0;
       int MaxSum=Integer.MIN_VALUE;
        for(int i=0;i< numbers.length;i++){
            int start=i;
            for(int j=1;j<numbers.length;j++){
                int end=j;
                for(int  k=start; k<end;k++){
                    CurrSum+= numbers[k];
                }
                
                System.out.println(CurrSum);
                if(MaxSum < CurrSum){
                    MaxSum= CurrSum;
                }
               
            }
             
     }
        System.out.println("Total SubArray max Sum is:"+MaxSum);
}

    public static void main(String args[]){
        int numbers[]={2,4,6};
        PrintMaxSubarray(numbers);

    }
    
}
