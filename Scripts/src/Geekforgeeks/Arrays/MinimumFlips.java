package Geekforgeeks.Arrays;
//
//The minimum flip required in the array.
//the flip set will be opposite of first index. and starting index we are not going to flip

public class MinimumFlips {
    public static void main (String[] args) {
        int[] arr = {1,1,0,0,0,1,0,1,1,0,0};
        for (int i=1;i<arr.length;i++){
            if (arr[i]!=arr[i-1]){
                if (arr[i]!=arr[0]){
                    System.out.print(i+"-");
                }
                else {
                    System.out.println(i-1);
                }
            }
        }
        if (arr[0]!=arr[arr.length-1]){
            System.out.println(arr.length-1);
        }
    }
}
