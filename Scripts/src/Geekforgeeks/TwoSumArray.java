package Geekforgeeks;

import com.sun.tools.javac.util.Pair;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 7, 4, 9, 3};
        System.out.println(twoSum(arr,2));
    }
//    static boolean twoSum(int[] arr,int target){
//        //brute force solution
//        for(int i=0; i<arr.length;i++){
//            for (int j=i+1;j<arr.length;j++){
//                if(arr[i]+arr[j]==target){
//                    System.out.println(i+"and"+j);
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    static int[] twoSum(int[] arr, int target){
//        Map<Integer,Integer> mp = new HashMap<>();
//        for (int i=0;i<arr.length;i++){
//            int more=target-arr[i];
//            if(mp.containsKey(more)){
//               return new int[]{mp.get(more),i};
//            }
//            else{
//                mp.put(arr[i],i);
//            }
//        }
//       return new int[]{-1,-1};
    //    }

    static boolean twoSum(int[] arr, int target){
        int left=0;
        int right=arr.length-1;
        Arrays.sort(arr);
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target) return true;
            else if(sum<target) left++;
            else right--;
        }
        return false;
    }
}
