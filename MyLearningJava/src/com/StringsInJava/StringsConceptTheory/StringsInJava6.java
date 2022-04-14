package com.StringsInJava.StringsConceptTheory;

public class StringsInJava6 {
    public static void main(String[] args) {
        //intern() of String
        //Creating an Object in heap is costly as for every new operator new object will get created So scp concept came into picture where duplicates are not allowed
        String s1 = new String("Alok checking intern"); //s1 is pointing to heap object
        String s2 = s1.intern();// here it will return the SCP object which got created in above step and s2 points to that
        String s3 = "Alok checking intern"; //Here it will point the same SCP above object
        System.out.println(s1 == s2);//false
        System.out.println(s2 == s3);//true
        System.out.println(s1 == s3);//false
    }
}
