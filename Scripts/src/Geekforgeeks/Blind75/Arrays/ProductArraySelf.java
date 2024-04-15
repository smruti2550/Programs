package Geekforgeeks.Blind75.Arrays;

public class ProductArraySelf {
    public static void main (String[] args){
        int [] arr={3,2,6,5};
        for(int i: solution2(arr)){
            System.out.println(i);
        }
    }
//    for big size or 0 value it will not work
    public static int[] solution(int [] arr){
        int  total_product=1;
        int result[]= new int[arr.length];
        for (int i=0;i<arr.length;i++){
            total_product=total_product*arr[i];
        }
        for (int i=0;i<arr.length;i++){
            result[i]=total_product/arr[i];
        }
        return result;
    }
    public static int[] solution1(int [] arr) {
        int result[]= new int[arr.length];
        int counter=0;
        for (int i=0;i<arr.length;i++){
            int left=1;
            int right=1;
            for (int j=0;j<i;j++){
                left=left*arr[j];
            }
            for (int k =i+1;k<arr.length;k++){
                right=right*arr[k];
            }
            int product=left*right;
            result[counter]=product;
            counter++;
        }
        return result;
    }
    public static int[] solution2(int [] arr) {
        int [] left= new int[arr.length];
        int [] right = new int[arr.length];
        left[0]=1;
        right[arr.length-1]=1;
        for (int i=1;i<arr.length;i++){
            left[i]= left[i-1]*arr[i-1];
        }
        for (int i=arr.length-2;i>=0;i--){
            right[i]= right[i+1]*arr[i+1];
        }
        int [] ans= new int[arr.length];
        for (int i=0;i<arr.length;i++){
            ans[i]=left[i]*right[i];
        }
        return ans;
    }
    }
