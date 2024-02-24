package Geekforgeeks.Seraching;

public class SearchInInfanite {
    public static void main(String[] args) {
        int number = 13;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int low = 0;
        int high = 1;
        while (arr[high] < number) {
            low = high;
            high = high * 2;
        }
        System.out.println(binarySearch(arr,number,low,high));
    }
    public static int binarySearch(int [] arr, int number, int low, int high){
        while (low<=high){
            int mid=(low+high)/2;
            if (arr[mid]==number) return mid;
            else if (arr[mid]>number) high=mid-1;
            else low=mid+1;
        }
        return -1;
    }
}
