package dev.gerardo.exercises.hashmaps;

import java.util.HashMap;

public class RansomNote {
    public static String checkMagazine(String[] magazine, String[] note) {
        // guardar todas las palabrar en un hashset
        HashMap<String, Integer> map = new HashMap<>();
        int verifier = 0;
        String res = "";
        // luego iterar sobre las palabras de la nota y asegurar que están las requeridas
        for(int i = 0; i < magazine.length; i++){
            if(map.containsKey(magazine[i])) {
                int val = map.get(""+magazine[i]);
                map.put(""+magazine[i], ++val);
            } else {
                map.put(""+magazine[i], 1);
            }
        }

        for(int i = 0; i < note.length; i++){
            if(map.containsKey(""+note[i])) {
                int val = map.get(""+note[i]);
                map.put(""+note[i], --val);
                if(val < 0) break;
                verifier++;
            } else {
                map.put(""+note[i], -1);
            }
        }

        res = verifier == note.length ? "Yes" : "No";

        return res;
    }
}
