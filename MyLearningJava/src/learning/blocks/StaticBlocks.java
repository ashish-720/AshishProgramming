package learning.blocks;

public class StaticBlocks {
    // Static block will execute before main() or during class gets loaded into the memory by classLoader. It will execute only once during
    // classLoading as main() is only one for a class.
    // it will execute before constructor so if we need to run the same code before
    // every object we go with static block
    //it is used to initialize static members
    //we could able to run the static block without main method till java 1.6 but Java 7 and newer versions don’t allow this because JVM checks the presence of the main method before initializing the class.
    /*Error: Main method not found in class learning.blocks.StaticBlocks, please define the main method as:
        public static void main(String[] args)
        or a JavaFX application class must extend javafx.application.Application*/
    static String name;
    static int age;

    static {
        System.out.println("In static block 1");
        name = "Ashish Samal";
        age = 12;
    }

    public static void main(String[] args) {
        System.out.println("In main method");
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }

    static {
        System.out.println("In static block 2");
        name = "Alok Samal";
        age = 10;
    }
}
