package com.algorithms.other.FibonacciSequence;

/**
 * The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 * The next number is found by adding up the two numbers before it.
 */
public class Fibonacci {

    public static int fib(int n) {

        if(n == 0) {
            return 0;
        }
        else if(n == 1) {
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
}
