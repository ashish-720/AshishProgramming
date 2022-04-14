package programmingPractise.leetCodeProgrammig.Arrays.Easy;

import java.util.Arrays;

/*
* Q5. Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:
Input: nums = [0]
Output: [0]

* */
public class Program5 {
    public static void main(String[] args) {
        firstApproach(0);
    }

    public static void firstApproach(int val) {
        int[] arr = new int[]{3, 0, 0, 2, 2, 0, 3, 4, 3, 4, 2, 3};
        int count = 0;
        for (int num : arr) {
            if (num == val)
                count++;
        }

        for (int i = 1; i <= count; i++) {
            int temp = 0;
            for (int j = 0; j <= arr.length - 1 - i; j++) {
                if (arr[j] == val) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
