import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

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
        travelAgent.makeBooking(train,customer);
        assertThat(train.countCustomers()).isEqualTo(1);
    }

    @Test
    public void canNotMakeBooking_Train(){
        Train train = new Train(20_000, 100);
        travelAgent.makeBooking(train,customer);
        assertThat(train.countCustomers()).isEqualTo(0);
    }

   @Test
   public void canMakeBooking_BedAndBreakfast(){
        BedAndBreakfast bedAndBreakfast = new BedAndBreakfast(75);
        travelAgent.makeBooking(bedAndBreakfast,customer);
        assertThat(bedAndBreakfast.hasCapacity()).isEqualTo(false);
   }

   @Test
   public void canNotMakeBooking_BedAndBreakfast(){
        BedAndBreakfast bedAndBreakfast = new BedAndBreakfast(11_000);
        travelAgent.makeBooking(bedAndBreakfast,customer);
        assertThat(bedAndBreakfast.hasCapacity()).isEqualTo(true);
   }

   @Test
   public void canCancelBooking_Train(){
        Train train = new Train(20_000,100);
        travelAgent.cancelBooking(train,customer);
        assertThat(train.countCustomers()).isEqualTo(0);
   }

    @Test
    public void canCancelBooking_BedAndBreakfast(){
        BedAndBreakfast bedAndBreakfast = new BedAndBreakfast(11_000);
        travelAgent.cancelBooking(bedAndBreakfast,customer);
        assertThat(bedAndBreakfast.hasCapacity()).isEqualTo(true);

    }

    @Test
    public void canBookActivity_Axe(){
        Activity axeThrowing = new AxeThrowing(15.99, 4);
        travelAgent.makeBooking(axeThrowing, customer);
        assertThat(axeThrowing.hasCapacity()).isEqualTo(false);
    }

    @Test
    public void canCancelActivity_Axe(){
        Activity axeThrowing = new AxeThrowing(15.99,4);
        travelAgent.cancelBooking(axeThrowing, customer);
        assertThat(axeThrowing.hasCapacity()).isEqualTo(true);
    }

    @Test
    public void canBookActivity_Gaming(){
        Activity gamingCafe = new GamingCafe(13.50, 2);
        travelAgent.makeBooking(gamingCafe, customer);
        assertThat(gamingCafe.hasCapacity()).isEqualTo(false);
    }

    @Test
    public void canCancelActivity_Gaming(){
        Activity gamingCafe = new GamingCafe(13.50, 2);
        travelAgent.cancelBooking(gamingCafe, customer);
        assertThat(gamingCafe.hasCapacity()).isEqualTo(true);
    }

    @Test
    public void giveRefund(){
        Customer customer = new Customer("Charisma", 50);
        Activity gamingCafe = new GamingCafe(13.50, 2);
        travelAgent.cancelBooking(gamingCafe, customer);
        assertThat(customer.getWallet()).isEqualTo(63.50);
    }




}
