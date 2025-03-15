public class Ecom {

    public static double calculateTotalPrice(int[] prices, boolean isPremiumMember) {
        double totalPrice = 0;
        for (int price : prices) {
            totalPrice += price;
        }
        if (isPremiumMember) {
            totalPrice *= 0.95;
        }
        if (totalPrice > 5000) {
            totalPrice *= 0.90;
        }

        return totalPrice;
    }

    public static void main(String[] args) {
        int[] cartPrices = {1000, 2000, 1500, 3000};
        boolean premiumMember = true;

        double finalPrice = calculateTotalPrice(cartPrices, premiumMember);
        System.out.println("The total price is: ₹" + finalPrice);
    }
}
