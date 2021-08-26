import javax.swing.JOptionPane;

public class L9{

    public static void main(String[] args) {

        String firstName;
        String lastName;

        firstName = JOptionPane.showInputDialog("What is your first name?");
        lastName = JOptionPane.showInputDialog("What is you last name?");




        JOptionPane.showMessageDialog(null, "Hello " + firstName +" " +  lastName +  " !!" );



        //ALL INPUT IS RECEIVED AS A STRING

        //PRO TIP: Variable of the same data type can be separated with a comma in the declaration

        int mph, minutes;
        double distance, hours;

        mph = Integer.parseInt(JOptionPane.showInputDialog("How fast were you driving (in MPH)?"));
        minutes = Integer.parseInt(JOptionPane.showInputDialog("How long in minutes , were you traveling"));

        hours = minutes/60.0;

        distance = mph * hours;

        JOptionPane.showMessageDialog(null," You traveled " + distance + " miles.");
        System.exit(0); //This stops the program from running because Dialog boxes don't stop running


    }

}
