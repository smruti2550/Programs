package Geekforgeeks.Seraching;

public class SearchingInSortedArray {
    public static void main (String[] args) {
        int[] arr = {1,3,5,7,8,9};
        int low=0;
        int high= arr.length-1;
        int number=7;
        while (low<=high){
            int mid=(low+high)/2;
            if (arr[mid]==number){
                System.out.println(mid);
                break;
            }
            else if (arr[mid]>number) high=mid-1;
            else low=mid+1;
        }
        System.out.println(recursiveSearch(arr,number,low,high));
    }
    public static int recursiveSearch(int [] arr, int n, int low, int high){
        if (low>high) return -1;
        int mid=(low+high)/2;
        if (arr[mid]==n) return mid;
        else if(arr[mid]>n) return recursiveSearch(arr,n,low,mid-1);
        else return recursiveSearch(arr,n,mid+1,high);
    }
}
