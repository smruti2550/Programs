package Geekforgeeks;

public class CountOfDigit {
    public static void main (String[] args){
       System.out.println(count(023));
    }

    static int count(int n){
        if (n<=0) return 0;
        int count=0;
        while(n>0){
            n=n/10;
            count ++;
        }
        return count;
    }

}

