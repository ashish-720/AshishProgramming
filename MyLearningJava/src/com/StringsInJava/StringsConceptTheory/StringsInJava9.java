package com.StringsInJava.StringsConceptTheory;

public class StringsInJava9 {
    public static void main(String[] args) {
        String s1 = new String("You can do it");
        String s2 = new String("You can do it");
        System.out.println(s1 == s2); //false

        String s3 = "You can do it"; //literal point to the same obj in scp if present
        System.out.println(s3 == s1); //false

        String s4 = "You can do it"; //literal point to the same obj in scp if present
        System.out.println(s4 == s3); //true

        String s5 = "You can" + " do it";//here both are constant so concatenation will happen at compile time, so both will act as single literal together and will point to the obj of SCP area which is already there
        System.out.println(s4 == s5); //true

        String s6 = "You can"; //this will create at scp as it is literal
        String s7 = s6 + " do it"; // here one is constant and one is variable. So this object will form during runtime in heap area
        System.out.println(s4 == s7); // false

        final String s8 = "You can"; //"You can" will first form at scp
        String s9 = s8 + "do it";// As here the value is final so it is constant so during compile time only concatenation will happen
        System.out.println(s9 == s4); // true
    }
}
