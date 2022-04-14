package programmingPractise.interviewQuestions.arraysRelated;

import java.util.HashMap;

public class Nproblem1 {
    //WAP to find out the max and min from an array
    public static void main(String[] args) {

        int[] array = {3, 0, 11, 9, 1, 2};

//        System.out.println("Minimum digit from the given array is " + getMinValueFromAnArray(array));
//        System.out.println("Maximum digit from the given array is " + getMaxValueFromAnArray(array));
//        System.out.println("Second Largest digit from the given array is " + getSecondLargestElementFromArray(array));
//        System.out.println("Second Largest digit from the given array is " + getSecondLargestElementFromArrayUsingSorting(array));

    }

    //WAP to find out the min from an array
    public static int getMinValueFromAnArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    //WAP to find out the max from an array
    public static int getMaxValueFromAnArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    //WAP to find the second largest element from an int array
    public static int getThirdLargestElementFromArray(int[] array) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE, thirdLargest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            largest = Math.max(largest, array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < largest) {
                secondLargest = Math.max(secondLargest, array[i]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < secondLargest) {
                thirdLargest = Math.max(thirdLargest, array[i]);
            }
        }
        return secondLargest;
    }

    //WAP to find the second largest element from an int array
    public static int getSecondLargestElementFromArray(int[] array) {
        int firstLargest = array[0], secondLargest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = array[i];
            }
            if (array[i] < firstLargest && array[i] > secondLargest) {
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }

    //WAP to find the second largest element from an int array using bubble sort
    public static int getSecondLargestElementFromArrayUsingSorting(int[] array) {
        if (array.length < 2) {
            System.out.println("Invalid output");
            return 0;
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = array.length - 1; i >= 1; i--) {
            if (array[i] != array[i - 1]) {
                return array[i - 1];
            }
        }

        return array[0];
    }



}
