package Geekforgeeks.Seraching;

public class SquareRoot {
    public static void main(String[] args) {
        int number=16;
        int i=1;
        while(i*i<=number){
            i++;
        }
        System.out.println(i-1);
    }
}
