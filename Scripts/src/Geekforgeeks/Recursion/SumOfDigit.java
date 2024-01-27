package Geekforgeeks.Recursion;

public class SumOfDigit {
    static int rem;
    public static void main(String[] args){

        System.out.println(sum(253));
    }
    static int sum(int n){

        if(n==0) return 0;
        rem= n%10;
        n=n/10;
        return rem+sum(n);
    }

}
