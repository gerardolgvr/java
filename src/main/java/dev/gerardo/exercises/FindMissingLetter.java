package dev.gerardo.exercises;

/* Find the missing letter

Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.

You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
The array will always contain letters in only one case.

Example:

['a','b','c','d','f'] -> 'e'
['O','Q','R','S'] -> 'P'

(Use the English alphabet with 26 letters!)

 */

public class FindMissingLetter {
    public static char find(char[] array) {
        if (array.length > 1) {
            for (int i = 1; i < array.length; i++) {
                int dif = (int) array[i] - (int) array[i - 1];
                if (dif > 1) {
                    int numericValue = (int) array[i] - 1;
                    return (char) numericValue;
                }
            }
        }
        return ' ';
    }
}
