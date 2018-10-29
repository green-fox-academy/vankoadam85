import java.util.Scanner;

public class helloUser {

    public static void main(String[] args) {

        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user

        Scanner input = new Scanner(System.in);
        System.out.println("Please input name: ");
        String name = input.nextLine();

        System.out.println("Hello, " + name + "!");

    }

}
