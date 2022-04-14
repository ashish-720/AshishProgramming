package com.StringsInJava.StringsConceptTheory;

public class StringsInJava1 {
    public static void main(String[] args) {
        //String class

        //once we create a string object we can't perform any changes in the existing object. If we are trying to perform any change with those changes a new
        //object will be created. This non changeable behaviour is nothing but immutability of string
        String s1 = new String("Dassault");
        System.out.println(s1);
        s1.concat("Systemes");//s1 is pointing to Dassault object and a new object is created in runtime in heap area with no reference which contains DassaultSystemes, since the new object doesn't have the refrence associated to it, therefore it is applicable for garbage collector
        System.out.println(s1);


        //StringBuffer class
        StringBuffer sb = new StringBuffer("Dassault");
        System.out.println(sb);
        sb.append("Systemes");// same object is getting changed therefore sb is mutable  //Covid-19 virus mutation example
        System.out.println(sb);
    }
}
