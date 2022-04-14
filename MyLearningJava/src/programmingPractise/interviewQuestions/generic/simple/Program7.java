package programmingPractise.interviewQuestions.generic.simple;

import java.lang.reflect.Array;
import java.util.*;

public class Program7 {
    public static void main(String[] args) {
        getPairCountForEachElement(new Object[]{"Ashish", "Alok", "Sahana", "Sahana", "Sahana", "Sahana", "Alok", "Sahana", "Neeraj"});
        getPairCountForEachElement(new Object[]{"A", "A", "S", "S", "S", "S", "A", "S", "N"});
        getPairCountForEachElement(new Object[]{12, 23, 14, 23, 128, 56, 128, 128, 128});
        getPairCountForEachElement(new Object[]{12, 23, 14, 23, 128, 56, 128, 128, 128, "Ashish", "Alok", "Sahana", "Sahana", "A", "A", "S", "S", "S"});

    }


    public static Map getEachElementWithItsCount(Object[] arrayOfElements) {
        Map eachElementWithItsCount = new HashMap<Object, Integer>();
        for (Object eachElement : arrayOfElements) {
            if (!eachElementWithItsCount.containsKey(eachElement))
                eachElementWithItsCount.put(eachElement, 1);
            else
                eachElementWithItsCount.put(eachElement, ((int) eachElementWithItsCount.get(eachElement)) + 1);
        }
        return eachElementWithItsCount;
    }

    public static void getPairCountForEachElement(Object[] arrayOfElements) {
        Map eachElementWithItsCount = getEachElementWithItsCount(arrayOfElements);
        Set<Map.Entry<Object, Integer>> entrySet = eachElementWithItsCount.entrySet();
        for (Map.Entry<Object, Integer> eachEntry : entrySet) {
            if (eachEntry.getValue() == 1) {
                eachElementWithItsCount.put(eachEntry.getKey(), 0);
            } else if (eachEntry.getValue() % 2 == 0) {
                eachElementWithItsCount.put(eachEntry.getKey(), (eachEntry.getValue()) / 2);
            } else if (eachEntry.getValue() % 2 != 0)
                eachElementWithItsCount.put(eachEntry.getKey(), (eachEntry.getValue() - 1) / 2);
        }

        System.out.println(eachElementWithItsCount);
    }

}
