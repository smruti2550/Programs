package Geekforgeeks.Sorting;

public class MergeSort {
    public static void main (String [] args){
        int [] arr= {1,6,2,1,4,8,9,4};
        sort(arr,0,arr.length-1);
        for (int i: arr){
            System.out.println(i);
        }
    }
    // find the mid and sort the first and 2nd half and merge both
    public static void sort(int [] arr,int low, int high ){
        if (low==high) return;
        int mid=(low+high)/2;
        sort(arr,low,mid);
        sort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int[] arr,int low, int mid, int high){
        int pointer1= low;
        int pointer2= mid+1;
        int k=0;
        int [] temp = new int[arr.length];
        while (pointer1<=mid && pointer1<=high){
            if (arr[pointer1]<=arr[pointer2]){
                temp[k]=arr[pointer1];
                pointer1++;
                k++;
            }
            else {
                temp[k]=arr[pointer2];
                pointer2++;
                k++;
            }
        }
        while (pointer1<=mid){
            temp[k]=arr[pointer1];
            k++;
        }
        while (pointer2<=high){
            temp[k]=arr[pointer2];
            k++;
        }
        for (int i=low;i<=high;i++){
            arr[i]= temp[i];
        }
    }
}
