package com.switchCase;

public class SwitchCase3 {
    //if break is not there after the statement which is matched the all the statement after that will executed no matter is the case matches or not
    public static void main(String[] args) {
        int marks = 10;
        switch (marks){
            case 2:
                System.out.println("Number is 2");
            case 3:
                System.out.println("Number is 3");
            case 10:
                System.out.println("Number is 10");
            case 5:
                System.out.println("Number is 5");
            default:
                System.out.println("Number not matched");
        }
    }
}
