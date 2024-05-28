public class TravelAgent {

    public TravelAgent(){

    }
    //needs a constructor to create an object

    public void makeBooking(Bookable bookable, Customer customer){
        if (customer.canAfford(bookable.price()) && bookable.hasCapacity()){
            bookable.book(customer);
            customer.pay(bookable.price());
            System.out.println("Customer booking has been made.");
        }
        else {
            System.out.println("Cannot make booking.");
        }

    }

    public void cancelBooking(Bookable bookable, Customer customer){
        bookable.cancel(customer);
    }



}
