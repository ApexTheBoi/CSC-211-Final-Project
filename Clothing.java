public class Clothing extends Product {
    private final String brand;
    public Clothing(){
        super("0","N/A",0.0,"Not available.");
        brand = "N/A";
    }

    public Clothing(String id, String n, double d, String desc, String brand){
        super(id,n,d,desc);
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }
    
}
