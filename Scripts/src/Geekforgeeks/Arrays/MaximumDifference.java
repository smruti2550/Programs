package Geekforgeeks.Arrays;

public class MaximumDifference {
    public static void main (String[] args){
        int [] arr= {2,3,10,6,4,8,1};
        int maxDifference=-1;
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                maxDifference= Math.max(maxDifference,arr[j]-arr[i]);
            }
        }
        System.out.println(maxDifference);
    }
}
