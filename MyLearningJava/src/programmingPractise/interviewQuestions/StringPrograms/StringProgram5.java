package programmingPractise.interviewQuestions.StringPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringProgram5 {
    public static void main(String[] args) {
        //Input "abd123dba345dab234wee" output "dba123abd345bad234eew"
        String given = "abd123dba345dab234wee";
        reverseOnlyCharacterOtherThenDigits(given);
    }

    public static void reverseOnlyCharacterOtherThenDigits(String given) {
        String required = "";
        String temp = "";
        for (int i = 0; i < given.length(); i++) {
            String charString = given.charAt(i) + "";
            if (charString.matches("[a-zA-Z]")) {
                temp = temp.concat(given.charAt(i) + "");
            } else {
                required = required + reverse(temp) + given.charAt(i);
                temp = "";
            }
        }
        System.out.println(required + reverse(temp));
    }

    public static String reverse(String given) {
        char[] arr = given.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return new String(arr);
    }
}
