package learning.constructorInJava;

class Engineer {
    String workfield;
    String educationDegree;
    String college;

    public Engineer() {
        System.out.println("In the Engineer Non-parameterized Constructor");
        workfield = "QA";
    }

    public Engineer(String workfield, String educationDegree, String college) {
        System.out.println("In the Engineer parameterized Constructor");
        this.workfield = "Quality Assurance";
        this.educationDegree = "BTECH";
        this.college = "IIT";
    }

}

class Employee extends Engineer {
    String employeeName;
    int yearOfExp;
    int salary;
    String companyName = "MicroFocus";

    public Employee() {
        System.out.println("In the Employee Non-parameterized Constructor");
        employeeName = "Ashish";
        yearOfExp = 10;
        salary = 20;
        companyName = "Oracle";
    }

    public Employee(String employeeName, int yearOfExp, int salary) {
        super(employeeName, employeeName, employeeName); //this will call the parameterized constructor of parent class
        System.out.println("In the Employee parameterized Constructor");
        this.employeeName = employeeName;
        this.yearOfExp = yearOfExp;
        this.salary = salary;
    }
}

public class Constructor6_1 {

    public static void main(String[] args) {
        // here we have created an object of Employee with no parameters so it called
        // Employee()constructor and by default there is a super() in the constructor
        // which will call the default constructor of parent class i.e Engineer(). As
        // super is having no arguments so it called non default non parameterized constructor

        Employee emp = new Employee();
        System.out.println(emp.college);
        System.out.println(emp.educationDegree);
        System.out.println(emp.workfield);
        System.out.println(emp.employeeName);
        System.out.println(emp.yearOfExp);
        System.out.println(emp.salary);
        System.out.println(emp.companyName);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Employee emp2 = new Employee("Alok", 12, 30);
        System.out.println(emp2.college);
        System.out.println(emp2.educationDegree);
        System.out.println(emp2.workfield);
        System.out.println(emp2.employeeName);
        System.out.println(emp2.yearOfExp);
        System.out.println(emp2.salary);
        System.out.println(emp2.companyName);
    }

}

