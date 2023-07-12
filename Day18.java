import java.util.*;
public class Day18 {

    public static int BinarySearch(int numbers[],int key){
        int start= 0; 
        int end = numbers.length-1;

        while(start <=end){
            int mid = (start + end) / 2;

            if(numbers[mid]==key){
                return mid;
            }

            if(numbers[mid] < key){
                start= mid+1;
            }else{
                end = mid-1;
            }


        }

    return -1;



    }

    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,10};
        int key=19;

        System.out.println("the index of the key : "+BinarySearch(numbers,key)) ;



    }
    
}
