import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {
    public static int guess() {
        Scanner input = new Scanner(System.in);
        System.out.println("Your guess?");
        int guess = input.nextInt();
        return guess;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(10) + 1;
        System.out.println("I've thought of a number between 1 and 10, try to guess it!");
        int guess = guess();
        while (guess != number) {
            if (guess < number) {
                System.out.println("My number is higher");
                guess = guess();
            } else {
                System.out.println("My number is lower");
                guess = guess();
            }
        }
        System.out.println("Congratulations, you've guessed my number!" + "(" + number + ")");
    }
}
