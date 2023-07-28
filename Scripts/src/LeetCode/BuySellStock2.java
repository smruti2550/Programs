package LeetCode;

public class BuySellStock2 {

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 7, 4, 9, 3};
//
//        local min-left and write is big--buy
//        local mac- left and write is small--sell
        int profit=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]>arr[i]){
                profit=profit+(arr[i+1]-arr[i]);

            }
        }
        System.out.println(profit);
    }
}
