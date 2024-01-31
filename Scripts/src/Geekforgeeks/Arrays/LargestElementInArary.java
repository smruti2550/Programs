package Geekforgeeks.Arrays;

public class LargestElementInArary {
    public static void main(String[] args){
        int [] arr= {2, 8,10,5,1};
        System.out.println(first1(arr));
    }

    static int first(int [] arr){
        int result=-1;
        for (int i=0;i<arr.length;i++){
            boolean flag=true;
            for (int j=0;j<arr.length;j++){
                if (arr[j]>arr[i]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                result=arr[i];
                break;
            }
        }
        return result;
    }

//    Efficient solution
    int check (int [] arr){
        int result=0;
        for (int i=1;i<arr.length;i++){
            if (arr[i]>arr[result]){
                result=i;
            }
        }
        return arr[result];
    }
    static int first1 (int [] arr){
       int first=-1;
       for (int i=0;i<arr.length;i++){
           if (arr[i]>first){
               first=arr[i];
           }
       }
       return first;
    }
}
