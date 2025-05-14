public class Customer extends User {
    
    private boolean hasLoyaltyCard;

    public Customer(String name){
        super(name);
        hasLoyaltyCard = false;
    }

    public Customer(String name, boolean b){
        super(name);
        hasLoyaltyCard = b;
    }

    public boolean hasLoyaltyCard(){
        return hasLoyaltyCard;
    }

    public void changeLoyaltyStatus(boolean b){
        hasLoyaltyCard = b;
    }

    

}
