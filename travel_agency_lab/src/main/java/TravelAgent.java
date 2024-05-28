public class TravelAgent {
    Bookable bookable;
    Customer customer;

    public void makeBooking(Bookable booking, Customer customer){
        if (customer.canAfford(bookable.price()) && bookable.hasCapacity()){
            bookable.book(customer);
            customer.pay(bookable.price());
        }
        else {
            System.out.println("Cannot make booking.");
        }

    }

    public void cancelBooking(Bookable bookable, Customer customer){
        bookable.cancel(customer);
    }



}
