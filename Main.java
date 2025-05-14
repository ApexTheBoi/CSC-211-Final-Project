import java.util.Scanner;
public class Main { //Concept: A simple prototype for an e-commerce platform focusing on product listings, shopping carts, and orders.
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        //List of Products (Debugging purposes only)
        //------------------------------------------
        Product P1 = new Product("82405973890","Lighter Fluid",8.49,"8.5 ounces of Lighter Fluid.","Brick Hollow");
        Product P2 = new Product("7357138897", "Bananas", 1.45, "Yellow fruit.","Nature's Promise");
        Product P3 = new Product("8392013745", "Oranges", 3.25, "Juicy citrus fruit.","Driscoll's");
        Product P4 = new Grocery("2938475610", "Milk", 4.10, "1 gallon of whole milk.","Nature's Promise","Dairy");
        Product P5 = new Product("5647382910", "Bread", 2.50, "Freshly baked bread loaf.","Stop and Shop");
        Product P6 = new Electronic("1029384756", "Laptop", 599.99, "Dozen large eggs.","Microsoft",40.0);
        Product P7 = new Clothing("6758493021", "Skirt", 15.99, "A rainbow skirt.","Republic","Medium");
        //------------------------------------------
        //Customer objects (Purely for debugging)
        //------------------------------------------
        Customer C1 = new Customer("Sally");
        Customer C2 = new Customer("Anton");
        Customer C3 = new Customer("Michelle");
        Customer C4 = new Customer("Jynne",true);
        Customer C5 = new Customer("Mike");
        Customer C6 = new Customer("Lauren");
        Customer C7 = new Customer("Derek");
        //------------------------------------------
        Order O1 = new Order(C4); //new order for customer xyz
        C4.hasLoyaltyCard();
        O1.addProduct(P1);
        O1.addProduct(P2);
        O1.addProduct(P3);
        O1.addProduct(P4);
        O1.addProduct(P5);
        O1.addProduct(P6);    
        O1.addProduct(P7);
        O1.printOrder();

        Administrator A1 = new Administrator();
        A1.signUp(C1);
        A1.signUp(C6);
        A1.unenroll(C4);
        O1.printOrder();
    }
}
