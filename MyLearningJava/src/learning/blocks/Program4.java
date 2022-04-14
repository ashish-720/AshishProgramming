package learning.blocks;

public class Program4 {
    int i, j;

    public static void main(String[] args) {
        Program4 d1=new Program4();
        System.out.println(d1.i);
        System.out.println(d1.j);

        Program4 d2=new Program4();
        System.out.println(d2.i);
        System.out.println(d2.j);

        System.out.println(new Program4());//executes instanceinitializiationblock
        //and prints address
        System.out.println(new Program4().i);
        System.out.println(new Program4().j);
        d2.i=123;
        d2.j=456;

        System.out.println(d1.i);

        System.out.println(d1.j);
        System.out.println(d2.i);
        System.out.println(d2.j);
    }

    {
        System.out.println("IITB1");
        i=20;
        j=30;
    }
    {
        System.out.println("IITB2");
        i=200;
        j=300;
    }
    static{
        System.out.println("hello all");
    }
}
