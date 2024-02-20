package Geekforgeeks.Arrays;

public class TappingRainWater {

    public static void main (String[] args) {
        int[] arr = {3,0,1,2,5};
        int result=0;
        if (arr.length==1 || arr.length==2){
            System.out.println(result);
        }
        for (int i=1;i<arr.length-1;i++){
            int leftMax=arr[i];
            for (int j=0;j<i;j++){
                leftMax= Math.max(leftMax,arr[j]);
            }
            int reightMax=arr[i];
            for (int k=i+1;k<arr.length;k++){
                reightMax= Math.max(reightMax,arr[k]);
            }
            result= result+(Math.min(leftMax,reightMax)-arr[i]);
        }
        System.out.println(result);

    }
}
