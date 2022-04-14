package learning.constructorInJava;

public class Constructor4_2 {
    //  Why this keyword usage
    // If local variable name is same as global instance variable we use this to
    // differentiate it.

    String employeeName;
    int yob;
    String companyName;

    public Constructor4_2(String employeeName, int yob, String companyName) {
        // here the name of local variable and global variable are same so precedence are
        // given to local variable
        // if u pass id and store it in id the compiler will take id as local and its
        // scope inside the method.
        // and if u r trying to print global variable it will give the default value.
        // to differentiate between local and global we use this keyword

        employeeName = employeeName; //By hovering over the variable You can see its only highlighting the local variable not global.
        yob = yob;
        companyName = companyName;
    }

    public static void main(String[] args) {
        Constructor4_2 c = new Constructor4_2("Ashish", 1993, "Google");
        System.out.println(c.employeeName); //These are all global variables You can check by hovering over it.
        System.out.println(c.yob);
        System.out.println(c.companyName);
    }
}
