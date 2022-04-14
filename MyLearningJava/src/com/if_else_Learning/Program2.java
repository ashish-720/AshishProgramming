package com.if_else_Learning;

public class Program2 {
    public static void main(String[] args) {
        double number = -10000000;
        if (number == 0) {
            System.out.println("number is ZERO");
        } else {
            if (number < 0) {
                System.out.println("number is negative");
            } else {
                System.out.println("number is positive");
            }
        }
        if (Math.abs(number) < 1) {
            System.out.println("Number is small");
        } else if (Math.abs(number) > 1000000)
            System.out.println("Number id large");
    }
}
