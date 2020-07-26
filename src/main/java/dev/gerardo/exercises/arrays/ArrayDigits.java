package dev.gerardo.exercises.arrays;

/*
Given a non-negative integer, return an array of the individual digits
 */

public class ArrayDigits {

    public static int[] digitalize(int n) {
        if(n >= 0) {
            String numberString = String.valueOf(n);
            int[] numbersArray = new int[numberString.length()];

            for(int i = 0; i < numbersArray.length; i++) {
                numbersArray[i] = Integer.parseInt(""+numberString.charAt(i));
            }

            return numbersArray;
        }
        return new int[]{ };
    }
}
