package Geekforgeeks.Blind75.twoPointer;

public class ValidPalindrome {
    public static void main(String[] args){
        System.out.println(solution("A man, a plan, a canal: Panama"));

    }

    public static boolean solution(String input){
        if (input.isEmpty()) return true;
        input=input.toLowerCase();
        int first= 0;
        int last= input.length()-1;
        while(first<=last){
           char cFirst=input.charAt(first);
           char cLast=input.charAt(last);
           if (!Character.isLetterOrDigit(cFirst)) first++;
           else if (!Character.isLetterOrDigit(cLast)) last--;
           else {
               if(cFirst!=cLast) {
                   return false;
               }
               first++;
               last--;
           }

        }
        return true;
    }
}
