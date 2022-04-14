package learning.constructorInJava;

public class Constructor4 {
    //ConstructorOverloading
    int id;
    String name;
    int salary;
    String companyName;

    public void work() {
        System.out.println("-------");
    }

    Constructor4() {

    }

    Constructor4(int a, String b) {
        id = a;
        name = b;
        companyName = "Microfocus";
    }
    //Either the datatype is different or number of data type should diferent or the position is different otherwise CTE duplicates
	/*ConstructorsOverloading(int id,String name){

	}*/

    // This way possible
    Constructor4(String a, int b) {
        name = a;
        id = b;
    }

    Constructor4(int a, String b, String c) {
        id = a;
        name = b;
        companyName = c;

    }
    public static void main(String[] args) {
        // new Constructors4(); if we have defined constructor in the class we have to
        // use the same constructor other wise CTE

        Constructor4 c1 = new Constructor4();
        System.out.println(c1.id);
        System.out.println(c1.name);
        System.out.println(c1.salary);
        System.out.println(c1.companyName);
        System.out.println("-----------------");
        Constructor4 c2 = new Constructor4(12, "Ashish");
        System.out.println(c2.id);
        System.out.println(c2.name);
        System.out.println(c2.salary);
        System.out.println(c2.companyName);
        System.out.println("-----------------");
        Constructor4 c3 = new Constructor4(13, "Alok", "Oracle");
        System.out.println(c3.id);
        System.out.println(c3.name);
        System.out.println(c3.companyName);
        Constructor4 c4 = new Constructor4("Alok",13);
        System.out.println(c4.id);
        System.out.println(c4.name);
        System.out.println(c4.companyName);
    }
}
