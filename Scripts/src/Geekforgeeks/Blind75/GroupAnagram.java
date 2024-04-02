package Geekforgeeks.Blind75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static void main (String [] args){
        String[] arr= {"eat","tea","tan","ate","nat","bat"};
        String[] arr1= {""};
        System.out.println(check(arr1));

    }

    public static List<List<String>> check(String[] arr){
        HashMap<String,List<String>> mp = new HashMap<>();
        for (String value: arr){
            char [] ch= value.toCharArray();
            Arrays.sort(ch);
            String sortedString= new String(ch);
            if (!mp.containsKey(sortedString)){
                mp.put(sortedString,new ArrayList<>());
            }
            mp.get(sortedString).add(value);
        }
        return new ArrayList<>(mp.values());
    }
}
