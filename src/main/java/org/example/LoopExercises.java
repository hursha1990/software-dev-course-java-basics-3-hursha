package org.example;

public class LoopExercises {
    public int sum(int n) {
        int sumOfNumber = 0;
        // Replace the line below with code that returns the sum of the numbers from 1 to n
        // (use a for loop)
        for (int i = 1; i <= n; i++) {
            sumOfNumber = sumOfNumber + i;

        }
            return sumOfNumber;
        }

    public int sumUntilEven(int n) {
        // Replace the line below with code that returns the sum of the numbers from 1 to n
        // but stops adding when the sum is even
        // (use a while loop with a sum variable and a counter variable)
        int sum = 0;
        int i = 1 ;

        while (i <= n) {
            sum =sum +i;

            if (sum% 2 == 0 ) {
                break;
            }
            i++;
        }
        return sum ;
    }
}
