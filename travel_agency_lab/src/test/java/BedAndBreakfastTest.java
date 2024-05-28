import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BedAndBreakfastTest {

    BedAndBreakfast bedAndBreakfast;
    Customer customer;

<<<<<<< HEAD
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
    public void hasCapacityAlwaysTrue(){
        assertThat(bedAndBreakfast.hasCapacity()).isEqualTo(true);
    }

}
=======

    @BeforeEach
    public void setUp() {
        bedAndBreakfast = new BedAndBreakfast();
        customer = new Customer();

    }

}
>>>>>>> 4983304a8b3ce222508afd3e6b92ef6979615de0
