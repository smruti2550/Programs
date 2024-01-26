package Geekforgeeks.number;

public class trailingZeroFactorial {

    public static void main(String[] args){
        System.out.println(trailingZero(10));
    }

    static int trailingZero(int n){
        int fact=1;
        for (int i=2;i<=n;i++){
            fact=fact+i;
        }
        int count=0;
        while(fact%10!=0){
            fact=fact/10;
            count++;
        }
        return count;
    }
}
