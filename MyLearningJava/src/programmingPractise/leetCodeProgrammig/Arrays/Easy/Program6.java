package programmingPractise.leetCodeProgrammig.Arrays.Easy;

import java.util.Arrays;

public class Program6 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 4, 1, 78, 2, 32, 1};
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (i == 0) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[0] = temp;
            } else {
                temp = arr[i + 1];
                arr[i + 1] = arr[0];
                arr[0] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
