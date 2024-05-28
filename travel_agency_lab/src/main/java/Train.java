import java.util.ArrayList;

public class Train implements Bookable {

    private double price;
    private double capacity;
    private ArrayList <Customer> customers;

    public Train(double price, double capacity){
        this.price = price;
        this.capacity = capacity;
        this.customers = new ArrayList<>();
    }

    public void book(Customer customer){
        if (customer.canAfford(price) && hasCapacity()){
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
        if ( customers.size() < capacity){
            return true;
        }
        else{
            return false;
        }
    }

    public int countCustomers(){
        return customers.size();
    }






}
