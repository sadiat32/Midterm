package string.problems;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UnitTestingStringProblem {
    //public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

    @Test
    public void test1() {
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordLength = findTheLargestWord(s);
        Set<Integer> large = wordLength.keySet();
        int val = Collections.max(large);
        System.out.println("The word with max length is : " + wordLength.get(val));

    }

    static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String[] words = wordGiven.split("\\s");
        for (int i = 0; i < words.length; i++) {
            map.put(words[i].length(), words[i]);
        }
        return map;

        Assert.assertEquals(Collections.max(large), i);
        System.out.println("test 1 passed");
    }
}
