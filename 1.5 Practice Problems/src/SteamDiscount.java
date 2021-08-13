public class SteamDiscount {

    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */
    public static void main(String[] args) {

        double cost = 60.00;
        int quantity = 1;
        double discount = 0.20;

        double price = cost * quantity;
        double discountPrice = price * discount;
        double total = price - discountPrice;

        System.out.println("This game costs: $" + total + " dollars!");
    }
}
