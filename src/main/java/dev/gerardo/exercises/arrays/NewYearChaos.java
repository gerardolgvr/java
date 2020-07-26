package dev.gerardo.exercises.arrays;

import java.util.HashSet;

public class NewYearChaos {

    public static String minimumBribes(int[] q) {
        int sumDifferences = 0;

        for(int i = 0; i < q.length; i++){
            int spectedValue = i+ 1;
            int currentValue = q[i];
            int difference = Math.abs(currentValue - spectedValue);

            if(difference >= 3){
                return ("Too chaotic");
            } else {
                sumDifferences += difference;
            }
        }

        return String.valueOf(sumDifferences / 2);
    }

    public static String minimumBribesAlt(int[] q){
        int[] swapsArrayCount = new int[q.length];
        int sumSwaps = 0;

        if(q.length > 10){
            return "Invalid queue";
        }

        // 2 1 5 3 4
        for(int i = 0; i < q.length - 1; i++){
            for(int j = 0; j < q.length - i - 1; j++){
                if (q[j] > q[j+1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = q[j];
                    q[j] = q[j+1];
                    q[j+1] = temp;

                    // increment swaps to the highest element
                    int valueItem = q[j+1];
                    int valueItemPos = valueItem - 1;
                    swapsArrayCount[valueItemPos] += 1;

                    // check if swaps are higher than 2
                    if(swapsArrayCount[valueItemPos] > 2)
                        return "Too chaotic";

                    // sumarizing swaps
                    sumSwaps ++;
                }
            }
        }

        return String.valueOf(sumSwaps);
    }

    static void minimumBribesHackRankVersion(int[] q) {
        int[] swapsArrayCount = new int[q.length];
        int sumSwaps = 0;
        boolean isChaotic = false;

        for(int i = 0; i < q.length - 1; i++){
            for(int j = 0; j < q.length - i - 1; j++){
                if (q[j] > q[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = q[j];
                    q[j] = q[j+1];
                    q[j+1] = temp;

                    // increment swaps to the highest element
                    int valueItem = q[j+1];
                    int valueItemPos = valueItem - 1;
                    swapsArrayCount[valueItemPos] += 1;

                    // check if swaps are higher than 2
                    if(swapsArrayCount[valueItemPos] > 2) {
                        isChaotic = true;
                        break;
                    }

                }
            }

            if(isChaotic){
                break;
            }
        }

        if(isChaotic){
            System.out.println("Too chaotic");
        } else {
            // sumarizing swaps
            for(int i = 0; i < swapsArrayCount.length; i++){
                sumSwaps += swapsArrayCount[i];
            }

            System.out.println(sumSwaps);
        }
    }

    public static String minimumBribesHackRankVersionP(int[] q) {
        int count = 0;
        if(q.length <= 10) {
            for(int i = q.length - 1; i <= 0; i--) {

                if(q[i] != (i+1)) { //q[4] == 5
                    if(q[i-1] == (i+1)) { // q[3] = 3 == 5
                        int aux = q[i-1];
                        q[i-1] = q[i];
                        q[i] = aux;
                        count++;
                    }
                    if(q[i-2] == (i+1)) { //q[2] == 4 == 5
                        count = count + 2;
                        int aux = q[i-2];
                        q[i-2] = q[i];
                        q[i] = aux;
                    }
                    else {
                        return "Too chaotic";
                    }
                }

            }
            return String.valueOf(count);
        } else {
            return "Invalid queue";
        }


    }

}
