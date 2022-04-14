package programmingPractise.interviewQuestions.generic.simple;

public class Program4 {

    //WAP to find palindromes list in the range

    //WAP to reverse a number and check the number is a palindrome or not?
    public static void main(String[] args) {
        int number = 456789;
        int reverse = 0;
        while (number > 0) {
            int remainder = number % 10;
            number = number / 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println(reverse);
    }
}
