package learning.collectionBasics.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListBasics1 {
    //Way of representing a collection of objects in which duplicates are allowed and insertion order preserved
    //Duplicates are allowed as we can differentiate it based on index
    //Methods of list interface
    //add(int index, Object o), addAll(int index, Collection c), Object remove(int index), Object get(int index), int indexOf(Object o), int lastIndexOf(Object o), Object set(int index, Object o) Note set is for replacement
    public static void main(String[] args) {
        List lst = new ArrayList<String>();
        for (int i = 1; i <= 10; i++) {
            lst.add("ashish" + i);
        }

        System.out.println(lst);
        lst.add(1, "alok");
        System.out.println(lst);

        lst.remove(1);
        System.out.println(lst);

        System.out.println(lst.get(1));
        System.out.println(lst.indexOf("ashish4"));
        lst.add("ashish4");
        System.out.println(lst.lastIndexOf("ashish4"));

        System.out.println(lst.set(1, "First"));
    }
}
