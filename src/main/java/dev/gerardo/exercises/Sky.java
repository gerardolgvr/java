package dev.gerardo.exercises;

/*
Jumping on the Clouds
exercise: https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */

public class Sky {
    public static int jumpingOnClouds(int n, int[] c) {
        int jumps = 0;
        // iterar sobre el array
        if(n >= 2 && n <= 100 && c[0] == 0){
            for(int i = 0; i < c.length; i++) {
                //verificar las posibilidades de brinco
                if((i + 2) < c.length) {
                    if(c[i+2] == 0) {
                        jumps ++;
                        i ++;
                    } else {
                        jumps ++;
                    }
                } else if(i + 1 == c.length -1){
                    jumps ++;
                    break;
                }
            }
        }
        return jumps;
    }
}
