public class TimeCrunch {

    /*
    Create a program which takes a number in seconds and breaks it down into hours, minutes and seconds.

    Example:
     */
    public static void main(String[] args) {

        int secGiven = 4000;
        int hour = 3600;
        int min = 60;
        int sec = 1;

        int hours = secGiven / hour;
        secGiven = secGiven % hour;

        int mins = secGiven / min;
        secGiven = secGiven / min;

        int secs = secGiven;

        System.out.println("The time is: ");
        System.out.println(hours + " hrs");
        System.out.println(mins + " mins");
        System.out.println(secs + " secs");
    }
}
