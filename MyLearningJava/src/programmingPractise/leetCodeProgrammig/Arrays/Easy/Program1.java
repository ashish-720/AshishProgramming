package programmingPractise.leetCodeProgrammig.Arrays.Easy;

import java.util.Arrays;

/*Q1. Given an array of integers nums and an integer target, return indices of the first two numbers such that they add up to target.
 You may assume that each input would have exactly one solution, and you may not use the same element twice.
 You can return the answer in any order.
  
 Example 1:
 Input: nums = [2,7,11,15], target = 9
 Output: [0,1]
 Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 Example 2:
 Input: nums = [3,2,4], target = 6
 Output: [1,2]
 Example 3:
 Input: nums = [3,3], target = 6
 Output: [0,1]
*/
public class Program1 {

    public static void main(String[] args) {
        int[] given = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(indicesOfNumbersWhoseSumToTarget(given, target)));
    }

    public static int[] indicesOfNumbersWhoseSumToTarget(int[] given, int target) {
        int[] indicesPair = new int[2];
        for (int i = 0; i < given.length - 1; i++) {
            for (int j = i + 1; j < given.length; j++) {
                if ((given[i] + given[j]) == target) {
                    indicesPair[0] = i;
                    indicesPair[1] = j;
                    break;
                }
            }
        }
        return indicesPair;
    }
}
