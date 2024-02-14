package Geekforgeeks.Arrays;

import java.util.Arrays;
//1. call left rotate multiple times
//2. below two approach
public class LeftRotateByN {
    public static void main(String [] args){
        int d=3;
        int[] arr= {1,2,3,4,5,6,7};
        rotate(arr,d);
//        int[] temp= new int[d];
//        for (int i=0;i<d;i++){
//            temp[i]=arr[i];
//        }
//        for (int i=d;i<arr.length;i++){
//            arr[i-d]= arr[i];
//        }
//        int j=0;
//        for (int i=arr.length-d;i<arr.length;i++){
//            arr[i]=temp[j];
//            j++;
//        }
//        for (int k:arr){
//            System.out.println(k);
//        }

    }
    static void rotate(int [] arr, int d){
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
        for (int i: arr){
            System.out.println(i);
        }

    }
    static void reverse(int [] arr, int start, int end){
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }
}
