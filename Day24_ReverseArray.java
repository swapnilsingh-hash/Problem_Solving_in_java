import java.util.*;
public class Day24_ReverseArray {

    public static void Reverse_Array(int arr[]){
        
        for(int i=arr.length-1;i >= 0;i--){
            System.out.print(arr[i]+" ");


        }
    }

    public static void main(String args[]){
        // int arr[] = {4, 5, 1, 2};
        int arr[] = {1, 2, 3};
        Reverse_Array(arr);
    }
    
}
