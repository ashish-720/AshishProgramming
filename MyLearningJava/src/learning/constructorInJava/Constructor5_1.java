package learning.constructorInJava;

public class Constructor5_1 {

    String employeeName;
    int yob;
    String companyName;

    public Constructor5_1(String employeeName, int yob, String companyName) {
        this.employeeName = employeeName;
        this.yob = yob;
        this.companyName = companyName;
    }
    //we can have method name same as constructor name it will not show any error
    public void Constructor5_1(String employeeName, int yob, String companyName) {
        System.out.println("In Constructor5_1 Method");
        System.out.println("EmployeeName: "+employeeName+"  EmployeeYOB: "+yob+"   CompanyName: "+companyName);
    }

    public static void main(String[] args) {
        Constructor5_1 c = new Constructor5_1("Ashish", 1993, "Google");
        System.out.println(c.employeeName); //These are all global variables You can check by hovering over it.
        System.out.println(c.yob);
        System.out.println(c.companyName);
        c.Constructor5_1("Alok",1996, "Microsoft");
    }

}
