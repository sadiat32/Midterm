package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
        for (String i : wordNLength.values()) {
            s = i.length() + " " + i;
        }
        System.out.println(s);
    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){
        Map<Integer, String> map = new HashMap<Integer, String>();
       //implement
        String st[] = wordGiven.split(" ");
        String maxWord = st[0];
        for (int i = 1; i < st.length; i++) {
            if (st[i].length() > maxWord.length()) {
                maxWord = st[i];
            }
        }
        map.put(maxWord.length(), maxWord);

        return map;
    }
}
