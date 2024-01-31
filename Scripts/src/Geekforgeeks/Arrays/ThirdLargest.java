package Geekforgeeks.Arrays;

public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = {2, 10, 10, 5, 9};
        System.out.println(secondLargest3(arr));
    }
    static int secondLargest3(int [] arr){
        int first=-1;
        int second=-1;
        int third=-1;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
            }
            else if (arr[i]>second && arr[i]!=first){
                third=second;
                second=arr[i];
            }
            else if (arr[i]>third && arr[i]!=first){
                third=arr[i];
            }
        }
        return third;
    }
}
