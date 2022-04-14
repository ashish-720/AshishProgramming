package programmingPractise.leetCodeProgrammig.Arrays.Easy;

import java.util.Arrays;

/*
*
Q3. Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.
Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
Return k after placing the final result in the first k slots of nums.

Example 1:
Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:
Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3,_,_]
Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

* */

//First go through program 2
public class Program3 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 1, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(keepDuplicateValuesAtMostTwice(arr));
    }

    public static int keepDuplicateValuesAtMostTwice(int[] given) {
        int twiceCounter = 1;
        int indexCounter = 1;
        for (int i = 1; i < given.length; i++) {
            if (given[i] == given[i - 1]) {
                twiceCounter++;
                if (twiceCounter <= 2) {
                    given[indexCounter] = given[i];
                    indexCounter++;
                } else {
                    continue;
                }
            } else {
                given[indexCounter] = given[i];
                indexCounter++;
                twiceCounter = 1;
            }
        }
        System.out.println(Arrays.toString(given));
        return indexCounter;
    }
}
