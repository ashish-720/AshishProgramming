package programmingPractise.interviewQuestions.arraysRelated;

public class Problem3 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 6, 7, 9, 10, 5, 3, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[j] - arr[i]) == Math.abs(j - i)) {
                    System.out.println("Pairs are: " + arr[i] + ", " + arr[j]);
                }
            }
        }
    }

}
