import java.util.Scanner;
public class drawDiamond {
    public static int in() {
        Scanner input = new Scanner(System.in);
        System.out.println("How big a diamond do you want?");
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
        int h = 0;
        if (size % 2 == 0)
            h = 1;
        for (int i = 0; i < size; i++) {
            if (i < size / 2 + 1 - h) {
                int j = size / 2 - i - h;
                for (int l = 0; l < 2 * i + 1 + h; l++)
                    diam[i][j + l] = "*";
            } else {
                int j = i - size / 2;
                for (int l = 0; l < size * 2 - (i * 2 + 1 - h); l++) {
                    diam[i][j + l] = "*";
                }
            }
        }
        return diam;
    }
    public static void main(String[] args) {
        int size = in();
        int i  = 0;
        while (i < size) {
            for (int j = 0; j < size; j++) {
                if (j < size - 1) {
                    System.out.print(diamond(matrix(size), size)[i][j]);
                } else
                    System.out.println(diamond(matrix(size), size)[i][j]);
            }
            i++;
        }
    }
}