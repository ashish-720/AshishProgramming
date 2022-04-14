package programmingPractise.interviewQuestions.generic.simple;

public class Program1 {
    //Largest from two numbers or three numbers

    public static void main(String[] args) {
        //largestOfTwoNumbers(12, 13);
        //largestOfThreeNumbersAdvance(22, 12, 24);
        //largestOfThreeNumbersAdvanceSecond(92, 1, 92);
        largestOfFourDigitNumbers(3, 2100, 234, 24);
    }

    //Method to find the largest of two numbers(methods will work also if any two or all three numbers are same as well)
    public static void largestOfTwoNumbers(int number1, int number2) {
        if (number1 > number2) {
            System.out.println("Largest number is " + number1);
        } else
            System.out.println("Largest number is " + number2);
    }


    //Method to find the largest of three numbers(methods will work also if any two or all three numbers are same as well)
    public static void largestOfThreeNumbersConventional(int number1, int number2, int number3) {
        if (number1 > number2) {
            if (number1 > number3) {
                System.out.println(number1 + " is the largest");
            } else
                System.out.println(number3 + " is the largest");
        } else {
            if (number2 > number3) {
                System.out.println(number2 + " is the largest");
            } else
                System.out.println(number3 + " is the largest");
        }
    }

    //Method to find the largest of three numbers(methods will work also if any two or all three numbers are same as well)
    public static void largestOfThreeNumbersAdvance(int number1, int number2, int number3) {
        int largest;
        if (number1 > number2) {
            largest = number1 > number3 ? number1 : number3;
        } else {
            largest = number2 > number3 ? number2 : number3;
        }
        System.out.println(largest + " is the largest number");
    }

    //Method to find the largest of three numbers
    public static void largestOfThreeNumbersAdvanceSecond(int number1, int number2, int number3) {
        int largest;
        if (number1 > number2 && number1 > number3)
            largest = number1;
        else if (number2 > number1 && number2 > number3)
            largest = number2;
        else largest = number3;
        System.out.println(largest + " is the largest among all three numbers");
    }


    //How do I write a program to find the greatest number among four numbers, without using if statements and array type variables?
    public static void largestOfFourDigitNumbers(int number1, int number2, int number3, int number4) {
        int largest;
        largest = (number1 > number2) ? (number1 > number3) ? (number1 > number4) ? number1 : number4 : (number3 > number4) ? number3 : number4 : (number2 > number3) ? (number2 > number4) ? number2 : number4 : (number3 > number4) ? number3 : number4;
        System.out.println("Largest among four digits is " + largest);
    }

}
