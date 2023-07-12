import java.util.*;
public class Day17_1 {

    public static int LargestNumberArray(int numbers[]){
        int largest =Integer.MIN_VALUE;
        for(int i=1;i<numbers.length;i++){
            if(largest < numbers[i]){
                largest = numbers[i];

            }

            
        }
        return largest;
    }

    public static void main(String args[]){
        int numbers[]={1,2,6,3,5};
        

        int ArrayLargest= LargestNumberArray(numbers);
        System.out.println("The Largest number is the Array is :"+ArrayLargest);

    }
    
}
