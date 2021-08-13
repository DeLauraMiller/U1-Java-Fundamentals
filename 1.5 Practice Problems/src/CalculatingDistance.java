public class CalculatingDistance {

    /*
    Create a program that calculates a vehicle's distance based on speed traveled and time traveled.

    Example: 55 mph for 45 minutes -> 41.25 miles

    */

    public static void main(String[] args) {
        int mph = 55;
        int min = 45;
        double hourTaken = 60.00/min;
        double miles = mph/hourTaken;

        System.out.println("This vehicle traveled: " + miles + " miles.");

    }
}



