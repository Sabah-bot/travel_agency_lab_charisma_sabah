import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BedAndBreakfastTest {

    BedAndBreakfast bedAndBreakfast;
    Customer customer;


    @BeforeEach
    public void setUp() {
        bedAndBreakfast = new BedAndBreakfast();
        customer = new Customer();

    }

}