package com.StringsInJava.StringsConceptTheory;

public class StringsInJava7 {
    public static void main(String[] args) {
        String s1 = new String("Dassault");
        String sg = s1.concat("Systemes");
        String s2 = "DassaultSystemes";
        System.out.println(s2==sg);
        System.out.println(s1);
        System.out.println(sg);
        String s3 = sg.intern();
        System.out.println(s3==s2);
    }
}
