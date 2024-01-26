package Geekforgeeks.number;

public class gcd {
    public static void main(String[] args){
        System.out.println(getgcd1(12,25));
    }

//    Naive solution
    static int getGcd(int a, int b){
        int result= Math.min(a,b);
        while (result>0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result --;
        }
        return result;
    }
//    Euclid algorithim
    static int getgcd1(int x, int y){
        while(x!=y){
            if (x>y) x=x-y;
            else y=y-x;
        }
        return x;
    }
}
