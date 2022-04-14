package programmingPractise.recursion;

import java.util.Arrays;

public class practise {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 2, 2, 1, 3};
        System.out.println(palindromeWithOutReversingAnArray(0, arr));
        System.out.println("--------------");
        System.out.println(factorialOfANumber(4));
    }

    public static void printNamesFiveTimes(int i) {
        if (i <= 5) {
            System.out.println("Ashish");
            printNamesFiveTimes(i + 1);
        }
    }

    public static void printNames5Times(int i) {
        if (i == 6)
            return;
        System.out.println("Alok");
        printNames5Times(i + 1);
    }

    public static void print1ToNFirstWay(int i, int n) {
        if (i > n)
            return;
        System.out.println(i);
        print1ToNFirstWay(i + 1, n);
    }

    public static void print1ToNFirstWayUsingBackTracking(int n) {
        if (n <= 0)
            return;
        print1ToNFirstWayUsingBackTracking(n - 1);
        System.out.println(n);
    }

    public static void printNTo1usingBackTracking(int i, int n) {
        if (i > n)
            return;
        printNTo1usingBackTracking(i + 1, n);
        System.out.println(i);
    }

    public static void sumOfNNumbers(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        sumOfNNumbers(n - 1, sum + n);
    }

    public static void reverseAnArrayUsingRecursionWithTwoVariable(int i, int j, int[] arr) {
        if (i > j) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverseAnArrayUsingRecursionWithTwoVariable(i + 1, j - 1, arr);
    }

    public static void reverseAnArrayUsingRecursionWithOneVariable(int i, int[] arr) {
        if (i == arr.length / 2) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
        reverseAnArrayUsingRecursionWithOneVariable(i + 1, arr);
    }

    public static boolean palindromeWithOutReversingAnArray(int i, int[] arr) {
        if (i == arr.length / 2) return true;
        if (arr[i] != arr[arr.length - 1 - i])
            return false;
        return palindromeWithOutReversingAnArray(i + 1, arr);
    }

    public static int factorialOfANumber(int n) {
        if (n == 1)
            return 1;
        return n * factorialOfANumber(n - 1);
    }
}
