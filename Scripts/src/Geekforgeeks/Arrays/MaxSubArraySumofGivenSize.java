package Geekforgeeks.Arrays;

public class MaxSubArraySumofGivenSize {
    public static void main (String[] args) {
        int[] arr = {1, -2, 3, -1, 2, -9, 1, 4, 3};
        int maxSum=Integer.MIN_VALUE;
        int k=3;
        for (int i=0;i<=arr.length-k;i++){
            int sum=0;
            for (int j=i;j<i+k;j++){
                sum=sum+arr[j];
            }
            maxSum=Math.max(sum,maxSum);
        }
        System.out.println(maxSum);
        System.out.println(getSum(arr,k));
    }

//    window sliding problem
    public static int getSum(int [] arr, int size){
        int sizeSum=0;
        int maxSum=Integer.MIN_VALUE;
        for (int i=0;i<size;i++){
            sizeSum=sizeSum+arr[i];
        }
        for (int i=size;i<arr.length;i++){
            sizeSum=sizeSum+arr[i]-arr[i-size];
            maxSum=Math.max(sizeSum,maxSum);
        }
        return maxSum;
    }
}
