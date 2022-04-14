package programmingPractise.interviewQuestions.generic.simple;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program6 {
    public static void main(String[] args) {
        getMaximumOccuranceInString("gooooooooooooooooooohhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhgtttttttle");
    }

    public static void getMaximumOccuranceInString(String given) {
        Map map = new HashMap();
        for (int i = 0; i < given.length(); i++) {
            if (!map.containsKey(given.charAt(i)))
                map.put(given.charAt(i), 0);
            else
                map.put(given.charAt(i), ((int) map.get(given.charAt(i)) + 1));
        }
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        int maxValue = Integer.MIN_VALUE;
        char requiredKey = 'a';
        for (Map.Entry<Character, Integer> eachEntry : entrySet) {
            if (maxValue < eachEntry.getValue()) {
                maxValue = eachEntry.getValue();
                requiredKey = eachEntry.getKey();
            }
        }
        System.out.println("Max key: " + requiredKey + " " + "Max value: " + maxValue);
    }


}
