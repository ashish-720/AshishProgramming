package programmingPractise.JavaTutorialsPoint.Strings;

public class Program1 {
    public static void main(String[] args) {
        System.out.println(occuranceOfGivenStringInString("JATTJAVAABCDJAVAEE", "A"));
    }

    public static int occuranceOfGivenStringInString(String toBeChecked, String subString) {
        int count = 0;
        if (toBeChecked.isEmpty() || subString.isEmpty())
            return 0;
        for (int i = 0; i <= toBeChecked.length() - subString.length() - 1; i++) {
            if (toBeChecked.charAt(i) == subString.charAt(0)) {
                if (toBeChecked.substring(i, i + subString.length()).equals(subString)) {
                    count++;
                }
            }
        }
        return count;
    }
}
