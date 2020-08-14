package com.benchire.programs;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Que No 2 :Given an array arr of size N and an integer K, the task is to find the maximum for each and every\n" +
                "contiguous subarray of size K ------");

        ContiguousSubArray contiguousSubArray = new ContiguousSubArray();

        int array[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
        System.out.println("1: out put of array[1,2,3,1,4,5,2,3,6] with k =3");
        contiguousSubArray.findMaximumForEach(array, k);

        int arrayTwo[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
        int k2 = 4;
        System.out.println("2: out put of arrayTwo[8, 5, 10, 7, 9, 4, 15, 12, 90, 13] with k =4");
        contiguousSubArray.findMaximumForEach(arrayTwo, k2);

        System.out.println("----------------------------------------------------------------");

        System.out.println(" Given an array arr[] of size N and a number K, the task is to find the length of the smallest\n" +
                "subsequence such that the sum of the subsequence is greater than or equal to number K-------");

        SmallestSubsequence smallestSubsequence = new SmallestSubsequence();

        int[] NumberArray1 = {1, 2, 2, 2, 3, 4, 5, 4, 7, 6, 5, 12};
        System.out.println("First the length of the smallest subsequence : " + smallestSubsequence.findMinimumLengthOfArray(NumberArray1, 70));

        int[] NumberArray2 = {2, 3, 1, 5, 6, 3, 7, 9, 14, 10, 2, 5};
        System.out.println("second the length of the smallest subsequence : " + smallestSubsequence.findMinimumLengthOfArray(NumberArray2, 35));

    }
}

