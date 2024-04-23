package Geekforgeeks.Blind75.twoPointer;

import java.util.*;

public class ThreeSum {
    public static void main (String[] args){
        int [] arr= {-1,0,1,2,-1,-4};
        System.out.println(solution1(arr));

    }
    public static void solution(int[] arr){
        Set<List<Integer>> result= new HashSet<>();
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                for (int k=j+1;k<arr.length;k++){
                    if (arr[i]+arr[j]+arr[k]==0){
                        result.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    }
                }
            }
        }
        System.out.println(result);
    }
    public static List<List<Integer>> solution1(int [] arr){
        if (arr==null || arr.length<3) return new ArrayList<>();
        Arrays.sort(arr);
        Set<List<Integer>> result= new HashSet<>();
        for (int i=0;i<arr.length-2;i++){
            int left=i+1;
            int right=arr.length-1;
            while(left<right){
                int sum= arr[i]+arr[left]+arr[right];
                if(sum==0){
                    result.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;
                }
                else if(sum>0){
                    right--;
                }
                else {
                    left++;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
