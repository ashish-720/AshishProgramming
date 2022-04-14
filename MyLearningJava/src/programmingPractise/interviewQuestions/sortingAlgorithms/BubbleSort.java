package programmingPractise.interviewQuestions.sortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {25, 36, 8, 20, 19};
        for (int i = 0; i < array.length; i++) {
            int squareValue = array[i] * array[i];
            array[i] = squareValue;
        }
        for (int numberOfIterations = 0; numberOfIterations <= array.length - 1; numberOfIterations++) {
            for (int i = 0; i <= array.length - 2 - numberOfIterations; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
