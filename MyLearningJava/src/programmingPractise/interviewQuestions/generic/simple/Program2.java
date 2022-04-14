package programmingPractise.interviewQuestions.generic.simple;

public class Program2 {
    //To find a leap Year
    public static void main(String[] args) {
        //System.out.println(isLeapYear(100));
        System.out.println(isLeapYearAdvance(2000));
    }


    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0 ? true : false;
            } else
                return true;
        } else
            return false;
    }

    public static boolean isLeapYearAdvance(int year) {
        if ((year % 4 == 0 && (year % 100 != 0)) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)) {
            return true;
        } else
            return false;
    }
}
