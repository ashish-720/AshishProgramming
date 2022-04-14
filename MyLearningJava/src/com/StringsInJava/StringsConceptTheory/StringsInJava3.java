package com.StringsInJava.StringsConceptTheory;

public class StringsInJava3 {
    public static void main(String[] args) {
        //Is these two different from each other --- yes
        String s1 = new String("Ashish"); // In this case two objects got created one coz of new operator during runtime in heap area and the other in
        // SCP area(which is present in method area).No reference is pointing to the object of SCP area.But still it is not available for GC as GC is only for heap area
        //s1 is pointing to the heap area object
        String s2 = "Ashish";

        //Note In SCP area the object creation is optional b4 creating an object first it will check that whether the object with same content is present or not(so duplicate object not allowed)

        String s3 = "Ashish";
        String s4 = "Ashish";
        System.out.println(s3 == s4);//true coz here first "Ashish" object will get created in SCP area and s3 will point to it and then as already "Ashish" is present no furter obj creation s4 point to same obj
        System.out.println(s3.equals(s4));
    }
}
