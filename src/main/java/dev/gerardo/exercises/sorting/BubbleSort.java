package dev.gerardo.exercises.sorting;

/* Sorting: Bubble Sort
https://www.hackerrank.com/challenges/ctci-bubble-sort/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
 */

public class BubbleSort {

    public static Object countSwaps(int[] a) {
        int swaps = 0;

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length - 1; j++){
                if(a[j] > a[j+1]){
                    int aux = a[j];
                    a[j] = a[j+1];
                    a[j+1] = aux;
                    swaps ++;
                }

            }
        }
        return swaps;
    }
}
