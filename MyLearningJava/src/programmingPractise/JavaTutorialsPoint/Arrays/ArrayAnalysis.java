package programmingPractise.JavaTutorialsPoint.Arrays;

import java.util.*;

public class ArrayAnalysis {


    public static void main(String[] args) {
        //Program1
        int[] array1 = new int[]{1, 2, 3};
        copyAllElementsFromOneArrayToAnother(array1, new int[array1.length]);
        System.out.println("---------------------------------------------------------------------------------------------------------");
        //Program2
        int[] array2 = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};
        frequencyOfEachElementInAnArray(array2);
        System.out.println("---------------------------------------------------------------------------------------------------------");
        //Program3
        int[] array3 = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};
        frequencyOfEachElementInAnArrayUsingHashMap(array3);
        System.out.println("---------------------------------------------------------------------------------------------------------");
        //Program5
        int[] array5 = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};
        printLargestValueFromAnArray(array5);
        System.out.println("---------------------------------------------------------------------------------------------------------");
        //Program6
        int[] array6 = new int[]{2, 3, 4, 4, 4, 5, 7};
        getSecondLargestElementFromArray(array6);
        System.out.println("---------------------------------------------------------------------------------------------------------");
        //Program7
        sortAnArrayUsingBubbleSort();
        System.out.println("---------------------------------------------------------------------------------------------------------");
        //Program8
        sortAnArrayUsingSelectionSort();
        System.out.println("---------------------------------------------------------------------------------------------------------");
        //Program9
        int[] array9 = new int[]{2, 3, 4, 4, 4, 5, 7};
        reverseAnArray(array9);
    }

    //1. Java Program to copy all elements of one array into another array
    public static void copyAllElementsFromOneArrayToAnother(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        System.out.println(Arrays.toString(array2));
    }


    //2. Java Program to find the frequency of each element in the array  (IMPORTANT)
    //outPut:
/*    Element: 1 count: 2
    Element: 2 count: 4
    Element: 8 count: 1
    Element: 3 count: 1
    Element: 5 count: 1*/
    public static void frequencyOfEachElementInAnArray(int[] array) {
        int count = 1;
        List alreadyUsedElement = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            if (!alreadyUsedElement.contains(array[i])) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                    }
                }
                alreadyUsedElement.add(array[i]);
                System.out.println("Element: " + array[i] + " count: " + count);
                count = 1;
            }

        }
    }

    //3. Java Program to find the frequency of each element in the array  (**IMPORTANT**)
    //output:
    //{1=2, 2=4, 3=1, 5=1, 8=1}
    public static void frequencyOfEachElementInAnArrayUsingHashMap(int[] array) {
        Map elementWithItsCount = new HashMap();
        for (int eachElement : array) {
            if (elementWithItsCount.get(eachElement) == null)
                elementWithItsCount.put(eachElement, 1);
            else
                elementWithItsCount.put(eachElement, (int) elementWithItsCount.get(eachElement) + 1);
        }
        System.out.println(elementWithItsCount);
    }

    //4. Write a Java program to find duplicate elements in an array.
    /*Note use frequencyOfEachElementInAnArrayUsingHashMap() logic to get the data for this problem*/


    //5.WAP to find the largest element from an int array
    public static void printLargestValueFromAnArray(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    //6. WAP to find the second largest element from an int array   (**IMPORTANT**)
    public static void getSecondLargestElementFromArray(int[] array) {
        int firstLargest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = array[i];
            }
            if (array[i] < firstLargest && array[i] > secondLargest) {
                secondLargest = array[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE)
            secondLargest = firstLargest;
        System.out.println(secondLargest);
    }

    //7. Sorting using bubble sort
    public static void sortAnArrayUsingBubbleSort() {
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

    //8. Sort an Array using selection Sort
    public static void sortAnArrayUsingSelectionSort() {
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

    //9. WAP to reverse an array without using extra array  (**IMPORTANT**)
    public static void reverseAnArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i]= array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
