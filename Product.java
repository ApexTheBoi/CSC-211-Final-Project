public class Product { //Subclasses: Electronics | Clothing | Grocery
    private final String ID;
    private final String name;
    private final double price;
    private final String description;
    private final String brand;

    public Product(String id, String name, double price, String description, String brand){
        this.ID = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.brand = brand;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String getBrand(){
        return brand;
    }

    @Override
    public String toString(){
        return "Product ID : " + ID + ".\nProduct Name : " + name + ".\nProduct Price : $" + price + ".\nDescription : " + description;
    }

}
