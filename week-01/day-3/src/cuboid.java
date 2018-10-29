public class cuboid {

    public static void main(String[] args) {

        double a = 2;
        double b = 3;
        double c = 4;

        double area = 2 * (a * b + b * c + c * a);
        double volume = a * b * c;

        System.out.println("Area of the cuboid is: " + area);
        System.out.println("Volume of the cuboid is: " + volume);

    }

}
