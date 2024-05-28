import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TrainTest {

    Train train;
    Customer customer;

    @BeforeEach
    public void setup(){
        train = new Train(50, 100);
        customer = new Customer("Mario", 10_000);
    }

    @Test
    public void canBook(){
        train.book(customer);
        assertThat(train.countCustomers()).isEqualTo(1);
    }

    @Test
    public void canCancel(){
        train.cancel(customer);
        assertThat(train.countCustomers()).isEqualTo(0);
    }

    @Test
    public void canGetPrice(){
        assertThat(train.price()).isEqualTo(50);
    }

    @Test
    public void checkHasCapacity(){
        assertThat(train.hasCapacity()).isEqualTo(true);
    }

//    @Test
//    public void checkCustomerCount(){
//    }

}
