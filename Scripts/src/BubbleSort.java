public class BubbleSort {

    public static void main(String[] args){
        int[] arr= {1,5,2,8,0,4,7};
        sort(arr);
    }

    static void sort(int[] arr){
        int temp;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i: arr){
            System.out.println(i);
        }

    }
}
