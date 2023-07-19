import java.util.Scanner;

public class UniqueCharCount {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the input to to check");
        unique(scn.nextLine());
    }

    static void unique(String input){
        String s="";
        char c;
        for (int i=0;i<input.length();i++){
            if(s.indexOf(input.charAt(i))==-1){
                c= input.charAt(i);
                System.out.println(c+"="+count(input,c));
                s=s+c;
            }
        }
    }
    static int count(String input, char c){
        return input.length()-input.replace(c+"","").length();
    }
}
