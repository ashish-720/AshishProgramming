package programmingPractise.interviewQuestions.arraysRelated;

import java.util.*;

public class Nproblem2 {

    //Duplicates related problems:

    public static void main(String[] args) {
        //printDuplicatesUsingCollection(new int[]{5, 1, 6, 3, 1, 7, 3, 6, 6, 2});
        //printDuplicatesUsingCollectionWithRequiredFormat(new char[]{'a', 'b', 'c', 'a', 'a', 'c', 'e', 'e', 'd', 'h', 'e'});
        //System.out.println(printFirstDuplicateOccurrenceInAnArray(new int[]{13, 41, 51, 41, 5, 2, 1, 0}));
        getNonDuplicatesFromAnArray(new int[]{13, 41, 51, 41, 5, 2, 1, 0, 0}, "secondWay");
    }

    //WAP to print duplicates elements present in the array
    public static void printDuplicateElementsInAnArray(int[] array) {
        //using brut force algorithm
        //This logic is applicable if the max duplicates for an element is less than 3. For eg: [2,1,0,2,3,1,4]
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    System.out.println("Duplicate element is " + array[i]);
            }
        }
    }

    //WAP to print duplicates elements present in the array
    public static void printDuplicatesUsingHashMap(int[] array) {
        //More efficient way using Collection
        Map dataMap = new HashMap<Integer, Integer>();
        for (int eachElement : array) {
            if (dataMap.get(eachElement) == null) {
                dataMap.put(eachElement, 1);
            } else {
                dataMap.put(eachElement, (int) dataMap.get(eachElement) + 1);
            }
        }
        System.out.println("Required Map data: " + dataMap);
        Set<Map.Entry<Integer, Integer>> entrySetData = dataMap.entrySet();
        for (Map.Entry<Integer, Integer> eachEntry : entrySetData) {
            if (eachEntry.getValue() > 1) {
                System.out.println("Duplicate Elements is: " + eachEntry.getKey());
            }
        }
    }

    //WAP to count and print the duplicates elements present in the given way
    //input [5, 1, 6, 3, 1, 7, 3, 6, 6, 2]
    //OutPut = Element name: 5 Element Count: 1
    //         Element name: 1 Element Count: 2
    //         Element name: 6 Element Count: 3
    //         Element name: 3 Element Count: 2
    //         Element name: 7 Element Count: 1
    //         Element name: 2 Element Count: 1
    public static void printDuplicatesUsingCollection(int[] array) {
        Set uniqueData = new HashSet();
        for (int i = 0; i < array.length; i++) {
            if (!uniqueData.contains(array[i])) {
                uniqueData.add(array[i]);
                int count = 1;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                    }
                }
                System.out.println("Element name: " + array[i] + " Element Count: " + count);
            }
        }
    }


    //WAP to count and print the duplicates elements present in the given way
    //input {a,b,c,a,a,c,e,e,d,h,e}
    //output {a3b1c2e3d1h1}
    public static void printDuplicatesUsingCollectionWithRequiredFormat(char[] array) {
        Set uniqueData = new HashSet();
        List requiredFormat = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            if (!uniqueData.contains(array[i])) {
                uniqueData.add(array[i]);
                int count = 1;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                    }
                }
                requiredFormat.add(array[i] + "" + count);
            }
        }
        System.out.println(requiredFormat);
    }

    //WAP to find out the first duplicate occurrence in an Array
    //Input: [1,4,5,4,5,2,1,0]
    //Output: 4(as 4 is the first element which get duplicated)
    public static int printFirstDuplicateOccurrenceInAnArray(int[] array) {
        Set nonDuplicates = new HashSet();
        int firstDuplicateElementInTheGivenArray = Integer.MIN_VALUE;
        for (int i = array.length - 1; i >= 0; i--) {
            if (nonDuplicates.contains(array[i])) {
                firstDuplicateElementInTheGivenArray = array[i];
            } else
                nonDuplicates.add(array[i]);
        }
        //code to throw and handle exception if the given array has not contain any duplicates
        try {
            if (firstDuplicateElementInTheGivenArray == Integer.MIN_VALUE)
                throw new Exception();
        } catch (Exception e) {
            System.out.println("Not even a single element of the given array has duplicates.");
            e.printStackTrace();
        }
        return firstDuplicateElementInTheGivenArray;
    }

    //WAP to find the non duplicate elements in the given array
    //Input: [13, 41, 51, 41, 5, 2, 1, 0, 0]
    /*  OutPut: Duplicate Elements are: [0, 41]
                Non duplicate elements are: [13, 51, 5, 2, 1]*/
    public static void getNonDuplicatesFromAnArray(int[] array, String way) {
        switch (way) {
            case "firstWay":
                Map elementWthCount = new HashMap<Integer, Integer>();
                Set duplicatesList = new HashSet(), nonDuplicatesList = new HashSet();
                for (int i = 0; i < array.length; i++) {
                    if (!elementWthCount.keySet().contains(array[i])) {
                        elementWthCount.put(array[i], 1);
                    } else
                        elementWthCount.put(array[i], (int) elementWthCount.get(array[i]) + 1);
                }
                Set<Map.Entry<Integer, Integer>> entries = elementWthCount.entrySet();
                for (Map.Entry<Integer, Integer> eachEntry : entries) {
                    if (eachEntry.getValue() == 1) {
                        nonDuplicatesList.add(eachEntry.getKey());
                    } else
                        duplicatesList.add(eachEntry.getKey());
                }
                System.out.println("Duplicate Elements are: " + duplicatesList);
                System.out.println("Non Duplicate Elements are: " + nonDuplicatesList);
                break;
            case "secondWay":
                Set data = new HashSet<Integer>();
                Set duplicates = new HashSet();
                List nonDuplicates = new ArrayList();
                for (int i = 0; i < array.length; i++) {
                    if (data.add(array[i]) == false) {
                        duplicates.add(array[i]);
                    }
                }
                System.out.println("Duplicate Elements are: " + duplicates);
                for (int eachElement : array) {
                    if (!duplicates.contains(eachElement))
                        nonDuplicates.add(eachElement);
                }
                System.out.println("Non duplicate elements are: " + nonDuplicates);
                break;
        }

    }
}
