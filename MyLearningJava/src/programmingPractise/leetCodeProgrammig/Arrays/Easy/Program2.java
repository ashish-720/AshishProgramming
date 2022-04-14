package programmingPractise.leetCodeProgrammig.Arrays.Easy;

import java.util.Arrays;

/*Q2. Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
Return k after placing the final result in the first k slots of nums.

Example 1:
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
*/
public class Program2 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(solutionWithManipulationToSameArray(arr));
    }

    //Not the optimal solution(as we are taking an extra array which will consume memory)
    public static int solutionByTakingAnExtraArray(int[] givenArray) {
        int[] requiredArray = new int[givenArray.length]; //This line not required check optimal method
        int indexCounter = 1;
        requiredArray[0] = givenArray[0]; //This line not required check optimal method
        for (int i = 1; i < givenArray.length; i++) {
            if (givenArray[i] == givenArray[i - 1]) {
                continue;
            } else {
                requiredArray[indexCounter] = givenArray[i];
                indexCounter++;
            }
        }
        System.out.println(Arrays.toString(requiredArray));
        return indexCounter;
    }

    //Optimal solution
    public static int solutionWithManipulationToSameArray(int[] givenArray) {
        int indexCounter = 1;
        for (int i = 1; i < givenArray.length; i++) {
            if (givenArray[i] == givenArray[i - 1]) {
                continue;
            } else {
                givenArray[indexCounter] = givenArray[i];
                indexCounter++;
            }
        }
        System.out.println(Arrays.toString(givenArray));
        return indexCounter;
    }
}
