package com.StringsInJava.StringsConceptTheory;

public class StringsInJava8 {
    public static void main(String[] args) {
        String s1 = new String("Dassault");
        String sg = s1.concat("Systemes");
        String s3 = sg.intern();
        System.out.println(s3==sg);
    }
}
