import java.util.Scanner;

public class parametricAverage {

    public static int number () {
        Scanner input = new Scanner (System.in);
        int number = input.nextInt();
        return number;
    }

    public static void main(String[] args) {
        System.out.println("I'm a program that adds and averages numbers." +
                "Please input how many numbers you wish to add");
        Scanner in = new Scanner(System.in);
        double count = in.nextInt();
        System.out.println("Please input the numbers!");
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += number();
        }
        System.out.println("Sum: " + sum + ", Average: " + sum / count);
    }
//        System.out.println("I'm a program that adds and averages numbers. Please input your numbers!");
//        System.out.println("Input something, that is not a number, to see the results!");
//        Scanner in = new Scanner(System.in);
//        int number;
//        int sum = 0;
//        double i = 0;
//        while (in.hasNextInt()) {
//            number = in.nextInt();
//            sum += number;
//            i++;
//        }
//        System.out.println("Sum: " + sum + ", Average: " + sum / i);
}
