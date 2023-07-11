import java.util.*;
public class Day17 {

    public static int LeanerSearch(int numbers[],int keys){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==keys){
                return i;
            }
        }
        return -1;
    }

    /**
     * @param args
     */
    public static void main(String args[]){
        int numbers[]={2,4,6,8,10,12,14,16};
        int keys=20;

        int index = LeanerSearch(numbers,keys);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("The key index values is :"+ index);
        }
        

    }
    
}
