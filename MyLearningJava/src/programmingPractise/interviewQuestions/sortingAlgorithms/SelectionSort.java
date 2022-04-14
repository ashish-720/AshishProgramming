package programmingPractise.interviewQuestions.sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {25, 36, 8, 20, 19, 6, 0, 87, 123, 77, 88, 23};
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minIndex = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            if (min < array[i]) {
                array[minIndex] = array[i];
                array[i] = min;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
