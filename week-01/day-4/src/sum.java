import java.util.Scanner;
public class sum {

    public static int parameter () {
        System.out.println("Please input how many numbers to add!");
        Scanner input = new Scanner(System.in);
        int param = input.nextInt();
        return param;
    }

    public static int sum (int limit) {
        int j = 0;
        for (int i = 1; i <= limit; i++) {
            j = j + i;
            }
            return j;
        }
    public static void main(String[] args) {
        System.out.println("Sum of the numbers is: " + sum(parameter()));
    }
}
