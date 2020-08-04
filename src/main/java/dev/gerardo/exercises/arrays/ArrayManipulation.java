package dev.gerardo.exercises.arrays;

public class ArrayManipulation {
    public static long arrayManipulation(int n, int[][] queries) {
        int[] matrix = new int[n];
        long max = 0;

        for(int i = 0; i < queries.length; i++) {
            for(int j = 0; j < matrix.length; j++) {

                if(j < queries[i][0])
                    j = queries[i][0] - 1;

                if(j+1 >= queries[i][0] && j+1 <= queries[i][1]) {
                    matrix[j] += queries[i][2];
                    if(matrix[j] > max)
                        max = matrix[j];
                }

                if(j+1 > queries[i][1])
                    break;
            }
        }

        return max;
    }
}
