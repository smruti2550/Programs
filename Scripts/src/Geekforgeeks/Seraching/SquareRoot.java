package Geekforgeeks.Seraching;

public class SquareRoot {
    public static void main(String[] args) {
        int number=16;
        int i=1;
        while(i*i<=number){
            i++;
        }
        System.out.println(i-1);
        System.out.println(square(24));
    }

    public static int square(int number){
        int high=number/2;
        int low=0;
        int result=0;
        while (low<=high){
            int mid= (low+high)/2;
            if ((mid*mid)==number) return mid;
            else if ((mid*mid)>number) high=mid-1;
            else {
                low=mid+1;
                result=mid;
            }
        }
        return result;
    }
}
