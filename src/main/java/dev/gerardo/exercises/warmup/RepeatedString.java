package dev.gerardo.exercises.warmup;

/* Repeated String
url: https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */

public class RepeatedString {
    public static long process(String s, long n) {
        if(s.length() < 1 || s.length() > 100 && (n < 1 && n > Math.pow(10, 12))) {
            return (long) 0;
        }
        int quantityA = 0;
        long res;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a') quantityA ++;
        }
        long resto = n % (long) s.length();
        res = n / (long) s.length() * quantityA;
        if(resto == 0){
            return res;
        } else {
            for(int i = 0; i < resto; i++){
                if(s.charAt(i) == 'a') res ++;
            }
        }
        return res;
    }

}
