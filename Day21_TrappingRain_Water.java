import java.lang.Math.*;
import java.util.*;
public class Day21_TrappingRain_Water {


  
    public static int TrappedRain_Water(int height[]){
        int n = height.length;
        // Calculate the left max boundary-- Array
           
          int leftmax[]= new int[n];
          leftmax[0] = height[0];
          for(int i = 1;i < n;i++){
            leftmax[i] = Math.max(height[i] , leftmax[i-1]);
          }

        // Calculate the rigth max boundary-- Array
        int rightmax[]= new int[n];
        rightmax[n-1]= height[n-1];
        for (int i=n-2;i >= 0;i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]) ;
        }

        int trapppedWater = 0;
        // loop
        for(int i=0;i< n;i++){
            // waterLevel = min(leftMax boundary , RightMax boundary)

            int WaterLevel= Math.min(leftmax[i], rightmax[i]);

              // tripped water= WaterLevel - height[i]

              trapppedWater += WaterLevel - height[i];

        }
        return trapppedWater;
        
      

    }

    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        int Total_TrippedWater = TrappedRain_Water(height);
        System.out.println("Total tripped water is :"+ Total_TrippedWater );


    }
}
    

