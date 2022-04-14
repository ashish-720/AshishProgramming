package programmingPractise.interviewQuestions.StringPrograms;

import java.util.*;

public class StringProgram3 {
    //Remove duplicates from the string
    public static void main(String[] args) {
        System.out.println(removeDuplicateCharactersFromString3("AASSHHIISSHH"));
    }

    public static String removeDuplicateCharactersFromString1(String given) {
        List noDup = new ArrayList();
        for (int i = 0; i < given.length(); i++) {
            int count = 0;
            if (!noDup.contains(given.charAt(i))) {
                for (int j = i; j < given.length(); j++) {
                    if (given.charAt(i) == given.charAt(j)) count++;
                }
            }
            if (count >= 1) noDup.add(given.charAt(i));

        }
        return noDup.toString();
    }


    public static String removeDuplicateCharactersFromString2(String given) {
        Set removedDuplicates = new HashSet<>();
        for (char ch : given.toCharArray()) {
            removedDuplicates.add(ch);
        }
        return removedDuplicates.toString();
    }

    public static StringBuffer removeDuplicateCharactersFromString3(String given) {
        StringBuffer withoutDuplicates = new StringBuffer();
        given.chars().distinct().forEach(ch -> withoutDuplicates.append((char) ch));
        return withoutDuplicates;
    }


    public static String removeDuplicateCharactersFromString4(String given) {
       return "";
    }
}
