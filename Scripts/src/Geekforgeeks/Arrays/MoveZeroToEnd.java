package Geekforgeeks.Arrays;

public class MoveZeroToEnd {
    public static void main (String[] args){
        int [] arr= {0,1,4,0,1,0};
        int nz=0;
        int z=0;
        while (nz<arr.length){
            if (arr[nz]!=0){
                int temp=arr[nz];
                arr[nz]=arr[z];
                arr[z]=temp;
                nz++;
                z++;
            }
            else{
                nz++;
            }
        }
        for (int i:arr){
            System.out.println(i);
        }

    }

}
