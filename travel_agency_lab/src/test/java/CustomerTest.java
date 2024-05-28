import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Customer customer;


    //customer

    @BeforeEach
    public void setUp(){
        customer = new Customer("Mario", 10_000);
    }


    @Test
    public void setName(){
        customer = new Customer("Emma", 100);
        assertThat(customer.getName()).isEqualTo("Emma");
    }


    @Test
    public void getName(){
        assertThat(customer.getName()).isEqualTo("Mario");
    }


    @Test
    public void setWallet(){
        customer = new Customer("John", 1000);
        assertThat(customer.getWallet()).isEqualTo(1000);

    }

    @Test
    public void getWallet(){
       assertThat(customer.getWallet()).isEqualTo(10_000);
    }


    //pay Test

    @Test
    public void canPay(){
        assertThat(customer.pay(500)).isEqualTo(9500);
    }

    @Test
    public void canAfford(){
        assertThat(customer.canAfford(500)).isEqualTo(true);
    }

}
