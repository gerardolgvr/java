package dev.gerardo.exercises.arrays;

public class MinimumSwaps {
    public static int process(int[] arr) {
        int swaps = 0;

        for(int i = 0; i < arr.length; i++) {
            int currentValue = arr[i];
            int spectedValue = i + 1 ;

            if(spectedValue != currentValue) {
                for(int j = i + 1; j < arr.length ; j++) {
                    if(arr[j] == spectedValue) {
                        int aux = arr[j];
                        arr[j] = arr[i];
                        arr[i] = aux;
                        swaps ++;
                        break;
                    }
                }
            }

        }

        return swaps;
    }
}
