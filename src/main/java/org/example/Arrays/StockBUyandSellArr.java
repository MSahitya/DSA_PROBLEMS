package org.example.Arrays;

public class StockBUyandSellArr {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int n = prices.length;
        int maxProfit = 0;
        if (n <= 1) {
            maxProfit= 0; // If there's only one or no price, we can't make any profit
        }


        int minPrice = prices[0];

        for (int i = 1; i < n; i++) {
            // Update the minimum price if the current price is lower
            minPrice = Math.min(minPrice, prices[i]);
            // Update the maximum profit if selling at the current price would result in a greater profit
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        System.out.println(maxProfit+"\t"+StockBUyandSellArr.maxProfit(prices));

    }
    static int maxProfit(int arr[]){
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] <minPrice)
                minPrice=arr[i];
            else if(arr[i]-minPrice >maxProfit)
                maxProfit=arr[i]-minPrice;
        }
        return maxProfit;


    }
}
