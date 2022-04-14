package learning.InheritanceInJava;

class Animal1 {

    String wild;
    String domestic;

    public Animal1() {
        System.out.println("Animals lives are of two types");
    }

    public Animal1(String wild, String domestic) {
        this.wild = wild;
        this.domestic = domestic;
        System.out.println();
    }

    public void sleeps() {
        System.out.println("sleeps");
    }
}

class Cow1 extends Animal1 {
    public void veg() {
        System.out.println("Eat veg");
    }
}


public class Inheritance4 {
    // Constructors are special and have same name as class name. So if constructors were inherited in child class then child class would contain
    // a parent class constructor which is against the constraint that constructor should have same name as class name.

    //Now suppose if constructors can be inherited then it will be impossible to achieving encapsulation.
    // Because by using a super class’s constructor we can access/initialize private members of a class.

    //Refer: https://www.geeksforgeeks.org/constructors-not-inherited-java/
    public static void main(String[] args) {
        // Cow1 c=new Cow1("ash","alok");//We cannot inherit Constructor. coz we can't
        // create an instance of subclass by using the constructor of super class.

    }

}
