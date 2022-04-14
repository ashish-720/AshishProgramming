package learning.constructorInJava;

public class Constructor3 {
    //parameterized constructor
    // To initialize the non static variables we go for it
    // If we want to create the obj with different values ie to overcome the
    // limitation of zero parameterised constr we go for it.
    int id;
    int DOJ;
    String name;
    String companyname;
    public Constructor3(int a, int b, String c){
        id = a;
        DOJ = b;
        name = c;
        companyname = "Microfocus";
    }
    public static void main(String[] args) {
        Constructor3 c1 = new Constructor3(12, 12, "Ashish");
        System.out.println(c1.DOJ);
        System.out.println(c1.id);
        System.out.println(c1.name);
        System.out.println(c1.companyname);
        System.out.println("-----------------");
        Constructor3 c2 = new Constructor3(14, 15, "alok");
        System.out.println(c2.DOJ);
        System.out.println(c2.id);
        System.out.println(c2.name);
        System.out.println(c2.companyname);
    }
}
