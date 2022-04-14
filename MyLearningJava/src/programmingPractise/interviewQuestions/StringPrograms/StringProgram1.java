package programmingPractise.interviewQuestions.StringPrograms;

import java.util.Arrays;

public class StringProgram1 {

    public static void main(String[] args) {
        System.out.println(reverseAString4("Hello"));
    }

    public static String reverseAString1(String given) {
        char[] ch = new char[given.length()];
        for (int i = given.length() - 1; i >= 0; i--) {
            ch[given.length() - 1 - i] = given.charAt(i);
        }
        return Arrays.toString(ch);
    }


    public static String reverseAString2(String given) {
        return new StringBuffer(given).reverse().toString();
    }

    public static String reverseAString3(String given) {
        return new StringBuilder(given).reverse().toString();
    }

    public static String reverseAString4(String given) {
        char ch[] = given.toCharArray();
        for (int i = 0; i <= (given.length() / 2) - 1; i++) {
            char temp = ch[i];
            ch[i] = ch[given.length() - 1 - i];
            ch[given.length() - 1 - i] = temp;
        }
        return Arrays.toString(ch);
    }
}
