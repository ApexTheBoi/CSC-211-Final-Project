import java.util.ArrayList;
import java.util.function.Function;

@FunctionalInterface
interface DiscountCalculator extends Function<Double, Double> {}

@FunctionalInterface
interface TaxCalculator extends Function<Double, Double> {}

@FunctionalInterface
interface ShippingCalculator extends Function<Double, Double> {}

public class Order { //Purely for representing a customer's orde with methods for calculating totals
    
    private final Customer customer; //customer will never change on an order.
    private final ArrayList<Product> productList; //a list of all a customer's products.
    private double total;


    public Order(Customer customer){
        this.customer = customer;    
        productList = new ArrayList<>();
        total = 0;    
    }

    public void addProduct(Product product){
        productList.add(product);
        total += product.getPrice();
        System.out.println("Product [[" + product.getName() + "]] added to " + customer.getName() + "'s product list for an additional $" + product.getPrice());
    }

    public void removeProduct(Product P) {
        boolean hasBeenFound = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(P.getName())) {
                total -= productList.get(i).getPrice();
                productList.remove(i);
                hasBeenFound = true;
                System.out.println("Successfully removed " + P.getName() + " from the order.");
            }
        }
        if (!hasBeenFound) {
            System.out.println("Error removing. There was no " + P.getName() + " located in your order.");
        }
    }

    
    public void printOrder(){
        System.out.print(customer.getName() + "'s Order : ");
        for (Product product : productList) {
            System.out.print(product.getName() + " | ");
        }
        System.out.println("\nPrice before taxes, shipping, and discount : $" + total);
        System.out.printf("Total Price of The Order : $%.2f\n", calculateTotal());
        
    }

    public double calculateTotal() {
        DiscountCalculator discountStrategy;
        if (customer.hasLoyaltyCard()) {
            discountStrategy = price -> price * 0.9;
            System.out.println("Money Saved With Loyalty Card : $" + total*0.1);
        } else {
            discountStrategy = price -> price;
        }

        double priceAfterDiscount = discountStrategy.apply(total);
        
        ShippingCalculator shippingCalculator = price -> price * 0.08;
        double shippingCost = shippingCalculator.apply(priceAfterDiscount);
        System.out.println("Shipping Cost : $" + shippingCost);

        double taxRate = 0.08;
        TaxCalculator taxCalculator = price -> price * (1 + taxRate);
        System.out.println("Tax is : $" + priceAfterDiscount * taxRate);
        double finalPrice = taxCalculator.apply(priceAfterDiscount);

        return finalPrice;
    }       
}
