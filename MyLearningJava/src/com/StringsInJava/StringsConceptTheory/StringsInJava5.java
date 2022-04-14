package com.StringsInJava.StringsConceptTheory;

public class StringsInJava5 {
    public static void main(String[] args) {
        String s1 = new String("Alok");
        String s2 = new String("Alok");
        String s3 = "Alok";
        String s4 = "Alok";
        //How many objects got created in heap and SCP
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        //----------------------------------------------------------------------------------------

        String s5 = new String("Alok Home");
        s5.concat("Bhubaneswar");
        String s6 = s5.concat("Jammu");
        s5 = s5 + "Bangalore"; //this will get created during run time as s5 is a variable so it will placed in heap area
        //How many objects got created in heap and SCP
        System.out.println(s5);
        System.out.println(s6);

        //------------------------------------------------------------------------------------------

        String s7 = new String("Spring");
        s7.concat("Summer");
        String s8 = s7.concat("Winter");
        s7 = s7.concat("fall");
        //How many objects got created in heap and SCP
        System.out.println(s7);
        System.out.println(s8);
    }
}
