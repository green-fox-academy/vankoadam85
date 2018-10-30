import java.util.Scanner;
import java.util.Arrays;
public class diagonalMatrix {
    public static int sizeIn () {
        Scanner in = new Scanner(System.in);
        System.out.println("How big should the matrix be?");
        int size = in.nextInt();
        return size;
        }
    public static int[][] matrixing (int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            }
        return matrix;
        }
    public static void main(String[] args) {
        int matrixSize = sizeIn();
        for (int i = 0; i < matrixSize; i++)
        System.out.println(Arrays.toString(matrixing(matrixSize)[i]));
    }
}
