import java.util.Scanner;
public class multiplicationTable {
    public static int input () {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input a number for the multiplication table!");
        int number = in.nextInt();
        return number;
    }
    public static void main(String[] args) {
        int number = input();
        for (int i = 1; i <= 10; i++)
            System.out.println(i + " * " + number + " = " + i*number);
    }
}
