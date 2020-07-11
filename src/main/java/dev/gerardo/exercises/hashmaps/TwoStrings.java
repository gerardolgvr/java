package dev.gerardo.exercises.hashmaps;

import java.util.HashSet;

// https://www.hackerrank.com/challenges/two-strings/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps

public class TwoStrings {
    public static String compare(String s1, String s2  ) {
        HashSet<String> map = new HashSet<>();
        String res = "NO";

        for(int i = 0; i < s1.length(); i++){
            map.add(""+s1.charAt(i));
        }

        for(int i = 0; i < s2.length(); i++){
            if(map.contains(""+s2.charAt(i))) {
                res = "YES";
                break;
            }
        }
        return res;
    }
}
