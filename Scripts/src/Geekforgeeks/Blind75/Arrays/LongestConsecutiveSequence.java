package Geekforgeeks.Blind75.Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {
    public static void main (String[] args){
        int [] arr= {100,4,200,1,3,2};
        System.out.println(solution(arr));
    }
    public static int solution(int [] arr){
        int longest=0;
        Map<Integer,Boolean> mp= new HashMap<>();
        for (int num: arr){
            mp.put(num,Boolean.FALSE);
        }
        for (int num:arr){
            int currentLength=1;
            int nextNum=num+1;
//            for forward direction
            while(mp.containsKey(nextNum)&& mp.get(nextNum)==false){
                currentLength++;
                mp.put(nextNum,Boolean.TRUE);
                nextNum++;
            }
            int prevNum=num-1;
            //            for backward direction
            while (mp.containsKey(prevNum)&&mp.get(prevNum)==false){
                mp.put(prevNum,Boolean.TRUE);
                prevNum--;
                currentLength++;
            }
            longest= Math.max(longest,currentLength);
        }
        return longest;
    }
}
