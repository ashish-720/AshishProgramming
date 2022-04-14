package programmingPractise.interviewQuestions.StringPrograms;

import java.util.*;

public class StringPrograms4 {
    public static void main(String[] args) {
        String name = "AABBCCCCDDDDFFFFFFEE";
        Map eachCharacterWithCount = new HashMap<String, Integer>();
        for (int i = 0; i < name.length(); i++) {
            if (eachCharacterWithCount.get(name.charAt(i)) == null) {
                eachCharacterWithCount.put(name.charAt(i), 1);
            } else
                eachCharacterWithCount.put(name.charAt(i), (int) eachCharacterWithCount.get(name.charAt(i)) + 1);
        }
        System.out.println(eachCharacterWithCount);
        Set maxList = new HashSet();
        Set minList = new HashSet();
        TreeSet sortedData = new TreeSet(eachCharacterWithCount.values());
        int min = (int) sortedData.first();
        int max = (int) sortedData.last();
        Set<Map.Entry<String, Integer>> entries = eachCharacterWithCount.entrySet();
        for (Map.Entry<String, Integer> eachEntry : entries) {
            if (eachEntry.getValue() == max)
                maxList.add(eachEntry.getKey());
            else if (eachEntry.getValue() == min)
                minList.add(eachEntry.getKey());
        }
        System.out.println("Max List:" + maxList);
        System.out.println("Min List:" + minList);
    }
}
