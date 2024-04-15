package Geekforgeeks.Blind75.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main (String[] args){
        int [] arr= {3,2,4};
        int [] reumt= check2(arr,6);
        System.out.println(reumt[0]+"-"+ reumt[1]);
    }
    public static int[] check (int [] arr, int sum){
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]== sum) return new int[]{i,j};
            }
        }
        return new int[]{};
    }
    public static int[] check1(int [] arr, int sum){
        HashMap<Integer, Integer> mp= new HashMap<>();
        for (int i=0;i<arr.length;i++){
            int more= sum-arr[i];
            if (mp.containsKey(more)) return new int[]{mp.get(more),i};
            mp.put(arr[i],i);
        }
     return new int[]{-1,-1};
    }
//    If the array is sorted then go for this/ if asked about true/false
    public static int[] check2(int [] arr, int sum){
        int left= 0;
        int right= arr.length-1;
        Arrays.sort(arr);
        while(left<right){
            int sum1=arr[left]+arr[right];
            if (sum1==sum) return new int[]{left,right};
            else if (sum>sum1) left++;
            else right--;
        }
        return new int []{-1,-1};
    }
}
