package com.benchire.programs;

public class ContiguousSubArray {

    public void findMaximumForEach(int array[], int subset) {
        int lengthOrArray = array.length;
        int greaterNumber;
        for (int i = 0; i <= (lengthOrArray - subset); i++) {
            greaterNumber = array[i];
            for (int j = 1; j < (subset); j++) {
                if (array[i + j] > greaterNumber) {
                    greaterNumber = array[i + j];
                }
            }
            System.out.println(greaterNumber);
        }
    }
}
