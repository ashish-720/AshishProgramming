package com.StringsInJava.ImpStringConstructors;

public class StringConstructors {
    public static void main(String[] args) {
        //Zero argument constructor
        String s1 = new String();//here an String obj of zero length will get created in the heap
        System.out.println(s1);

        //Constructor with argument as String literal
        String literal = "Ashish";
        String lit = new String(literal);//Here the object of String will get created with the literal content in scp and heap
        System.out.println(lit);

        //Constructor with StringBuffer as argument
        StringBuffer sb = new StringBuffer("Ashish"); // if i want the equivalent String object of it
        String eqStringObj = new String(sb);
        System.out.println(eqStringObj);

        //Constructor with StringBuilder as an argument
        StringBuilder sbl = new StringBuilder("Ashish");
        String eqSbl = new String(sbl);
        System.out.println(eqSbl);

        //Constructor with char array as an argument
        char[] ch = {'A', 'S', 'H', 'I', 'S', 'H'};
        String eqCHStr = new String(ch);
        System.out.println(eqCHStr);

        //Constructor with byte array args -128 to 127
        byte[] br = {97, 98, 99, 100};
        String eqBarray = new String(br);
        System.out.println(eqBarray);
    }
}
