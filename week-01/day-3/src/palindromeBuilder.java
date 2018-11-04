import java.util.Scanner;

public class palindromeBuilder {
    public static String input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input a String to turn in to a palindrome!");
        String input = in.nextLine();
        return input;
    }

    public static String createPalindrome(String input) {
        String output = input;
        for (int i = 0; i < input.length() ; i++) {
            output += input.charAt(input.length() - 1 - i);
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(createPalindrome(input()));
    }

}
