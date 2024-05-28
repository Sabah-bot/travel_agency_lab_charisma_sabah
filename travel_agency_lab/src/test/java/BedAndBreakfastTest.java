import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BedAndBreakfastTest {

    BedAndBreakfast bedAndBreakfast;
    Customer customer;

    @BeforeEach
    public void setUp(){
        bedAndBreakfast = new BedAndBreakfast(150);
        customer = new Customer("Mario", 10_000);
    }

    @Test
    public void canBook(){
        bedAndBreakfast.book(customer);
        assertThat(bedAndBreakfast.hasCapacity()).isEqualTo(false);
    }

    @Test
    public void canCancel(){
        bedAndBreakfast.cancel((customer));
        assertThat(bedAndBreakfast.hasCapacity()).isEqualTo(true);
    }

    @Test
    public void canGetPrice(){
        assertThat(bedAndBreakfast.price()).isEqualTo(150);
    }

    @Test
    public void hasNoCapacity(){
        bedAndBreakfast.book(customer);
        assertThat(bedAndBreakfast.hasCapacity()).isEqualTo(false);
    }

    @Test
    public void hasCapacity(){
        assertThat(bedAndBreakfast.hasCapacity()).isEqualTo(true);
    }


}
