package Geekforgeeks.Blind75.twoPointer;

public class ContainerWithWater {
    public static void main (String[] args){
        int [] arr= {1,8,6,2,5,4,8,3,1};
        int result=0;
        int left=0;
        int right= arr.length-1;
        while (left<right){
            int area= Math.min(arr[left],arr[right])*(right-left);
            result=Math.max(area,result);
            if(arr[left]<arr[right]) left++;
            else right--;
        }
        System.out.println(result);
    }
}
