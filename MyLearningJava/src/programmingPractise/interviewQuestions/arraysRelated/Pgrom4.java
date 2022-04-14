package programmingPractise.interviewQuestions.arraysRelated;

import javafx.util.Pair;

import java.util.*;


public class Pgrom4 {

    Map data = new HashMap();

    public static void main(String[] args) {
//        Map data = [1:"ashish", 2:"Kiran"];
        Map<Integer, String> data = new HashMap<Integer, String>();
        data.put(1, "Ashish");
        data.put(2, "Kiran");
        data.put(3, "ww");
        data.put(4, "qq");
        List<Pair<String, String>> tp = new ArrayList<>();
        tp.add(0, new Pair<>("s", "s"));
        System.out.println(tp.get(0).getKey());
        Set<Map.Entry<Integer, String>> entries = data.entrySet();
        for (Map.Entry<Integer, String> eachEntry : entries) {
            System.out.println(eachEntry);
        }
        data.values();

    }

}

