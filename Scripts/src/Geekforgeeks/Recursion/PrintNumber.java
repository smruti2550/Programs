package Geekforgeeks.Recursion;

public class PrintNumber {
    public static void main(String[] args){
        print(6);
    }

    static void print(int n){
        if (n==0) return;
        System.out.println(n);
        print(n-1);
    }
}
