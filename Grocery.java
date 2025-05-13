public class Grocery extends Product {
    private final String brand;
    private final String department;
    public Grocery(){
        super("0","N/A",0.0,"Not available.");
        brand = "N/A";
        department = "N/A";
    }

    public Grocery(String id, String n, double p, String d, String b, String dep){
        super(id,n,p,d);
        this.brand = b;
        this.department = dep;
    }

    public String getDept(){
        return department;
    }

    public String getBrand(){
        return brand;
    }
}
