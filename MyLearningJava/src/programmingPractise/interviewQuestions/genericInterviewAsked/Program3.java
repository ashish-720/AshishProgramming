package programmingPractise.interviewQuestions.genericInterviewAsked;

public class Program3 {


    public static void main(String[] args) {
        int[][] arr = {{5, 2, 3}, {3, 3, 3}, {4, 7, 3}};
        System.out.println(sumOfMatrix(3, 3, arr));
    }

    public static int sumOfMatrix(int rows, int column, int matrix[][]) {
        int i, j, sum = 0;
        if ((rows > 0) && (column > 0)) {
            for (i = 0; i < rows; i++) {
                for (j = 0; j < rows; j++) {
                    if (i == j) {
                        if (matrix[i][j] % 2 != 0) {
                            sum += matrix[i][j];
                        }
                    }
                }
            }
            return sum;
        } else return sum;
    }
}
