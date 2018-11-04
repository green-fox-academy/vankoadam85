import java.util.Scanner;

public class subStr {

    public static String input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the String to be searched!");
        String text = input.nextLine();
        return text;
    }

    public static String query() {
        Scanner query = new Scanner(System.in);
        System.out.println("Please input the String to search for!");
        String text = query.nextLine();
        return text;
}

    public static int subStr(String input, String query) {
        for (int i = 0; i < input.length() + 1 - query.length(); i++) {
            for (int j = 0; j < query.length() && (input.charAt(i + j) == query.charAt(j)); j++) {
                if (j == query.length() - 1) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("The searched String starts after character " + subStr(input(),query()));
    }
}
