package learning.constructorInJava;

class Engineer_1 {
    String educationDegree;
    int yearOfPassOut;
    String college;

    public Engineer_1() {
        System.out.println("In zero Parameterized or Non-Parameterized Engineer_1 Constructor");
        educationDegree = "BTech";
    }

    public Engineer_1(String educationDegree, int yearOfPassOut, String college) {
        System.out.println("In parameterized Engineer_1 Constructor");
        this.educationDegree = educationDegree;
        this.yearOfPassOut = yearOfPassOut;
        this.college = college;
    }
}


class Employee_1 extends Engineer_1 {
    String companyName;
    String salary;
    int yearOfExperience;

    public Employee_1() {
        System.out.println("In zero Parameterized or Non-Parameterized Employee_1 Constructor");
        companyName = "Micro Focus";
    }

    public Employee_1(String companyName, String salary, int yearOfExperience) {
        System.out.println("In parameterized Employee_1 Constructor");
        this.companyName = companyName;
        this.salary = salary;
        this.yearOfExperience = yearOfExperience;
    }

}

public class Constructor6 {
    public static void main(String[] args) {
        // here we have created an object of Employee_1 with no parameters so it called
        // Employee_1()constructor and by default there is a super() in the constructor
        // which will call the default constructor of parent class ie Engineer_1(). As default
        // super() is having no arguments so it called the defined non Parameterized constructor of Engineer_1

        Employee_1 emp1 = new Employee_1();
        System.out.println(emp1.companyName);
        System.out.println(emp1.salary);
        System.out.println(emp1.yearOfExperience);
        System.out.println(emp1.educationDegree);
        System.out.println(emp1.yearOfPassOut);
        System.out.println(emp1.college);
        System.out.println("-----------------------------------------------------------------------------------");


        // here we have created an object of Employee_1 with parameters so it called
        // Employee_1(String companyName, String salary, int yearOfExperience)constructor and by default there is a super() in the constructor
        // which will call the default constructor of parent class ie Engineer_1(). As
        // super is having no aguments so it called non parameterized constructor

        Employee_1 emp1Parameterized = new Employee_1("Google", "2000000", 5);
        System.out.println(emp1Parameterized.companyName);
        System.out.println(emp1Parameterized.salary);
        System.out.println(emp1Parameterized.yearOfExperience);
        System.out.println(emp1Parameterized.educationDegree);
        System.out.println(emp1Parameterized.yearOfPassOut);
        System.out.println(emp1Parameterized.college);

    }

}


