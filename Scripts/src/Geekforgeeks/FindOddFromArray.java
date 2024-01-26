package Geekforgeeks;

public class FindOddFromArray {
    public static void main(String[] args){
        int[] arr= {2,3,4,2,4};
        System.out.println(check(arr,arr.length));
    }

    static int check(int [] arr, int n){
        for (int i=0;i<n;i++){
            int count=0;
            for (int j=0;j<n;j++){
                if (arr[i]==arr[j]) count++;
            }
            if (count%2!=0) return arr[i];
        }
        return -1;
    }

//    n^n=0, n^n^n=n
    static int findOdd(int[] arr, int n){
       int  result= arr[0];
        for (int i=1;i<n;i++){
            result= result ^ arr[i];
        }
        return result;
    }

}
