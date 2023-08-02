package LeetCode;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 7, 4, 9, 3};
        System.out.println(twoSum(arr,13));
    }
    static int[] twoSum(int[] arr, int target){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            int extra=target-arr[i];
            if(mp.containsKey(extra)) return new int[]{i,mp.get(extra)};
            else mp.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }

}
