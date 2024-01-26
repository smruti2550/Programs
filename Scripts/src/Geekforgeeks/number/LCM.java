package Geekforgeeks.number;

public class LCM {
    public static void main(String[] args){
        System.out.println(lcm(0,6));
    }

    static int lcm(int a, int b){
        int result= Math.max(a,b);
        while (result > 0)
        if(result%a==0 && result%b==0) break;
        else {
            result++;
        }
        return result;
    }
}
