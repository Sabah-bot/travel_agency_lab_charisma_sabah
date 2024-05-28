# Lab - Travel Agency

In this lab we will model a travel agency which is booking travel and accommodation for holidaymakers. We don't want the class representing the agency to become bloated with lots of duplicated code though, and we want to ensure it is open for extension if we branch out into other services. By using an interface we will design and build an application which can handle bookings and cancellations for a range of products

## MVP

- Draw a class diagram describing the classes below
- Create a `Customer` class with `name` and `wallet` properties. They will also need methods to pay for something and to check if they can afford something.
- Define a `Bookable` interface which promises the following methods:
	- `void book(Customer customer);`
	- `void cancel(Customer customer);`
	- `int getPrice();`
	- `boolean hasCapacity();`
- Create a `TravelAgent` class with `makeBooking` and `cancelBooking` methods. Each method should take a `Bookable` object and a `Customer` object as parameters.
- Create a `Train` class which implements `Bookable`. The class should have properties representing `price`, `capacity` and a collection of `Customer` objects.
- Create a `BedAndBreakfast` class which implements `Bookable`. It should have properties representing the `price` and a single `Customer` who has made a booking.
- It should not be possible to make a booking if either the customer can't afford it or there isn't any capacity for them.
- Write tests for all methods. You may need to create additional methods beyond those specified above to facilitate this.

All the functionality within the MVP should be checked with unit tests. In a scenario where an action should fail, eg. trying to book a customer on to a train which is already full, it is sufficient to test that nothing changes. **It is not necessary to print anything to the terminal in this exercise**.



## Extensions

- Add an abstract `Activity` class which implements `Bookable`. Create at least two classes which extend `Activity` and write tests to ensure they can be booked through a `TravelAgent`
- Refactor the `Train` class to include a `travelClass` property which uses an enum. Use this enum to determine the price of booking the train, ie. a different price for first-class travel to economy-class travel
- At the moment our application fails silently when something fails, eg. a customer can't afford the booking. Refactor the application to throw exceptions when this happens and refactor the tests to ensure they are being thrown correctly.