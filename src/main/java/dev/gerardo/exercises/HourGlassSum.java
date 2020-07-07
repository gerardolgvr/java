package dev.gerardo.exercises;

/* 2D Array - DS
 https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

 empezar en 1,1  y terminar en lenght - 1 (5) en array sería el index 4 -> columnas
 posicionado en el pivote hacer la suma
 comparar la suma anterior con la actual
 preservar la mayor
 lo mismo con las filas lenght - 1 (5) en array sería el index 4
 */


public class HourGlassSum {
    public static int getHigher(int[][] arr) {
        int sum = -64;
        int auxSum = 0;

        for(int i = 1; i < arr.length - 1; i++) {
            for(int j = 1; j < arr.length - 1; j++){
                auxSum = arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1];
                auxSum += arr[i][j];
                auxSum += arr[i + 1][j - 1] + arr[i + 1][j] + arr[i + 1][j + 1];
                if(auxSum > sum) sum = auxSum;
            }
        }

        return sum;
    }
}
