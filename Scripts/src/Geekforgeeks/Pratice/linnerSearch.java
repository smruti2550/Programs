package Geekforgeeks.Pratice;

public class linnerSearch {

    public static void main(String[] args){
        int[] arr= {1,5,2,8,0,4,7};
        System.out.println(search(arr, 0));
    }

    static int search(int[] arr, int input){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==input)
                return i;
        }
        return -1;
    }
}
