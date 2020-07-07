package dev.gerardo.exercises.strings;

import java.util.HashMap;
import java.util.Map;

/*
Strings: Making Anagrams
https://www.hackerrank.com/challenges/ctci-making-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 */
public class Anagram {
    public static int process(String a, String b) {
        HashMap<String, Integer> map = new HashMap<>();
        int sum = 0;

        for(int i = 0; i < a.length(); i++){
            if(map.containsKey(""+a.charAt(i))) {
                int val = map.get(""+a.charAt(i));
                map.put(""+a.charAt(i), ++val);
            } else {
                map.put(""+a.charAt(i), 1);
            }
        }

        for(int i = 0; i < b.length(); i++){
            if(map.containsKey(""+b.charAt(i))) {
                int val = map.get(""+b.charAt(i));
                map.put(""+b.charAt(i), --val);
            } else {
                map.put(""+b.charAt(i), -1);
            }
        }

        for (Map.Entry<String, Integer> item : map.entrySet())
            sum += Math.abs(item.getValue());

        return sum;
    }
}
