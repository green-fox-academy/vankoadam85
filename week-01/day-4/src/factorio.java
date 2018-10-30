import java.util.Scanner;
public class factorio {
    public static int parameter () {
        System.out.println("Please input a number to factorialize!");
        Scanner input = new Scanner(System.in);
        int param = input.nextInt();
        return param;
    }

    public static int factorio(int limit) {
        int j = 1;
        for (int i = 1; i <= limit; i++) {
            j = j * i;
        }
        return j;
    }
    public static void main(String[] args) {
        System.out.println("Factorial of the number is: " + factorio(parameter()));
    }
}