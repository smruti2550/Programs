package Geekforgeeks.Recursion;

//Let the rope length is n=10 and a=2,b=3,c=4. What will be the max picese the rope can cut without any wastage. so 2*5=10.
//Ex-2 if n=23 and a=9,b=11,c=12. 11+12=23 s0 op is 2
public class RopeCutting {
    static int piece;

    public static void main(String[] args) {

        System.out.println(count(8, 12, 11, 9));
    }

    static int count(int n, int a, int b, int c) {
        if (n == 0) return 0;
        if (n < 0) return -1;
        int m1 = count(n - a, a, b, c);
        int m2 = count(n - b, a, b, c);
        int m3 = count(n - c, a, b, c);
        piece = Math.max(m3, Math.max(m1, m2));
        if (piece == -1) return -1;
        return piece + 1;
    }
}
