package Geekforgeeks.Arrays;

//if the left and right sum is equal
public class EqulibriumPoint {
    public static void main (String[] args) {
        int[] arr = {1, 5, 3, 2, 1, 4, 3};
        for (int i=0;i<arr.length;i++){
            int leftSum=0;
            int rightSum=0;
            for (int j=0;j<i;j++){
                leftSum=leftSum+arr[j];
            }
            for (int k=i+1;k<arr.length;k++){
                rightSum=rightSum+arr[k];
            }
            if (rightSum==leftSum) System.out.println("true");
        }
        int[] arr1 = {1, 2,3,4};
    }

}
