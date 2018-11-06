import java.util.*;

public class Matchmaking{

    public static ArrayList<String> makingMatches (ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> match = new ArrayList<>();
        if (list2.size() > list1.size()) {
            for (int i = 0; i < list1.size(); i++) {
                match.add(list1.get(i));
                match.add(list2.get(i));
            }
            match.addAll(list2.subList(list1.size(), list2.size()));
        } else {
            for (int i = 0; i < list2.size(); i++) {
                match.add(list1.get(i));
                match.add(list2.get(i));
            }
            match.addAll(list1.subList(list2.size(), list1.size()));
        }
        return match;
    }

    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }
}