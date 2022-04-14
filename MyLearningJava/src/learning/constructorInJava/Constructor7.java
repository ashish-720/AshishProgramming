package learning.constructorInJava;


class Vehicle {

    int costOfVehicle;
    String color;
    String weight;

    public void run() {
        System.out.println("In Run Method");
    }

    public Vehicle() {
        System.out.println("In Non-parameterized Vehicle Constructor");
        costOfVehicle = 200;
        color = "Red";
        weight = "30Kg";
    }

    public Vehicle(int costOfVehicle, String color, String weight) {
        System.out.println("In parameterized Vehicle Constructor");
        this.costOfVehicle = costOfVehicle;
        this.color = color;
        this.weight = weight;
    }
}

class TwoWheeler {

}

class FourWheeler {

}

public class Constructor7 {
    public static void main(String[] args) {

    }
}
