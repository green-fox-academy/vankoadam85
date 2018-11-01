import java.util.Scanner;
public class drawTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input the size of the triangle!");
        int size = in.nextInt();
        String star = "*";
        for (int i = 0; i < size; i++) {
            System.out.println(star);
            star = star + "*";
        }
    }
}
