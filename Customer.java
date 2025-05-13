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

    public void checkLoyaltyStatus(){
        if(hasLoyaltyCard){
            System.out.println("Has a loyalty card.");
        }

        else{
            System.out.println("Does not have a loyalty card.");
        }
    }

}
