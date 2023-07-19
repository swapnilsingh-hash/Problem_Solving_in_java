public class Day24_SelectionSort {

    public static void SelectSort(int arr[]) //
    {
        for(int i=0;i < arr.length-1;i++)
        {
            int MinPos = i;
            for(int j=i+1;j < arr.length;j++)  //{5,4,1,3,2};
            {
                if(arr[MinPos] > arr[j])
                {
                    MinPos = j ;
                }

            }
            // Swap the values
            int temp= arr[MinPos];
            arr[MinPos]= arr[i];
            arr[i]= temp;

        }
        

    }

    
    public static void PrintArry(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        SelectSort(arr);
        PrintArry(arr);
        

    }
    
}
