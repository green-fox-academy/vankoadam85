import java.util.Scanner;

public class oneTwoALot {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int num = input.nextInt();

        if (num <= 0) {
            System.out.println("Not enough");
        } else if (num == 1) {
            System.out.println("One");
        } else if (num == 2) {
            System.out.println("Two");
        }    else {
                System.out.println("A lot");
        }
    }


}

