public abstract class Activity implements Bookable {

    private double price;
    private int capacity;
    private Customer customer;

    public Activity(double price, int capacity){
        this.price = price;
        this.capacity = capacity;
        this.customer = null;
    }

    public void book(Customer customer){
        if(customer.canAfford(price) && hasCapacity()){
            this.customer = customer;
            customer.pay(price);
        }
    }

    public void cancel(Customer customer){
        this.customer = null;
        customer.pay(-price); //refund
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
