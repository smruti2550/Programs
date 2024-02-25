package Geekforgeeks.Seraching;

//first find which half is sorted, then check the element in that half if not there then go to the other half
public class SerachinRotateSortedArray {
    public static void main(String[] args) {
        int number = 5;
        int[] arr = {10,20,40,60,5,8};
        int low=0;
        int high=arr.length-1;
        System.out.println(search(arr,number,low,high));
    }

    public static int search(int [] arr, int number, int low, int high){
        int mid=0;
        while (low<=high){
            mid=(low+high)/2;
            if (arr[mid]==number) return mid;
            else if (arr[low]<=arr[mid]){
                if (arr[low]<=number && arr[mid]>number){
                    high=mid-1;
                }
                else low=mid+1;
            }
            else {
                if (arr[mid]<number && arr[high]>=number){
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
