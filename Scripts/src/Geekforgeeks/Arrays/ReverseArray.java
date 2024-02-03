package Geekforgeeks.Arrays;


public class ReverseArray {
    public static void main(String[] args){
        int [] arr= {2,8,10,10,14};
        int firstIndex=0;
        int lastIndex=arr.length-1;
        while(firstIndex<lastIndex){
            int temp=arr[lastIndex];
            arr[lastIndex]=arr[firstIndex];
            arr[firstIndex]=temp;
            firstIndex++;
            lastIndex--;
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
