package Geekforgeeks.Stack;

import java.util.Stack;

public class Paranthesis {
    public static void main(String[] args){
        String input= "{[(]}";
        char[] arr= input.toCharArray();
        Stack<Character> st= new Stack<>();
        for (char c: arr){
            if(c=='{' || c=='[' || c=='('){
                st.push(c);
            }
            else if(st.empty() || !isSame(st.pop(),c)) {
                System.out.println("False");
                break;
            }
        }
        if (st.empty()) System.out.println("True");
    }

    public static boolean isSame(char open, char close){
        return (open=='{' && close=='}') ||
                (open == '[' && close == ']') ||
                (open == '(' && close == ')');
    }
}
