package Geekforgeeks.Seraching;

public class isThreeSumInSortedArray {
    public static void main(String[] args) {
        int [] arr={2,3,8,11,13,14};
        System.out.println(check(arr,24));
    }
    public static boolean check(int [] arr,int number){
        for (int i=0;i<arr.length-2;i++){
            for (int j=i+1;j<arr.length-1;j++){
                for (int k=j+1;k<arr.length;k++){
                    if (arr[i]+arr[j]+arr[k]==number) return true;
                }
            }
        }
        return false;
    }
}
