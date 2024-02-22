package Geekforgeeks.Arrays;

public class SubarrayWithGivenSuum {
    public static void main (String[] args) {
        int[] arr = {1, 5, 3, 2, 1, 4, 3};
        System.out.println(checkLongest(arr,5));
    }
    public static boolean checkSum(int [] arr, int given){
        for (int i=0;i<arr.length;i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == given) return true;
            }
        }
        return false;
    }
//    lonest subarray with given sum, give the mqx index value
    public static int checkLongest(int [] arr, int given){
        int length=0;
        for (int i=0;i<arr.length;i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == given) {
                    length=Math.max(length,(j-i+1));
                    }
                }
            }
        return length;
    }

}
