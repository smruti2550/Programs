package Geekforgeeks.String;

public class ReverseString {
    public static void main(String[] args){
        System.out.println(reverse("abcd"));

    }

    public static String reverse(String input){

        if (input.length()<=1) return input;

        return reverse(input.substring(1))+input.charAt(0);

    }
}
