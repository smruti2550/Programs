package Geekforgeeks.Arrays;

public class BuySell1 {

    public static void main (String[] args) {
        int[] arr = {8,1,1,1,1};
        int max_profit=0;
        int profit;
        for (int i=0;i<arr.length-1;i++){
            for (int j=i;j<arr.length-1;j++){
                profit=arr[j]-arr[i];
                if (profit>max_profit){
                    max_profit=profit;
                }
            }
        }
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int [] arr){
        int minValue=arr[0];
        int max_profit=0;
        for (int i=0;i<arr.length;i++){
            minValue=Math.min(minValue,arr[i]);
            int profit= arr[i]-minValue;
            if (profit>max_profit){
                max_profit=profit;
            }
        }
        return max_profit;
    }

}
