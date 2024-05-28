import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TravelAgentTest {

    TravelAgent travelAgent;
    Customer customer;

    @BeforeEach
    public void setUp(){
        travelAgent = new TravelAgent();
        customer = new Customer("Mario", 10_000);
    }

    @Test
    public void canMakeBooking_Train(){
        Train train = new Train(75, 100);
        travelAgent.makeBooking(train, customer);
    }



}
