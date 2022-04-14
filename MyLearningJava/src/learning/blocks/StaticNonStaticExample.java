package learning.blocks;

public class StaticNonStaticExample {
    // here example contains static, non static block and constructor
    int i = 10;
    static int j = 20;

    public StaticNonStaticExample() {
        System.out.println(i);
        i = 90;
        System.out.println(i);
    }

    public void m1(){
        System.out.println("In non static method m1");
    }

    {
        System.out.println(i);
        System.out.println("In nonstatic block 2");
        i = 25;
        System.out.println(j);// possible since one copy
        m1();
    }

    static {
        System.out.println("In static block 2");
        j = 30;
        // System.out.println(i); not possible
    }

    public static void main(String[] args) {
        System.out.println("In main");
        StaticNonStaticExample s = new StaticNonStaticExample();
        System.out.println(s.i);
        // StaticNonStaticExampl s1 = new StaticNonStaticExampl();
        // System.out.println(s1.i);
    }

    {
        System.out.println("In the nonstatic block 1");
        System.out.println(i);
        m1();
    }

    static {
        System.out.println("In static block 1");
        System.out.println(j);
//        m1(); compilation error
    }

    {
        m1();
        System.out.println("Hello");
        System.out.println(i);
    }
}
