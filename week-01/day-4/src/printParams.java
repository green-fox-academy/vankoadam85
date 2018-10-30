import java.util.Arrays;

public class printParams {
    public static void  printParams(String... param) {
        System.out.println(Arrays.toString(param));
    }
    public static void main(String[] args) {
        printParams("first", "second", "third", "fourth");
    }
}
