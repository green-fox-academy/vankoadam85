import java.util.Scanner;

public class drawDiagonal {

    public static int size () {
        Scanner input = new Scanner(System.in);
        System.out.println("How big should the square be?");
        int size = input.nextInt();
        return size;
    }

    public static void main(String[] args) {
        int size = size();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == size - 1) {
                    System.out.println("%");
                } else if (i == 0 || i == size - 1) {
                    System.out.print("%");
                } else if (j == 0 || j == size - 1) {
                    System.out.print("%");
                } else if (i == j) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
