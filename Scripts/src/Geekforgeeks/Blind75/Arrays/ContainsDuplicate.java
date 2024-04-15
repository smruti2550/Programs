package Geekforgeeks.Blind75.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicate {
    public static void main (String [] args){
        int [] arr = {1,1,1,3,3,4,3,2,2};
        System.out.println(check1(arr));
    }
//If any value apprears ateleast once
    public static boolean check(int [] arr){
        Arrays.sort(arr);
        for (int i=1;i<arr.length;i++){
            if (arr[i]==arr[i-1]){
                return true;
            }
        }
        return false;
    }
//    If all value appreasr atleast once
    public static boolean check1(int [] arr){
        HashMap<Integer, Integer> mp= new HashMap<>();
        for (int value:arr){
            mp.put(value, mp.getOrDefault(value,0)+1);
        }
        System.out.println(mp);
        for (int count: mp.values()){
            if (count<2) return false;
        }
        return true;
    }
}
