package Geekforgeeks.Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 8, 5, 9, 5, 1};
        for (int i = 0; i < arr.length-1; i++) {
            boolean swap=false;
            for (int j = 0; j < arr.length-1-i; j++) { //In first pass largest element went to last so -1-i
                int temp;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swap=true;
                }
            }
            if(swap==false) break;//to check if any order or else break the loop
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

