public class Clothing extends Product {
    
    private final String size;

    public Clothing(){
        super("0","N/A",0.0,"Not available.","N/A");
        size = "N/A";
    }

    public Clothing(String id, String n, double d, String desc, String brand, String size){
        super(id,n,d,desc, brand);
        this.size = size;
    }

    public String getSize(){
        return size;
    }
    
}
