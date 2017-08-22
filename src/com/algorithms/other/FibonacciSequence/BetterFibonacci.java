package com.algorithms.other.FibonacciSequence;

/**
 * Created by Karyn on 8/21/2017.
 */
public class BetterFibonacci {
    public static int betterFibonacci(int n) {
        // base cases
        if(n == 0) {
            return 0;
        }
        if(n < 3) {
            return 1;
        }
        // init
        int total = 0;
        int first = 1;
        int second = 1;

        // calculate
        for(int i = 3; i <= n; i++) {
            total = first + second;
            first = second;
            second = total;
        }

        return total;
    }
}
