public class CalculatingDistance {

    /*
    Create a program that calculates a vehicle's distance based on speed traveled and time traveled.

    Example: 55 mph for 45 minutes -> 41.25 miles

    */

    public static void main(String[] args) {
        int mph = 55;
        int min = 45;

        double hourTaken = min/60.00;
        double miles = hourTaken * mph;

        System.out.println("This vehicle traveled: " + miles + " miles.");

    }
}



