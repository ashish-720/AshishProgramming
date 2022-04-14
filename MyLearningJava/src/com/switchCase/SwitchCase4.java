package com.switchCase;

public class SwitchCase4 {
    //if default is there as first statement and the after wards case is not matched then all the statements gets executed as break is not there. But if case is matched after the
    //default statement then the case will get executed and after that all cases got executed if there is no break
    public static void main(String[] args) {
        int marks =11;
        switch (marks){
            default:
                System.out.println("No matched");
            case 2:
                System.out.println("Number is 2");
            case 10:
                System.out.println("Number is 10");
        }
    }
}
