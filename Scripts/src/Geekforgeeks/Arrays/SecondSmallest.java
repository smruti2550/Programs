package Geekforgeeks.Arrays;

public class SecondSmallest {
    public static void main(String[] args){
        int [] arr= {2,8,10,5,1};
        System.out.println(secondSmallest(arr));

    }

    static int secondSmallest(int [] arr){
        int first=arr[0];
        int second= -1;
        for (int i=1;i<arr.length;i++){
            if (arr[i]<first){
                second=first;
                first=arr[i];
            }
            else if (arr[i]>first && arr[i]<second){
                second=arr[i];
            }
        }
        return second;

    }
}
