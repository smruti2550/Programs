package Geekforgeeks.Arrays;

public class MajorityElement {
    public static void main (String[] args) {
        int[] arr = {5,8,8,1,2,8,8,5,6,5,5};
        for (int i=0;i<arr.length;i++){
            int count=1;
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]) count++;
            }
            if (count>arr.length/2) System.out.println(arr[i]);
        }
    }
}
