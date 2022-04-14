package programmingPractise.leetCodeProgrammig.Arrays.Easy;

import java.util.Arrays;

/*
* Q4. Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
Return k after placing the final result in the first k slots of nums.

Example 1:
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).

* */
public class Program4 {
    public static void main(String[] args) {
        System.out.println(firstApproach());
    }

    //used three for loops which is really time consuming for the above question, But this approach is good if you want to keep the number which is val at the last.
    //output: val=2, [3, 3, 4, 3, 4, 3, 2, 2, 2]
    public static int firstApproach() {
        int[] arr = new int[]{3, 2, 2, 3, 4, 3, 4, 2, 3};
        int val = 2;
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
        return arr.length - count;
    }


    public static int optimalApproach() {
        int[] arr = new int[]{3, 2, 2, 3, 4, 3, 4, 2, 3};
        int val = 2;
        int indexCounter = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == val) {
                continue;
            } else {
                arr[indexCounter] = arr[j];
                indexCounter++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return indexCounter;
    }
}
