package programmingPractise.interviewQuestions.arraysRelated;

import java.util.Arrays;
import java.util.HashMap;

public class Problem2 {
    //Given an array of M positive integers. Create a resultant array of same size by replacing each element of
// array A with the difference between size of array and the number of times
// the element appears in the array
//size of array 8
//given array [1, 2, 5, 2, 2, 5, 4, 4]
// output [7, 5, 6, 5, 5, 6, 6, 6]
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getResultantArray(new int[]{3, 5, 5, 2, 2, 5, 1, 2})));
    }

    public static int[] getResultantArray(int[] givenArray) {
        int lengthOfGivenArray = givenArray.length;
        int count = 0;
        int[] resultantArray = new int[givenArray.length];
        for (int i = 0; i < givenArray.length; i++) {
            for (int j = 0; j < givenArray.length; j++) {
                if (givenArray[i] == givenArray[j]) {
                    count++;
                }
            }
            resultantArray[i] = lengthOfGivenArray - count;
            count = 0;
        }
        return resultantArray;
    }
}
