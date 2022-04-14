package learning.collectionBasics.SetInterface;

import java.util.HashSet;

public class SetBasics1 {
    public static void main(String[] args) {
        //No duplicates and no insertion order preserved
        HashSet set = new HashSet<String>();
        for (int i = 1; i <= 10; i++) {
            set.add("Ashish" + i);
        }
        System.out.println(set);
    }
}
