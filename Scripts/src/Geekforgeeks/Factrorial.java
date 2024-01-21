package Geekforgeeks;

public class Factrorial {

    public static void main(String[] args){
        System.out.println(factorial(10));

    }
    static int factorial(int n){
        int fact=1;
        for (int i=2;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    static  int fact(int n){
        if (n==0)
            return 1;
        return n*fact(n-1);
    }
}
