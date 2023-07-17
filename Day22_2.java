public class Day22_2 {

    public static int BuyAndSellStock(int prices[]){
        int BuyPrices = prices[0];
        int maxprofit = 0;

        for(int i=1;i< prices.length;i++){
            if(BuyPrices < prices[i]){
                int profit = prices[i] - BuyPrices;
                maxprofit= Math.max(maxprofit, profit);
            

            }else{
                BuyPrices = prices[i];

            }
            


        }
        return maxprofit;
    }
    public static void main(String args[]){
          int prices[]={7,6,4,3,1};
         // int prices[]={7, 1, 5, 3, 6, 4};
        System.out.println( BuyAndSellStock(prices));

    }
    
}
