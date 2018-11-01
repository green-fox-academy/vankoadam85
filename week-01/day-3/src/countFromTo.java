import java.util.Scanner;
public class countFromTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the numbers for the counting!");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 >= num2)
            System.out.println("The second number should be bigger");
        else
            for (int i = num1; i < num2; i++)
                System.out.println(i);
    }

}
