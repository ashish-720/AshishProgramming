package com.switchCase;

public class SwitchCase10 {
    public static void main(String[] args) {
        String brand  = "Nokia";
        switch (brand){
            case "Motorola":
                System.out.println("Motorola");
                break;
            case "Nokia":
                System.out.println("Nokia");
                break;
            case "Samsung":
                System.out.println("Samsung");
                break;
            case "Apple":
                System.out.println("Apple");
                break;
            default:
                System.out.println("Not found");
        }
    }
}
