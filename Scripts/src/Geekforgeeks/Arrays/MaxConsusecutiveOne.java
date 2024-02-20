package Geekforgeeks.Arrays;

public class MaxConsusecutiveOne {
    public static void main (String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 1, 1, 0};
        int result=0;
        for (int i=0;i<arr.length;i++){
            int count=0;
            for (int j=i;j<arr.length;j++){
                if (arr[j]==1) count++;
                else {
                    break;
                }
            }
            result=Math.max(result,count);
        }
        System.out.println(result);
    }

    public static int getCount(int [] arr){
        int currentCount=0;
        int result=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==1){
                currentCount++;
                result=Math.max(result,currentCount);
            }
            else {
                currentCount=0;
            }
        }
        return result;
    }
}
