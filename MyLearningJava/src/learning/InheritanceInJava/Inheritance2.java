package learning.InheritanceInJava;

class FirstGenMobile {
    String mobileBrand;
    static int price;

    public void call() {
        System.out.println("User can call");
    }

    public void message() {
        System.out.println("User can message");
    }

    public FirstGenMobile() {
        mobileBrand = "Nokia";
    }
}

class SecondGenMobile extends FirstGenMobile {
    public void camera() {
        System.out.println("user can use camera");
    }

    public static void internet() {
        System.out.println("Internet is available");
    }
}

class ThirdGenMobile extends SecondGenMobile {
    public void touchScreen() {
        System.out.println("User is using touchScreen");
    }
}

public class Inheritance2 {
    //Multilevel Inheritance
    public static void main(String[] args) {
        ThirdGenMobile thirdGen = new ThirdGenMobile();
        thirdGen.call();
        thirdGen.message();
        thirdGen.camera();
        thirdGen.internet();
        System.out.println(thirdGen.mobileBrand);
        System.out.println(thirdGen.price);
        thirdGen.price = 12;
        System.out.println(thirdGen.price);
        thirdGen.touchScreen();
        FirstGenMobile firstGen = new FirstGenMobile();
        // with this object ref variable (firstGen)only FirstGenMobile attributes and behaviours
        // will come ie FirstGenMobile variables and methods
    }
}
