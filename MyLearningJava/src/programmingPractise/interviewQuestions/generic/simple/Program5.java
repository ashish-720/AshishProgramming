package programmingPractise.interviewQuestions.generic.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program5 {
    //factorial of a number
    //5 = 5*4*3*2*1

    public static void main(String[] args) {
        //System.out.println(factorialUsingRecursion(5));
        //walked(50);
        reverseAList(new int[]{10, 20, 30, 40});
    }

    //factorial using while loop
    public static int factorialUsingWhileLoop(int number) {
        int fact = 1;
        while (number > 1) {
            fact = fact * number;
            number--;
        }
        return fact;
    }


    //factorial using do while loop
    public static int factorialUsingDoWhileLoop(int number) {
        int fact = 1;
        do {
            fact *= number;
            number--;
        } while (number > 1);

        return fact;
    }


    //Recursion process explanation
    public static int walked(int distanceInKm) {
        System.out.println("Remaining distance = " + distanceInKm);
        if (distanceInKm > 0)
            return walked(distanceInKm / 2);
        else
            return 0;
    }

    //factorial using recursion
    public static int factorialUsingRecursion(int number) {
        if (number == 1)
            return 1;
        return number * factorialUsingRecursion(number - 1);
    }

    //reverse a list
    public static void reverseAList(int[] arr) {
        if (arr.length == 0)
            return;
        int a[] = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            a[i] = arr[i + 1];
        }
        reverseAList(a);
        System.out.println(arr[0]);
    }
}
