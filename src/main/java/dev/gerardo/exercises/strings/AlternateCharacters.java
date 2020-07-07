package dev.gerardo.exercises.strings;

import java.util.HashMap;
import java.util.Map;

/* Alternating Characters
https://www.hackerrank.com/challenges/alternating-characters/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 */

public class AlternateCharacters {
    public static int process(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        int sum = 0;
        // use a map to store the key and the quantity
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                if(map.containsKey(""+s.charAt(i))) {
                    int val = map.get(""+s.charAt(i));
                    map.put(""+s.charAt(i), ++val);
                } else {
                    map.put(""+s.charAt(i), 1);
                }
            }
        }
        // iterate again to sum the possible deleted item
        for (Map.Entry<String, Integer> item : map.entrySet())
            sum += item.getValue();

        // return the sum
        return sum;
    }
}
