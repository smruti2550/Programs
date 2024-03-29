package LeetCode;

public class BuySellStock {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 7, 4, 9, 3,10};

        //Brute force approach-N2, buy one for loop and sell one for loop
        int max_profit=0;
        int profit;
        for (int i = 0; i < arr.length-1;i++) {
            for (int j=i;j<arr.length-1;j++){
                profit=arr[j+1]-arr[i];
                if(profit>max_profit){
                   max_profit=profit;
               }
            }
        }
        System.out.println(max_profit);

//        Find the min price from the list starting from 0 index and sell on that to get the max profit
//        int min_price=arr[0];
//        int max_profit=0;
//        for (int i=0;i<arr.length;i++){
//            min_price=Math.min(min_price,arr[i]);
//            int profit=arr[i]-min_price;
//            if(profit>max_profit){
//                max_profit=profit;
//            }
//        }
//        System.out.println(max_profit);
    }
}
