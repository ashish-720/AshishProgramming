package programmingPractise.recursion;

import java.util.ArrayList;
import java.util.List;

public class Program5 {
    //multiple recursive call from a function
    public static void main(String[] args) {
        //getSubsequences(0, new ArrayList(), new int[]{3, 1, 2}, 4);
        getMatchingSubSequenceSum(0, new ArrayList(), new int[]{3, 1, 2}, 3, 0, 3);
    }

    public static void getSubsequences(int i, List subsequence, int[] arr, int n) {
        if (i >= n) {
            System.out.println(subsequence);
            return;
        }
        //take or pick condition
        subsequence.add(arr[i]);
        getSubsequences(i + 1, subsequence, arr, n);

        //not take or pick condition
        subsequence.remove(subsequence.indexOf(arr[i]));
        getSubsequences(i + 1, subsequence, arr, n);
    }

    public static void getMatchingSubSequenceSum(int i, List subsequence, int[] arr, int n, int sum, int requiredSumValue) {
        if (i >= n) {
            for (Object eachElement : subsequence) {
                sum += (int) eachElement;
            }
            if (sum == requiredSumValue)
                System.out.println(subsequence);
            return;
        }
        //take or pick condition
        subsequence.add(arr[i]);
        getMatchingSubSequenceSum(i + 1, subsequence, arr, n, sum, requiredSumValue);

        //not take or pick condition
        subsequence.remove(subsequence.indexOf(arr[i]));
        getMatchingSubSequenceSum(i + 1, subsequence, arr, n, sum, requiredSumValue);
    }
}
