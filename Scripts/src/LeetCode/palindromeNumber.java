package LeetCode;

public class palindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    static boolean isPalindrome(int number){
        if(number<0||(number!=0 && number%10==0)) return false;
        int reversed=0;
        int original=number;
        while(number>0){
            reversed=reversed*10+number%10;
            number=number/10;
        }
        return (original==reversed);
    }
}
