package programmingPractise.recursion;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List allPermutations = new ArrayList();
        getPermutationsOfArray(new int[]{1, 2, 3}, 0, allPermutations);
        System.out.println(allPermutations);
    }

    public static void getPermutationsOfArray(int[] nums, int index, List allPermutations) {
        if (index == nums.length) {
            List eachPermutation = new ArrayList();
            for (int eachValue : nums) {
                eachPermutation.add(eachValue);
            }
            allPermutations.add(eachPermutation);
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            getPermutationsOfArray(nums, index + 1, allPermutations);
            swap(nums, index, i);
        }

    }

    public static void swap(int[] arr, int fromIndex, int toIndex) {
        int temp = arr[fromIndex];
        arr[toIndex] = arr[fromIndex];
        arr[toIndex] = temp;
    }
}
