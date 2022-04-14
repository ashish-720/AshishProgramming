package com.switchCase;

public class SwitchCase6 {
    //data type of switch and case should match other wise compilation error
    public static void main(String[] args) {
        int marks = 10;
        switch (marks) {
            case 2:
                System.out.println("Number is 2");
            case 10:
                System.out.println("Number is 10");
            case 8:
                System.out.println("Number is 8");
//            case "Nine":
//                System.out.println("Number is 9");
        }
    }
}
