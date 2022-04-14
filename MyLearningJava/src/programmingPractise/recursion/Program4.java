package programmingPractise.recursion;

import java.util.Arrays;

public class Program4 {
    //multiple recursive call from a function
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(printTheFibonacciNumberAtNthPlace(3));
        System.out.println("----------------------------");
        printFibonacciSeries(arr);
    }

    //fibonacci series 0,1,1,2,3,5,8,13,21,34,---------------
    //idea f(n)=f(n-1)+f(n-2)
    public static int printTheFibonacciNumberAtNthPlace(int n) {
        if (n <= 1)
            return n;
        int last = printTheFibonacciNumberAtNthPlace(n - 1);
        int secLast = printTheFibonacciNumberAtNthPlace(n - 2);
        return last + secLast;
    }


    public static void printFibonacciSeries(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = printTheFibonacciNumberAtNthPlace(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
