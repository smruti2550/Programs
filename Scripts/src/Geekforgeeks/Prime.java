package Geekforgeeks;

public class Prime {
    public static void main(String[] args){
        System.out.println(isPrime(2));
    }
    static boolean isPrime(int x){
        if (x<2) return false;
        for (int i=2;i<x;i++){
            if(x%i==0) return false;
        }
        return true;
    }

    static boolean isPrime1(int x){
        if (x<2) return false;
        if(x==2 || x==3) return true;
        if (x%2==0 && x%3==0) return false;
        for (int i=5;i*i<=x; i=i+6){
            if (x%i==0 && x%(i+2)==0) return false;
        }
        return true;
    }
}
