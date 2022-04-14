package learning.constructorInJava;

public class Constructor5 {
    // this keyword is use to differentiate btw global and local variable

    int id;
    String name;
    String companyName;

    public void work() {
        System.out.println("-------");
    }

    // in the constructor parameter we can use different name but why we use the
    // name same as
    // global instance variable because to make it readable if we are using the same
    // name what we have given globally
    Constructor5(int id, String name) {
        this.id = id;// here id is the referring to global variable u can check by hovering on it
        this.name = name;
    }

    public static void main(String[] args) {
        Constructor5 c1 = new Constructor5(12, "Ashish");
        System.out.println(c1.id);
        System.out.println(c1.name);
    }
}
