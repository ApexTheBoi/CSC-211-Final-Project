public class User { //Subclasses: Administrator | Customer
    String name;

    public User(){
        name = "N/A";
    }

    public User(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
}
