import java.util.Scanner;

public class printBigger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please input two numbers!");
        int a = input.nextInt();
        int b = input.nextInt();

        if (a > b) {
            System.out.println("This number is bigger: " + a);
        } else {
            System.out.println("This number is bigger: " + b);
        }

    }

}
