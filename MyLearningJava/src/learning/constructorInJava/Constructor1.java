package learning.constructorInJava;

public class Constructor1 {
    //usage of constructor
    //To initialize the non static variables we go for it
    //name of the constructor is same as that of class name
    int id;
    int dOJ;
    String name;
    String companyname;

    //since the arguments are not there. So it is called zero parameterized constructor.
    //issue with is if we create thousand objects. All will initialized with the same values. I.e we can't create distinct objects
    public Constructor1() {
        id = 12;
        dOJ = 23;
        name = "Ashish Samal";
        companyname = "Dassault";
    }

    public static void main(String[] args) {
        Constructor1 c1 = new Constructor1();
        //c1.name = "Ashish Samal";  we can initialize instance variable in this way also instead of constructor
        // but in that case the initialization is only applicable for that object. Not other objects
        System.out.println(c1.name);
        System.out.println(c1.id);
        System.out.println(c1.name);
        System.out.println(c1.companyname);
        System.out.println("-----------------");
        Constructor1 c2 = new Constructor1();
        System.out.println(c2.name);
        System.out.println(c2.id);
        System.out.println(c2.name);
        System.out.println(c2.companyname);
        System.out.println("-----------------");
        
    }
}
