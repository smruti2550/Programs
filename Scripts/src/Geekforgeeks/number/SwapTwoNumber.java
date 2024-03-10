package Geekforgeeks.number;

public class SwapTwoNumber {

    public static void main(String[] args) {
        int a=5;
        int b=10;
        swap2(a,b);
    }
    public static void swap1(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+"-"+b);
    }
    public static void swap2(int a, int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+"-"+b);
    }
}
