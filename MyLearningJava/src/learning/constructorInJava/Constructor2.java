package learning.constructorInJava;

public class Constructor2 {
    //default constructor
    //whenever u have not declared any constructor then jvm will put a default constructor which doesn't have anything
    int age;
    String name;

    public void m1() {
        System.out.println("In m1 method");
    }

    public static void main(String[] args) {
        Constructor2 c2 = new Constructor2();       // see Constructor2() is a method basically which is
        // getting called here so the method should have defined in the class, which is default constructor here
        System.out.println(c2.age);
        System.out.println(c2.name);
        c2.m1();
    }
}
