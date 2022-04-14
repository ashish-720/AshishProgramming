package learning.collectionBasics.ListInterface.LinkedListClass;

import java.util.LinkedList;

public class LinkedListBasics1 {
    public static void main(String[] args) {
        //linkedList is Based on DoubleLinkedList Data structure
        //Insertion and deletion operation is betr here compare to ArrayList
        //Retrival is time consuming compare to ArrayList
        //It implements Dequeue so various functionality is provided like void addFirst(), void addLast(), Object getFirst(), Object getLast()
        LinkedList lt = new LinkedList();
        lt.add("12");
        lt.addFirst("1");
        lt.addLast(23);
        System.out.println(lt);
        System.out.println(lt.getFirst() + "    " + lt.getLast());
        lt.removeFirst();
        lt.removeLast();
        System.out.println(lt);
    }

}
