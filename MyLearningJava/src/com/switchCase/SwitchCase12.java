package com.switchCase;

public class SwitchCase12 {
    //Given two numbers, write a nested switch program to print values of these two numbers, Suppose numbers will be one of the possible values(1,2,3)
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 2;
        switch (number1){
            case 1:
                System.out.println("Number 1 is "+number1);
                switch (number2){
                    case 1:
                        System.out.println("Number 2 is "+number2);
                    case 2:
                        System.out.println("Number 2 is "+number2);
                    case 3:
                        System.out.println("Number 2 is "+number2);
                    default:
                        System.out.println("Case 1 executed");
                }
                break;
            case 2:
                System.out.println("Number 1 is "+number1);
                switch (number2){
                    case 1:
                        System.out.println("Number 2 is "+number2);
                    case 2:
                        System.out.println("Number 2 is "+number2);
                    case 3:
                        System.out.println("Number 2 is "+number2);

                    default:
                        System.out.println("Case 2 executed");
                }
                break;
            case 3:
                System.out.println("Number 1 is "+number1);
                switch (number2){
                    case 1:
                        System.out.println("Number 2 is "+number2);
                    case 2:
                        System.out.println("Number 2 is "+number2);
                    case 3:
                        System.out.println("Number 2 is "+number2);
                    default:
                        System.out.println("Case 3 executed");
                }
                break;
        }
    }
}
