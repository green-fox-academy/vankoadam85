import java.util.*;

public class ElementFinder{

    public static String containsSeven (ArrayList<Integer> input) {
        String ifTrue = "Noooooo";
        for (int i = 0; i < input.size() ; i++) {
            if (input.get(i).equals(7)) {
                ifTrue = "Hoorray";
            }
        }
        return ifTrue;
    }
//    public static String containsSeven (ArrayList<Integer> input) {
//        if (input.contains(7)) {
//            return "Hoorray";
//        } else {
//            return "Noooooo";
//        }
//    }

    public static void main(String... args){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven(arrayList));
        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!

    }
}