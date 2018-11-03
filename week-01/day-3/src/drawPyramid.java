import java.util.Scanner;
public class drawPyramid {
    public static int size () {
        Scanner input = new Scanner(System.in);
        System.out.println("How big do you want your pyramid?");
        int size = input.nextInt();
        return size;
    }
    public static void main(String[] args) {
        int size = size();
        int i = 0;
        while (i < size) {
            for (int j = 0; j < size + i; j++) {
                if (j == size + i - 1) {
                    System.out.println("*");
                } else if (j > size - (2 + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            i++;
        }
    }
}
