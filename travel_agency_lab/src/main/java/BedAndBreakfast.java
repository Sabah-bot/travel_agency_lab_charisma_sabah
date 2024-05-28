public class BedAndBreakfast implements Bookable{

    private double price;
    private Customer customer;

    public BedAndBreakfast(double price){
        this.price = price;
        this.customer = null;
    }

    public void book(Customer customer){
        if( customer.canAfford(price)){
            this.customer = customer;
        }
    }

    public void cancel(Customer customer){
        this.customer = null;
    }

    public double price(){
        return price;
    }

    public boolean hasCapacity(){
        if(this.customer == null){
            return true;
        }
        else{
            return false;
        }
    }

}

