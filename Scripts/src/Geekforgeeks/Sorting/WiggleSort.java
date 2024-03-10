package Geekforgeeks.Sorting;

//Odd index number should be greater than or equal to previous and
// even index should be less than or equal to next index number
public class WiggleSort {
    public static void main (String[] args){
        int [] arr = {3,5,2,1,6};
        for (int i=0;i<arr.length-1;i++){
            if (i%2==0){
                if (arr[i]>arr[i+1]){
                    swap (arr, i, i+1);
                }
            }
            else {
                if (arr[i]<arr[i+1]){
                    swap (arr, i, i+1);
                }
            }
        }
        for (int k: arr){
            System.out.println(k);
        }
    }
    public static void swap(int [] arr, int first, int second){
        int temp= arr[second];
        arr[second]= arr[first];
        arr[first]= temp;
    }

}
