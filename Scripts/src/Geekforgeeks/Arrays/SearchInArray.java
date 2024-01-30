package Geekforgeeks.Arrays;

//Binary serach
public class SearchInArray {
    public static void main(String[] args){
        System.out.println(search(new int[]{2, 6, 3, 9},1));
    }

    static int search(int [] arr, int n){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==n) return i;
        }

        return -1;
    }
}
