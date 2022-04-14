package programmingPractise.recursion;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
//        printName5Times(1);
//        System.out.println("----------------------------------------");
//
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter number of times: ");
//        int numberOfTimes = scn.nextInt();
//        printLinearlyFrom1ToN(1, numberOfTimes);
//
//        System.out.println("----------------------------------------");
//        scn = new Scanner(System.in);
//        System.out.println("Enter number of times: ");
//        numberOfTimes = scn.nextInt();
//        printLinearlyFromNTo1(numberOfTimes, 1);

        System.out.println("----------------------------------------");
        printLinearlyFrom1ToNWithBackTracking(3, 3);

        System.out.println("----------------------------------------");
        printLinearlyFromNTo1WithBackTracking(1, 10);
    }

    //print names five times
    public static void printName5Times(int count) {
        if (count == 6)
            return;
        System.out.println(count + ". Ashish");
        count++;
        printName5Times(count);
    }

    //print linearly from 1 to n
    public static void printLinearlyFrom1ToN(int startsFrom, int endsWith) {
        if (startsFrom > endsWith)
            return;
        System.out.println(startsFrom);
        startsFrom++;
        printLinearlyFrom1ToN(startsFrom, endsWith);
    }

    //print linearly from n to 1
    public static void printLinearlyFromNTo1(int startsWith, int endsWith) {
        if (startsWith < endsWith)
            return;
        System.out.println(startsWith);
        startsWith--;
        printLinearlyFromNTo1(startsWith, endsWith);
    }

    //print linearly from 1 to n with back tracking
    public static void printLinearlyFrom1ToNWithBackTracking(int startsWith, int endsWith) {
        if (startsWith < 1)
            return;
        printLinearlyFrom1ToNWithBackTracking(startsWith - 1, endsWith);
        System.out.println(startsWith);
    }

    //print linearly from n to 1 with back tracking
    public static void printLinearlyFromNTo1WithBackTracking(int i, int n) {
        if (i > n)
            return;
        printLinearlyFromNTo1WithBackTracking(i + 1, n);
        System.out.println(i);
    }
}
