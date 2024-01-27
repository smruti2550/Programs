package Geekforgeeks.Recursion;

public class palindrome {
    public static void main(String[] args){
        String input="abcd";
        int start=0;
        int end = input.length()-1;

        System.out.println(check(input,start,end));
    }

    static boolean check(String input, int start, int end){
        if (start>=end) return true;

        if (input.charAt(start)!=input.charAt(end)) return false;
       return (check(input,start+1,end-1));
    }
}
