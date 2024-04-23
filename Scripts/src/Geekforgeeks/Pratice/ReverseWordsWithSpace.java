package Geekforgeeks.Pratice;

public class ReverseWordsWithSpace {
    public static void main (String[] args){
        String input="i love java coding";
        System.out.println(solution(input));
    }
    public static String solution(String input){
        char[] arr= input.toCharArray();
        char[] result= new char[arr.length];
        for(int i=0;i<arr.length;i++){
            if (arr[i]==' ') result[i]=' ';
        }
        int j= result.length-1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=' '){
                if (result[j]==' '){
                    j--;
                }
                result[j]=arr[i];
                j--;
            }
        }
        return new String(result);
    }
}
