package programmingPractise.recursion;

import java.util.Arrays;

public class Program3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 2, 1};
        reverseAnArrayUsingRecursionUsing1Variable(0, arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(palindrome(0, arr));
    }


    public static void reverseAnArrayUsingRecursion(int i, int j, int[] arr) {
        int temp = 0;
        if (i == arr.length / 2)
            return;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverseAnArrayUsingRecursion(i + 1, j - 1, arr);
    }

    public static void reverseAnArrayUsingRecursionUsing1Variable(int i, int[] arr) {
        int temp = 0;
        if (i == arr.length / 2)
            return;
        temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
        reverseAnArrayUsingRecursionUsing1Variable(i + 1, arr);
    }

    public static boolean palindrome(int i, int[] arr) {
        if (i == arr.length / 2) return true;
        if (arr[i] != arr[arr.length - 1 - i])
            return false;
        return palindrome(i + 1, arr);
    }
}
