package Geekforgeeks.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2, 10, 10, 5, 9};
        System.out.println(secondLargest3(arr));
    }
    static int firstLargest(int[] arr) {
        int result = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[result]) {
                result = i;
            }
        }
        return result;
    }

    static int secondLargest(int[] arr) {
        int firstLargest = firstLargest(arr);
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[firstLargest]) {
                if (result == -1) {
                    result = i;
                } else if (arr[i] > arr[result]) {
                    result = i;
                }
            }
        }
        return result;
    }

    static int secondLargest1(int[] arr) {
        int firstLargest = firstLargest(arr);
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[firstLargest] && arr[i] > result) {
                result = arr[i];
            }
        }
        return result;
    }

    static int secondLargest2(int[] arr) {
        int first = arr[0];
        int second = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
            if (arr[i] < first && arr[i] > second) {
                second = arr[i];
            }
        }
        return second;

    }

    static int secondLargest3(int[] arr) {
        int first = -1;
        int second = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            }
            else if (arr[i]>second && arr[i]!=first) {
                second = arr[i];
            }
        }
        return second;
    }
}
