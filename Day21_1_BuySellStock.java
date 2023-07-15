import java.lang.Math.*;
import java.util.*;
public class Day21_1_BuySellStock {

    
    public static int BuyAndSellStock (int prices[]){
        int BuyPrice = Integer.MAX_VALUE;
        int Maxprofit = 0;

        for(int i=0; i< prices.length;i++){
            // prices[i] is also know as selling prices 
            if(BuyPrice < prices[i]){  // Profit 
                int profit = prices[i] - BuyPrice; // Today's profit 
                 Maxprofit = Math.max(Maxprofit, profit);
            }else{
                BuyPrice = prices[i];
            }

        }
        return Maxprofit;


    }

    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        int MaxProfit= BuyAndSellStock(prices);
        System.out.println("The Max Profit is : "+ MaxProfit);

    }
    
}
