package Geekforgeeks.Arrays;

//In the right side index there should not be any large value

public class LeadersInArray {
    public static void main(String[] args){
        int[] arr={7,10,4,3,6,5,2};
        for (int i=0;i<arr.length;i++){
            boolean flag=true;
            for (int j=i+1;j<arr.length-1;j++){
                if (arr[j]>arr[i]){
                    flag=false;
                    break;
                }
            }
            if (flag){
                System.out.println(arr[i]);
            }
        }
    }
    static void leader(int [] arr){
        int current_large= arr[arr.length-1];
        for (int i=arr.length-2;i>=0;i--){
            if (arr[i]>current_large){
                current_large=arr[i];
                System.out.println(current_large);
            }
        }
    }
}
