package learning.InheritanceInJava;

class Calculator {
    private String yearOfMaking;
    String model;
    int price;

    public void add() {
        System.out.println("In add method");
    }

    public void subtract() {
        System.out.println("In subtract method");
    }

    //private member accessibility
//    public static void main(String[] args) {
//        new Calculator().yearOfMaking = "";
//    }
}

class ScientificCal extends Calculator {
    public void sin() {
        System.out.println("Performing sin operation");
    }

    public void cos() {
        System.out.println("Performing cos operation");
    }
}

public class Inheritance1 {
    //here class ScientificCal is aquiring all the properties of Calculator class
    //We can't inherit the private members . Coz its accessibility is inside the class where it is defined
    //Note in one file many class files can be present but while saving we should provide the file name as the class name which is having the main() and that class should be public other wise CTE.

    public static void main(String[] args) {
        //creating the object of sub class, It will automatically acquire the properties of the super class
        ScientificCal scientificCalc = new ScientificCal();
        scientificCalc.model = "CASIO";
        scientificCalc.price = 200;
        System.out.println(scientificCalc.model);
        System.out.println(scientificCalc.price);
        scientificCalc.add();
        scientificCalc.subtract();
        scientificCalc.sin();
        scientificCalc.cos();
        //scientificCalc.yearOfMaking

        Calculator cal = new Calculator();
        System.out.println(cal.model);
        System.out.println(cal.price);
        cal.add();
        cal.subtract();
        //cal.yearOfMaking
    }

}
