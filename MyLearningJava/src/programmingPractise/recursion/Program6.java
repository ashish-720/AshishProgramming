package programmingPractise.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Program6 {

    //Permutations of a int array using recursion
    public static void main(String[] args) {
        System.out.println(permutationOfAString(new int[]{1, 2, 3}));
    }

    public static void fetchEachCombination(int[] given, List<List<Integer>> requiredCombinationList, List<Integer> eachCombinationSet, boolean[] checkItem) {
        if (eachCombinationSet.size() == given.length) {
            requiredCombinationList.add(new ArrayList<>(eachCombinationSet));
            return;
        }
        for (int i = 0; i < given.length; i++) {
            if (!checkItem[i]) {
                checkItem[i] = true;
                eachCombinationSet.add(given[i]);
                fetchEachCombination(given, requiredCombinationList, eachCombinationSet, checkItem);
                eachCombinationSet.remove(eachCombinationSet.size() - 1);
                checkItem[i] = false;
            }
        }
    }

    public static List permutationOfAString(int[] given) {
        List<List<Integer>> requiredCombinationList = new ArrayList<>();
        List<Integer> eachCombinationSet = new ArrayList<>();
        boolean[] checkItem = new boolean[given.length];
        fetchEachCombination(given, requiredCombinationList, eachCombinationSet, checkItem);
        return requiredCombinationList;
    }
}
