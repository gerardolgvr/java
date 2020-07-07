package dev.gerardo.exercises.arrays;

import java.util.Arrays;

/* Highest and Lowest

In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Example:

highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"

Notes:

All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.

 */

public class Numbers {

    public static String highAndLow(String numbers) {
        String[] numbersArray = numbers.split(" ");
        int[] numbersArrayInt = new int[numbersArray.length];

        for(int i = 0; i < numbersArrayInt.length; i++){
            numbersArrayInt[i] = Integer.parseInt(numbersArray[i]);
        }

        Arrays.sort(numbersArrayInt);


        return "" + numbersArrayInt[numbersArrayInt.length - 1] + " " + numbersArrayInt[0];
    }

    /* Arrays: Left rotarion: https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
     */
    public static int[] rotLeft(int[] a, int d) {
        int[] res = new int[a.length];
        for(int i = 0; i < a.length; i++){
            int op = i + d;
            int index = op >= a.length ? op - a.length : op;
            res[i] = a[index];
        }
        return res;
    }
}
