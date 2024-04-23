package Geekforgeeks.String;

import java.util.HashMap;

public class NewTest {
    public static void main(String[] args) {
        String[] strdata = {"hello", "try", "there", "tell", "use", "sun", "moon"};
        String junkstrchar = "hetrllyotheumseo";
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : junkstrchar.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (String word : strdata) {
            if (isWordValid(word, charCount)) {
                System.out.println(word);
            }
        }
    }

    private static boolean isWordValid(String word, HashMap<Character, Integer> charCount) {

        for (char c : word.toCharArray()) {
            if (!charCount.containsKey(c) || charCount.get(c) <= 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }
        return true;
    }
}
