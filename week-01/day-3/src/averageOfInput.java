import java.util.Scanner;

public class averageOfInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please input the five numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        int sum = num1 + num2 + num3 + num4 + num5;
        double avg = sum / 5;

        System.out.println("The sum of the numbers is: " + sum + " and the average of the numbers is: " + avg + ".");

    }

}
