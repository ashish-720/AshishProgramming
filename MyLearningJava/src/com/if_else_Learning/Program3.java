package com.if_else_Learning;

import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length value");
        int len = scn.nextInt();
        System.out.println("Enter the width value");
        int width = scn.nextInt();
        System.out.println(isSquare(len, width));
    }

    public static boolean isSquare(int length, int breadth) {
        if (length == breadth) {
            return true;
        } else
            return false;
    }
}
