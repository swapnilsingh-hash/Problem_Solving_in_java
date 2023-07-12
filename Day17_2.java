public class Day17_2 {


    // Find out the Largegst element in array
    public static int LargestNumberArray(int numbers[]){
        int largest =Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i < numbers.length;i++){
            if(largest < numbers[i]){
                largest = numbers[i];

            }

            // Find out the smallest value in given array
            if(smallest > numbers[i]){
                smallest = numbers[i];

            }

            
        }
        System.out.println("the smallest value is :"+ smallest);
        return largest;
    }

    public static void main(String args[]){
        int numbers[]={1,2,6,3,5};
        

        int ArrayLargest= LargestNumberArray(numbers);
        System.out.println("The Largest number is the Array is :"+ArrayLargest);

    }
    
    
}
