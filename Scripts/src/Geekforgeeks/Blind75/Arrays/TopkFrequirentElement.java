package Geekforgeeks.Blind75.Arrays;

import java.util.*;

public class TopkFrequirentElement {
    public static void main (String[] args){
        int [] arr={1,1,1,2,2,3};
        for (int op: Check(arr, 2)){
            System.out.println(op);
        }
    }

    public static int[] Check(int [] arr, int k){
        HashMap<Integer, Integer> mp= new HashMap<>();
        for (int i: arr){
            mp.put(i, mp.getOrDefault(i,0)+1);
        }
        PriorityQueue np = new PriorityQueue<> (Comparator.comparingInt(mp::get));
        for (Integer key: mp.keySet()){
            np.add(key);
            if (np.size()>k){
                np.poll();
            }
            System.out.println(np);
        }
        int [] result= new int[k];
        int i=0;
        while (!np.isEmpty()){
            result[i]=(int)np.poll();
            i++;
        }
        return result;
        }

    public static int[] Check1(int [] arr, int k){
        HashMap<Integer, Integer> mp= new HashMap<>();
        for (int i: arr){
            mp.put(i, mp.getOrDefault(i,0)+1);
        }
        List<Integer>[] buckets= new List[arr.length+1];
        for (int i=0;i<buckets.length;i++){
            buckets[i]= new ArrayList<>();
        }
        for (int i:mp.keySet()){
            buckets[mp.get(i)].add(i);
        }
        int [] result= new int[k];
        int counter=0;
        for (int i=buckets.length-1;i>=0;i--){
            for (int j:buckets[i]){
                result[counter]=j;
                counter++;
                System.out.println(counter);
                if(counter>=k) return result;
            }
        }
        return result;

    }

    }

