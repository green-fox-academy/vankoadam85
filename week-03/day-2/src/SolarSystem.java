import java.util.*;

public class SolarSystem{

    public static String putSaturn (ArrayList<String> input) {
        input.add(5, "Saturn");
        String output = input.toString();
        return output;
    }

    public static void main(String... args){
        ArrayList<String> planetList = new ArrayList<>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

        // Saturn is missing from the planetList
        // Insert it into the correct position
        // Create a method called putSaturn() which has list parameter and returns the correct list.

        System.out.println(putSaturn(planetList));
        // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"
    }
}