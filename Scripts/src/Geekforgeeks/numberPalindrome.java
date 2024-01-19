package Geekforgeeks;

public class numberPalindrome {
    public static void main (String[] args){
        System.out.println(isPalindrome(121));
    }

    static boolean isPalindrome(int n){
        int reverseNumber=0;
        int temp =n;
        while (n>0){
            int rem=n %10;
            reverseNumber= reverseNumber*10+rem;
            n=n/10;
        }
        return (reverseNumber==temp);
    }
}
