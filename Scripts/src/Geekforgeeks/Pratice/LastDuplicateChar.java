package Geekforgeeks.Pratice;

import java.util.LinkedHashMap;

public class LastDuplicateChar {
    public static void main(String[] args){
        String input= "aadccb";
        System.out.println(solution1(input));
    }
    public static char solution(String input) {
        char c=0;
        int counter=0;
        for (int i = input.length() - 1; i >= 0; i--) {
            counter++;
            for (int j = 0 ; j < input.length()-counter; j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    System.out.println(i+"-"+j);
                    return input.charAt(i);
                }
            }
        }
        return c;
    }
    public static char solution1(String input){
        LinkedHashMap<Character, Integer> mp = new LinkedHashMap();
        for (int i=0;i<input.length();i++){
            char c= input.charAt(i);
            mp.put(c, mp.getOrDefault(c,0)+1);
        }
        for (int i=input.length()-1;i>=0;i--){
            char c= input.charAt(i);
            if (mp.get(c)>1) return c;
        }
        return 0;
    }
}

