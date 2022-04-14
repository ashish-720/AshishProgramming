package programmingPractise.interviewQuestions.StringPrograms;

public class StringProgram2 {
    //Replace special character from string, And white spaces from a string
    //AS$#H!I$&@HSa@m%al720

    public static void main(String[] args) {
        System.out.println(removeSpecialCharacterFromString2("AS$#H!I$&@HSa@m%al720"));
        System.out.println(removeWhiteSpacesFromString("Ashish        Kumar       samal"));
    }

    public static String removeSpecialCharacterFromString1(String given) {
        return given.replaceAll("[^a-zA-Z0-9]", "");
    }

    public static String removeSpecialCharacterFromString2(String given) {
        return given.replaceAll("\\W", "");
    }

    public static String removeWhiteSpacesFromString(String given) {

        return given.replaceAll("\\s","");
    }
}
