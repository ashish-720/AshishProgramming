package learning.blocks;

public class InstanceInitializationBlock {
    // As soon as we create new object it will first get executed. It will see the
    // new operator
    // it will execute before constructor
    String name;
    int age;

    public InstanceInitializationBlock() {
        System.out.println("In the zero parameterized constructor");
        name = "Alok";
    }
    {
        System.out.println("In instanceInitialization block 1");
        name = "ashish samal";
        age = 12;
        System.out.println(name);
    }

    public static void main(String[] args) {
        System.out.println("in main method");
        InstanceInitializationBlock inst = new InstanceInitializationBlock();
        System.out.println(inst.name);
        System.out.println(inst.age);
        //System.out.println(new InstanceInitializationBlock());
    }
}
