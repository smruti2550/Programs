package Geekforgeeks.Arrays;

public class SubarrayWithGivenSuum {
    public static void main (String[] args) {
        int[] arr = {1, 5, 3, 2, 1, 4, 3};
        System.out.println(checkSum(arr,100));
    }
    public static boolean checkSum(int [] arr, int given){
        for (int i=0;i<arr.length;i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[i];
                if (sum == given) return true;
            }
        }
        return false;
    }
}
