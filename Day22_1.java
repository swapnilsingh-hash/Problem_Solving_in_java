public class Day22_1 {

    public static int FindTarget(int nums[]){
        int IndexValue=0;
        int target = 3;
        for(int i=0;i<nums.length;i++){  //{4,5,6,7,0,1,2}
            if(nums[i] == target){
                 IndexValue = i ;
            }
            else {
                IndexValue =-1;
            }

        }
        return IndexValue;

    }

    public static void main(String args[]){
        int nums[]={4,5,6,7,0,1,2};
        System.out.println(FindTarget(nums));

    }
    
}
