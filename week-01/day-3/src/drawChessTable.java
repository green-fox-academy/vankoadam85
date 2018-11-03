public class drawChessTable {
    public static void main(String[] args) {
        for (int i = 0; i <  8; i++) {
            for (int j = 0; j < 8 ; j++) {
                    if (((i % 2 == 0) && j == 6) || ((i % 2 != 0) && j ==7)) {
                        System.out.println("%");
                    } else if (((i + j) % 2 == 0)) {
                        System.out.print("%");
                    } else if (!((i % 2 == 0) && j == 7)) {
                        System.out.print(" ");
                    }
            }
        }
    }
}
