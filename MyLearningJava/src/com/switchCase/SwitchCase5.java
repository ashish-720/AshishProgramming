package com.switchCase;

public class SwitchCase5 {
    //check will only happen if no case is matching till default, then default is executed, But if a case is matched before default then that case is executed and all the cases after that in
    //including default it the last line if break is not there is any case.
    public static void main(String[] args) {
        int marks = 10;
        switch (marks){
            case 1:
                System.out.println("Number is 1");
            case 2:
                System.out.println("Number is 2");
            case 3:
                System.out.println("Number is 3");
            case 4:
                System.out.println("Number is 4");
            default:
                System.out.println("default executed");
            case 5:
                System.out.println("Number is 5");
        }
    }
}
