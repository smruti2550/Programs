package Geekforgeeks.Arrays;

//Alternating even odd
public class MaxEvenOddSubArray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 6, 3, 8};
        int result = 1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0) || (arr[j] % 2 != 0 && arr[j - 1] % 2 == 0)) {
                    count++;
                } else {
                    break;
                }
            }
            result = Math.max(count, result);
        }
        System.out.println(result);
    }

    public static int check(int[] arr) {
        int count = 1;
        int result = 1;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
                count++;
                result = Math.max(count, result);
            } else {
                count = 1;
            }
        }
        return result;
    }
}