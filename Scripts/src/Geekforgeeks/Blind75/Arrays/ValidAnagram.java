package Geekforgeeks.Blind75.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args){
        System.out.println(check1("abcdee","aeebcd"));
    }
    public static boolean check (String one, String two){
        if (one.length()!=two.length()) return false;
        char [] arr1= one.toCharArray();
        Arrays.sort(arr1);
        one = new String(arr1);
        char [] arr2= two.toCharArray();
        Arrays.sort(arr2);
        two = new String(arr2);
        return one.equals(two);
    }
    public static boolean check1(String one, String two){
        if (one.length()!=two.length()) return false;
        HashMap<Character,Integer> mp= new HashMap<>();
        for (int i=0;i<one.length();i++){
            char c= one.charAt(i);
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        System.out.println(mp);
        for (int i=0;i<two.length();i++){
            char ch= two.charAt(i);
            if (!mp.containsKey(ch) || mp.get(ch)==0){
                return false;
            }
            mp.put(ch, mp.get(ch)-1);
        }
        return true;
    }
}

