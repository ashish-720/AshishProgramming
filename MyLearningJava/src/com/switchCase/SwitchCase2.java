package com.switchCase;

public class SwitchCase2 {
    //it will go direct to case 10 and break is not present then default is executed
    public static void main(String[] args) {
        int marks = 10;
        switch (marks){
            case 2:
                System.out.println("Number is 2");
            case 3:
                System.out.println("Number is 3");
            case 5:
                System.out.println("Number is 5");
            case 10:
                System.out.println("Number is 10");
            default:
                System.out.println("Number not matched");
        }
    }
}
