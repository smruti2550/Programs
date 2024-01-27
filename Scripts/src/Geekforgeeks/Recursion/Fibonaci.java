package Geekforgeeks.Recursion;

public class Fibonaci {
    public static void main(String[] args){

        System.out.println(Fibo(3));
    }

    static int Fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return Fibo(n-1)+Fibo(n-2);
    }
}
