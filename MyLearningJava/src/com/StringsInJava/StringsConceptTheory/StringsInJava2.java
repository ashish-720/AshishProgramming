package com.StringsInJava.StringsConceptTheory;

public class StringsInJava2 {
    public static void main(String[] args) {

        String s1 = new String("ashish");
        String s2 = new String("ashish");
        System.out.println(s1 == s2);  //here we are comparing two different object as we used ==
        System.out.println(s1.equals(s2));  //In String class the parent(Object) class equals method is overridden to do content comparison

        //But in object class equals methods is comparing the address. it use == inside it.
        Object ob1 = new Object();
        Object ob2 = new Object();
        System.out.println(ob1.equals(ob2));


        StringBuffer s3 = new StringBuffer("ashish");
        StringBuffer s4 = new StringBuffer("ashish");
        System.out.println(s3 == s4); //here we are comparing two different object as we used ==
        System.out.println(s3.equals(s4)); //here the equals method of Object class is not overridden to perform content comparison


        //Now it is object comparison check notes how it is(string pool area concept)
        String s5 = "ashish";
        String s6 = "ashish";
        System.out.println(s5 == s6);
    }
}
