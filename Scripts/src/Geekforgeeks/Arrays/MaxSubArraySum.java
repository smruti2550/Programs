package Geekforgeeks.Arrays;

public class MaxSubArraySum {
    public static void main (String[] args) {
        int[] arr = {1,-2,3,-1,2};
        int result=0;
        for (int i=0;i<arr.length;i++){
            int sum=0;
            for (int j=i;j<arr.length;j++){
                sum= sum+arr[j];
                result= Math.max(result,sum);
            }
        }
        System.out.println(result);
    }

//    Kadanes algo
    public static int maxSum(int [] arr){
        int sum=arr[0];
        int maxSum=arr[0];
        for (int i=1;i<arr.length;i++){
            if (sum>=0){
                sum=sum+arr[i];
            }
            else {
                sum=arr[i];
            }
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
