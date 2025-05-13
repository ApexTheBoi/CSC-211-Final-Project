import java.util.Scanner;
public class Main { //Concept: A simple prototype for an e-commerce platform focusing on product listings, shopping carts, and orders.
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        //List of Products (Debugging purposes only)
        //------------------------------------------
        Product P1 = new Product("82405973890","Lighter Fluid",8.49,"8.5 ounces of Lighter Fluid.");
        Product P2 = new Product("7357138897", "Bananas", 1.45, "Yellow fruit.");
        Product P3 = new Product("8392013745", "Oranges", 3.25, "Juicy citrus fruit.");
        Product P4 = new Grocery("2938475610", "Milk", 4.10, "1 gallon of whole milk.","Nature's Promise","Dairy");
        Product P5 = new Product("5647382910", "Bread", 2.50, "Freshly baked bread loaf.");
        Product P6 = new Product("1029384756", "Eggs", 3.99, "Dozen large eggs.");
        Product P7 = new Product("6758493021", "Cheese", 5.75, "Sharp cheddar block.");
        //------------------------------------------
        //Customer objects (Purely for debugging)
        //------------------------------------------
        Customer C1 = new Customer("Sally");
        Customer C2 = new Customer("Anton");
        Customer C3 = new Customer("Michelle");
        Customer C4 = new Customer("Bruce");
        Customer C5 = new Customer("Mike");
        Customer C6 = new Customer("Lauren");
        Customer C7 = new Customer("Derek");
        //------------------------------------------
        Order O1 = new Order(C4); //new order for customer xyz
        O1.addProduct(P1);
        O1.addProduct(P2);
        O1.addProduct(P3);
        O1.addProduct(P4);
        O1.addProduct(P5);
        O1.addProduct(P6);    
        O1.addProduct(P7);
        O1.printOrder();
    }
}
