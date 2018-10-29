import java.util.Scanner;

public class partyIndicator {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("The number of girls coming:");
        int girls = input.nextInt();
        System.out.println("The number of boys coming:");
        int boys = input.nextInt();

        if (girls == 0) {
            System.out.println("Sausage party");
        } else if ((girls == boys) && (girls + boys >= 20)) {
            System.out.println("The party is excellent!");
        } else if (girls + boys >= 20) {
            System.out.println("Quite cool party!");
        } else if (girls + boys < 20) {
            System.out.println("Average party...");
        }

    }

}
