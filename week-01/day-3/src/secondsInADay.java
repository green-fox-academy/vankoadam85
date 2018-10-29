public class secondsInADay {

    public static void main(String[] args) {

        int secDay =  24 * 60 * 60;
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int pastSec = (currentHours * 60 + currentMinutes) * 60 + currentSeconds;

        int secLeft = secDay - pastSec;

        System.out.println("Seconds left in the day: " + secLeft);

    }

}
