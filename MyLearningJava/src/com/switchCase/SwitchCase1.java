package com.switchCase;

public class SwitchCase1 {
    public static void main(String[] args) {
        int marks = 11;
        switch (marks){
            case 2:
                System.out.println("number is 2");
                break;
            case 3:
                System.out.println("number is 3");
                break;
            case 9:
                System.out.println("number is 9");
                break;
            case 10:
                System.out.println("number is 10");
                break;
            default:
                System.out.println("No number match");
                break;
        }
    }
}
