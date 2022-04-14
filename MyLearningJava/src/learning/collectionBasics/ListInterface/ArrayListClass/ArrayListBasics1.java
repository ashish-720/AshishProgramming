package learning.collectionBasics.ListInterface.ArrayListClass;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListBasics1 {
    //Based on resizeable Array Data structure. Accept duplicates, insertion order preserved, null insertion allowed, heterogeneous objects allowed.
    //Implements serializable and cloneable interface (for sending and receiving collection across network)
    //Insertion operation will take more time if we are inserting the element on the middle as every successor element has to shift one step forward.
    //Default provided capacity of arrayList is 10 and after that if we add element then formula is (initialCapacity*3/2)+1
    //Implements Random Access interface (marker 1) due to which accessing any element(retrival) will be easy.


    //Difference between ArrayList and vector
    //1.Most of the methods in ArrayList is non synchronous so multiple threads can operate at same time so no thread safety and even it is no legacy class.
    //2.Vector is reverse of the above

    public static void main(String[] args) {
        //Mostly used if we dont know the size in advance
        ArrayList aryList = new ArrayList();
        System.out.println(aryList.size());
        //If we know the size in advance and it is huge so better use below constructor to avoid time taken for recreating the objects (Default provided capacity of arrayList is 10 and after that if we add element then formula is (initialCapacity*3/2)+1)
        new ArrayList(100);
        LinkedList lst = new LinkedList();
        //replacing an given collection with another then we go for this below constructor
        ArrayList arry = new ArrayList(lst);
    }
}
