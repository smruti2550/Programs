package Geekforgeeks.Arrays;

public class FrequencyInSortedArray {
    public static void main (String[] args){
        int [] arr={10,10,2,2,2,4,5};
        String s="abcd";
        int eee=(int)s.charAt(1);
        int freq=1;
        int i=1;
        while(i<arr.length) {
            while (i < arr.length && arr[i] == arr[i - 1]) {
                freq++;
                i++;
            }
            System.out.println(arr[i - 1] + "=" + freq);
            freq = 1;
            i++;
        }
        if (arr[i-1]!=arr[i-2] || arr.length==1){
            System.out.println(arr[i - 1] + "=" + 1);
        }

    }
}
