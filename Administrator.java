public class Administrator extends User {
    //I'm assuming that an Administrator can change prices and ID's. 

    private String AdminID;

    public Administrator(String n, String id){
        super(n);
        AdminID = id;
    }

    public String getID(){
        return AdminID;
    }

    public void signUp(Customer c){
        c.changeLoyaltyStatus(true); //sets the customer's loyalty card bool to true
        System.out.println("Signed " + c.getName() + " up for a loyalty card.");
    }

    public void unenroll(Customer c){
        c.changeLoyaltyStatus(false); //take them off the card
        System.out.println("Took " + c.getName() + " out of the loyalty system.");
    }

}
