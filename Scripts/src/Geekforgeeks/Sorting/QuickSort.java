//package Geekforgeeks.Sorting;
//
//public class QuickSort {
//    public static void main (String [] args){
//        int [] arr= {1,6,2,1,4,8,9,4};
//        sort(arr,0,arr.length-1);
//        for (int i: arr){
//            System.out.println(i);
//        }
//    }
////    find the pivot, check from left greater than pivot and from right less than pivot. then swap
//    public static void sort(int [] arr, int low, int high){
//        if (low<high){
//            int pivotIndex= pivot(arr,low,high);
//            sort(arr,low, pivotIndex-1);
//            sort(arr, pivotIndex+1, high);
//        }
//    }
//    public static int pivot(int [] arr, int low, int high){
//        int pivot=arr[low];
//        int i=low;
//        int j=high;
//        while (i<j){
//            while (arr[i]<=arr[pivot] && i<high){
//                i++;
//            }
//            while (arr[j]>arr[pivot] && j>low){
//                j--;
//            }
//        }
//
//    }
//
//}
