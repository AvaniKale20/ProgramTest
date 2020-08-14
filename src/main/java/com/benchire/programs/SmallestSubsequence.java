package com.benchire.programs;

public class SmallestSubsequence {
    public int findMinimumLengthOfArray(int[] numbers, int k) {
        int minLength = Integer.MAX_VALUE;
        int sum;
        for (int i = 0; i < numbers.length; i++) {
            sum = 0;
            for (int j = i; j < numbers.length; j++) {
                sum = sum + numbers[j];
                if (sum >= k) {
                    minLength = Math.min(minLength, (j - i) + 1);
                    break;
                }
            }
        }
        return (minLength == Integer.MAX_VALUE) ? (-1) : minLength;
    }
}