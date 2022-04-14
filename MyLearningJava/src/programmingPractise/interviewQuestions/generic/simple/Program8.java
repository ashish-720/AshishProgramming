package programmingPractise.interviewQuestions.generic.simple;

public class Program8 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 20, 3, 2, 50, 80};
        int difference = 78;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == difference) {
                    System.out.println("Pairs are:" + arr[i] + "," + arr[j]);
                    break;
                }
            }
        }
    }

    //
    public static void getPairOfElementWithDifference(int[] array) {

    }
}
