package Geekforgeeks.Arrays;

public class BuySell2 {
    public static void main (String[] args) {
        int[] arr = {4,1,9,5,1,7};
        int profit=0;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i+1]>arr[i]){
                profit=profit+(arr[i+1]-arr[i]);
            }
        }
        System.out.println(profit);
    }
}
