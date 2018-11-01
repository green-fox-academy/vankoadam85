import java.util.Scanner;
import java.util.Arrays;
public class drawDiamond {
    public static int in() {
        Scanner input = new Scanner(System.in);
        System.out.println("How big a gemstone do you want?");
        int size = input.nextInt();
        return size;
    }

    public static String[][] matrix(int size) {
        String[][] mat = new String[size][size];
        int i = 0;
        while (i < size) {
            for (int j = 0; j < size; j++)
                mat[i][j] = " ";
            i++;
        }
        return mat;
    }

    public static String[][] diamond(String[][] diam, int size) {
        for (int i = 0; i < size; i++) {
            if (i <= size / 2) {
                int j = size / 2 - i;
                for (int l = 0; l < 2 * i + 1; l++)
                    diam[i][j + l] = "*";
            } else {
                int j = i - size / 2;
                for (int l = 0; l < size * 2 - (i * 2 + 1); l++) {
                    diam[i][j + l] = "*";
                }
            }
        }
        return diam;
    }

    public static String[][] emerald(String[][] emer, int size) {
        for (int i = 0; i < size; i++) {
            if (i < size / 2) {
                int j = size / 2 - 1 - i;
                for (int l = 0; l < 2 * i + 2; l++)
                    emer[i][j + l] = "*";
            } else {
                int j = i - size / 2;
                for (int l = 0; l < size * 2 - (i * 2); l++) {
                    emer[i][j + l] = "*";
                }
            }
        }
        return emer;
    }

    public static void main(String[] args) {
        int size = in();
        if (size % 2 != 0) {
            for (int k = 0; k < size; k++) {
                System.out.println(Arrays.toString(diamond(matrix(size), size)[k]));
            }
        } else {
            for (int k = 0; k < size; k++) {
                System.out.println(Arrays.toString(emerald(matrix(size), size)[k]));
            }
        }
    }
}
