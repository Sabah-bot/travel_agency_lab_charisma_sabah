import java.util.ArrayList;

public class BedAndBreakfast implements Bookable{

    private double price;
    private ArrayList<Customer> customers;

    public BedAndBreakfast(){
        this.price = price;
        this.customers = new ArrayList<>();
    }

    public void book(Customer customer){
        if( customer.canAfford(price)){
            customers.add(customer);
        }
    }

    public void cancel(Customer customer){
        customers.remove(customer);
    }

    public double price(){
        return price;
    }

    public boolean hasCapacity(){
        return customers == null;
    }

    public int countCustomers(){
        return customers.size();
    }

}

