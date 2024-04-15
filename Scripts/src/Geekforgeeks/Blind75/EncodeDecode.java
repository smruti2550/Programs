package Geekforgeeks.Blind75;

import java.util.Stack;

public class EncodeDecode {
    public static void main (String[] args){
        System.out.println(encode1("3[a]2[bc]"));
    }
    public static String encode(String input) {
        Stack<Integer> num = new Stack<>();
        Stack<StringBuilder> value = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n + 10 + (c - '0');
            } else if (c == '[') {
                num.add(n);
                n = 0;
                value.add(sb);
                sb = new StringBuilder();
            } else if ((c == ']')) {
                StringBuilder temp = sb;
                sb = value.pop();
                int count = num.pop();
                for (int i = 0; i < count; i++)
                    sb.append(temp);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static String encode1(String input) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        int n = 0;
        for(char c:input.toCharArray()){
            if (Character.isDigit(c)){
                n=n*10+(c-'0');
            }
            else if(c=='['){
                numStack.push(n);
                n=0;
                stringStack.push(String.valueOf(c));
            }
            else if (c != ']') {
                stringStack.push(String.valueOf(c));
            }
            else {
                StringBuilder sb= new StringBuilder();
                while(!stringStack.peek().equals("[")){
                    sb.insert(0,stringStack.pop());
                }
                stringStack.pop();
                StringBuilder temp= new StringBuilder();
                int count= numStack.pop();
                for (int i = 0; i < count; i++)
                    temp.append(sb);
                stringStack.push(temp.toString());
            }
        }
        StringBuilder result= new StringBuilder();
        while (!stringStack.empty()){
            result.insert(0, stringStack.pop());
        }
        return result.toString();
    }
}
