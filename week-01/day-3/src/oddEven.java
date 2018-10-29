import java.util.Scanner;

public class oddEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please input the number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("The inputted number is even.");
        } else {
            System.out.println("The inputted number is odd.");
        }


    }

}
