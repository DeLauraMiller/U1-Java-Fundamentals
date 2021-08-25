public class SalesTax {

    /*
    Create a program which takes a quantity, price and tax percentage and outputs the total cost with tax.
     */

    public static void main(String[] args) {

        //declare and initialize variables
        double price = 9.99;
        int quantity = 6;
        double _tax = 7;  //.07
        final double TAX = _tax/100.0;

        //calculations
        double subtotal = price * quantity;
        double taxTotal = subtotal * TAX;
        double totalCost = subtotal + taxTotal;

        System.out.println("You bought " + quantity + " shirts for "+ price + " per shirt.");
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Tax: "+ taxTotal);
        System.out.println("Total:" + totalCost);

        //DISCOUNTS AND INCREASES

        //FORMULA: AMOUNT * (1 +/- PERCENTAGE) = TOTAL

    }
}
