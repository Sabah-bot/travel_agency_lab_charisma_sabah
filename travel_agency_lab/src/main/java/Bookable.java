public interface Bookable {

    public void book(Customer customer);
    public void cancel(Customer customer);
    boolean hasCapacity();
    double price();
}

//think we dont need public