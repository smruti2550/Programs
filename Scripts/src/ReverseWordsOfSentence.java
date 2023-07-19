import java.util.Scanner;

public class ReverseWordsOfSentence {

    public static void main(String[] argument){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the input");
        System.out.println(reverseSentence(scn.nextLine()));

    }

    static String reverseSentence(String input){
        String[] arr= input.split(" ");
        StringBuilder sb= new StringBuilder();
        for (int i=arr.length-1;i>=0;i--){
            sb.append(reverseWord(arr[i]));
            sb.append(" ");
        }
        return sb.toString();
    }

    static String reverseWord(String word){
        String op="";
        for (int i=word.length()-1;i>=0;i--){
            op=op+word.charAt(i);
        }
        return op;
    }

}

