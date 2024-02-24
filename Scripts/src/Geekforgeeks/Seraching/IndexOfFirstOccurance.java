package Geekforgeeks.Seraching;

public class IndexOfFirstOccurance {
        public static void main(String[] args) {
            int[] arr = {1, 3, 5,7, 7, 8, 9};
            System.out.println(search(arr,7, 0,arr.length-1));
        }

        public static int search(int [] arr, int n, int low, int high){
            if (low>high) return -1;
            int mid= (low+high)/2;
            if (arr[mid]>n) return search(arr,n,low,mid-1);
            else if(arr[mid]<n) return search(arr,n,mid+1,high);
            else {
                if (mid==0 ||arr[mid]!=arr[mid-1]) return mid;
                else return search(arr,n,low,mid-1);

            }

        }

}
