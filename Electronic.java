public class Electronic extends Product{
    
    public double voltageRequired;

    public Electronic(){
        super("814281111442","Television",99.99,"A small, older television",
        "Dell");
    }

    public Electronic(String id, String n, double p, String desc, String b, double v){
        super(id,n,p,desc,b);
        this.voltageRequired = v;
    }

    public double getVoltage(){
        return voltageRequired;
    }
}
