package Geekforgeeks.Arrays;

import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args){
        int [] arr= {2,8,10,10,14};
        HashSet<Integer> st= new HashSet<Integer>();
        for (int i=0;i<arr.length;i++){
            st.add(arr[i]);
        }
        System.out.println(st);
        System.out.println(st.size());
    }

//    Two pointer approach. i is the total lenght of unqiue elements
    static int remove(int[] arr){
        int i=0;
        for (int j=1;j<arr.length;j++){
            if (arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }

}
