import java.util.ArrayList;
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
        System.out.printf("\nTotal Price of The Order : $%.2f\n", total);
    }
    
}
