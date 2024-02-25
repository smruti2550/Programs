package Geekforgeeks.Seraching;

public class isSumInSortedArray {
    public static void main(String[] args) {
        int [] arr={2,3,8,11};
        System.out.println(check1(arr,14));
    }

    public static boolean check(int [] arr, int number){
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==number) return true;
            }
        }
        return false;
    }
//    Two pointer approach
    public static boolean check1(int [] arr, int number){
        int low=0;
        int high= arr.length-1;
        while (low<high) {
            if (arr[low] + arr[high] == number) return true;
            else if (arr[low] + arr[high] < number) low = +1;
            else high = -1;
        }
        return false;
    }
}
