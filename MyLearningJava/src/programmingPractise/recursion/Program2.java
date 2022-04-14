package programmingPractise.recursion;

public class Program2 {
    public static void main(String[] args) {
        sumOfNNumbers2(1, 4, 0);
    }

    //sum of first n numbers using recursion(parameter way, here sum parameter is carry forwarded)
    public static void sumOfNNumbers(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        sumOfNNumbers(i - 1, sum + i);
    }

    //sum of first n numbers using recursion
    public static void sumOfNNumbers2(int i, int n, int sum) {
        if (i > n) {
            System.out.println(sum);
            return;
        }
        sum+=i;
        i++;
        sumOfNNumbers2(i, n, sum);
    }
}
