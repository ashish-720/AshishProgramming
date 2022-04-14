package com.switchCase;

public class SwitchCase11 {
    public static void main(String[] args) {
        int marks = 9;
        switch (marks) {
            case 3:
            case 4:
            case 9:
                System.out.println("Number is 3 or 4 or 9");
                break;
            case 8:
            case 11:
            case 12:
                System.out.println("Number is 8 or 11 or 12");
            default:
                System.out.println("Number not found");
        }
    }
}
