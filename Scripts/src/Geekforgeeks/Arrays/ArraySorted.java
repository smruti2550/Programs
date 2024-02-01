package Geekforgeeks.Arrays;

public class ArraySorted {
    public static void main(String[] args){
        int [] arr= {2,8,10,10,14};
        System.out.println(check(arr));
    }

    static boolean check(int [] arr){
        for (int i=1;i<arr.length;i++){
            if (!(arr[i]>=arr[i-1])) return false;
        }
        return true;
    }
}
