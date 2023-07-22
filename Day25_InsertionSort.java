import java.util.*;
public class Day25_InsertionSort{

    public static void InsertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int Current = arr[i];
            int Previous= i-1;
            // Finding out the current position to insertion
            while(Previous >= 0 && arr[Previous] > Current){
                arr[Previous+1]= arr[Previous];
                Previous--;
            }
            // insertion 
            arr[Previous+1]=Current;
            

        }

    }

    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        InsertionSort(arr);
        PrintArray(arr);
    }
}