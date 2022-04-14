package programmingPractise.interviewQuestions.generic.simple;

public class Program3 {
    //Program to find whether the number is odd or even
    public static void main(String[] args) {
        System.out.println(isEvenNumber(0));
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0 ? true : false;
    }
}
