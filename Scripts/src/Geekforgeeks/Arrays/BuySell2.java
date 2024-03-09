package Geekforgeeks.Arrays;

public class BuySell2 {
    public static void main (String[] args) {
        int[] arr = {4,1,9,5,1,7};
        int profit=0;
        for (int i=1;i<arr.length;i++){
            if (arr[i]>arr[i-1]){
                profit=profit+(arr[i]-arr[i-1]);
            }
        }
        System.out.println(profit);
    }
}
