import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};
        int[] raj = new int[aj.length];
        int temp;
        for (int i = 0; i < aj.length ; i++) {
            temp = aj[i];
            raj[aj.length -1 - i] = temp;
        }
        System.out.println(Arrays.toString(raj));
    }
}
