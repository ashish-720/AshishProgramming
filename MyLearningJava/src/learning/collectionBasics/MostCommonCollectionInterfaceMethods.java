package learning.collectionBasics;

import java.util.ArrayList;
import java.util.List;

public class MostCommonCollectionInterfaceMethods {
    //If we are trying to represent the collection of objects as single entity we go for collection
    //boolean add(Object o), boolean addAll(Collection c), boolean remove(Object o), boolean removeAll(Collection c), boolean contains(Object o), boolean containsAll(Collections c)
    //boolean retainAll(Collection c), void clear(), boolean isEmpty(), Object[] toArray(), Iterator iterator(), int size()
    public static void main(String[] args) {
        List lst = new ArrayList<String>();
        for (int i = 1; i <= 10; i++) {
            lst.add("Ashish" + i);
        }
        System.out.println(lst);
        System.out.println(lst.size());
        lst.remove("Ashish2");
        System.out.println(lst);
        System.out.println(lst.size());
        System.out.println(lst.contains("Ashish2"));
        List lst1 = new ArrayList<String>();
        for (int i = 3; i <= 10; i++) {
            lst1.add("Ashish" + i);
        }
        System.out.println(lst.retainAll(lst1));
        System.out.println(lst);
        lst1.clear();
        System.out.println(lst1);
        System.out.println(lst1.isEmpty());

        System.out.println(lst.toArray());//printing the array object/reference  is giving the memory location as toString() is doing so
        lst.remove("Ashish4");

    }
}
