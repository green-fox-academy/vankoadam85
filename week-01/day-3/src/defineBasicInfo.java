public class defineBasicInfo {

    public static void main(String[] args) {

        String name = "Vankó Ádám";
        int age = 33;
        double height = 1.93;
        boolean married = false;
        String marStat = "No";

        if (married) {
            marStat = "Yes";
        }

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is married: " + marStat);

    }
}
