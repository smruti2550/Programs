package LeetCode;

public class BuySellStock {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 7, 4, 9, 3};

        //Brute force approach-N2
//        int max_profit=0;
//        int profit;
//        for (int i = 0; i < arr.length-1;i++) {
//            for (int j=0;j<arr.length-1-i;j++){
//                profit=arr[i+j+1]-arr[i];
//                if(profit>max_profit){
//                   max_profit=profit;
//               }
//            }
//        }
//        System.out.println(max_profit);

        int min_price=arr[0];
        int max_profit=0;
        for (int i=0;i<arr.length;i++){
            min_price=Math.min(min_price,arr[i]);
            int profit=arr[i]-min_price;
            if(profit>max_profit){
                max_profit=profit;
            }
        }
        System.out.println(max_profit);
    }
}
