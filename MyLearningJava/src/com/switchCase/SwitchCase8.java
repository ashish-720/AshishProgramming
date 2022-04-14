package com.switchCase;

public class SwitchCase8 {
    //Case can't be duplicated error duplicate label biovia
    public static void main(String[] args) {
        String company = "Biovia";
        switch (company){
            case "Inovia":
                System.out.println("Inovia");
                break;
            case "Biovia":
                System.out.println("Biovia");
                break;
//            case "Biovia":
//                System.out.println("Biovia");
//                break;
        }
    }
}
