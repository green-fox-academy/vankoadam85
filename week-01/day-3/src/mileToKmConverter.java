import java.util.Scanner;

public class mileToKmConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please input kilometers: ");
        int km = input.nextInt();
        double miles = km * 0.621371192;

        System.out.println("Converted to miles, this distance is: " + miles + " miles");

    }

}
