import java.util.*;
public class Day18_2 {

    /**
     * @param numbers
     */
    public static void PrintPairsArray(int numbers[]){
         int total_Pais=0;
        for(int i=0;i < numbers.length ; i++){
             int curr = numbers[i];
            for(int j=i+1;j < numbers.length ;j++){
                System.out.print("("+ curr +","+ numbers[j] +")");
                total_Pais++;

            }
            System.out.println();

        }
        
        System.out.println("Total pairs is :"+ total_Pais);
    }

    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12};
        PrintPairsArray(numbers);

        
    }
    
}
