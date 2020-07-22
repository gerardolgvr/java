package dev.gerardo.exercises.sorting;

public class App {

    public static void main(String[] args) {

        int[] array = new int[]{3,2, 1};

        Object res = BubbleSort.countSwaps(array);

        System.out.println(String.valueOf(res));

    }
}
