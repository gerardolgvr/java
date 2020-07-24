package dev.gerardo.exercises.arrays;


import dev.gerardo.QuickSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewYearChaosTest {


    @Test
    public void testCase0(){
        assertEquals("3", NewYearChaos.minimumBribes(new int[] { 2, 1, 5, 3, 4 }));
        assertEquals("Too chaotic", NewYearChaos.minimumBribes(new int[] { 2, 5, 1, 3, 4 }));
    }


    @Test
    public void testCase1(){
        assertEquals("Too chaotic", NewYearChaos.minimumBribes(new int[] { 5, 1, 2, 3, 7, 8, 6, 4 }));
        assertEquals("7", NewYearChaos.minimumBribes(new int[] { 1, 2, 5, 3, 7, 8, 6, 4 }));
    }


    @Test
    public void testCase2(){
        assertEquals("4", NewYearChaos.minimumBribes(new int[] { 1, 2, 5, 3, 4, 7, 8, 6 }));
    }

    @Test
    public void testCaseAlt0(){
        assertEquals("3", NewYearChaos.minimumBribesAlt(new int[] { 2, 1, 5, 3, 4 }));
        assertEquals("Too chaotic", NewYearChaos.minimumBribesAlt(new int[] { 2, 5, 1, 3, 4 }));
    }

    @Test
    public void testCaseAlt1(){
        assertEquals("Too chaotic", NewYearChaos.minimumBribesAlt(new int[] { 5, 1, 2, 3, 7, 8, 6, 4 }));
        assertEquals("7", NewYearChaos.minimumBribesAlt(new int[] { 1, 2, 5, 3, 7, 8, 6, 4 }));
    }

    @Test
    public void testCaseAlt02(){
        assertEquals("4", NewYearChaos.minimumBribesAlt(new int[] { 1, 2, 5, 3, 4, 7, 8, 6 }));
    }

    @Test
    public void testCaseAlt03(){
        assertEquals("Invalid queue", NewYearChaos.minimumBribesAlt(new int[] { 1, 2, 5, 3, 4, 7, 8, 6, 9, 10, 11 }));
    }

    @Test
    public void RCase(){
        int arr[] = { 2, 1, 5, 3, 4 };

        System.out.println("Given Array");
        QuickSort.printArray(arr);

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array gg in " + QuickSort.sumSwaps);
        QuickSort.printArray(arr);
    }
}
