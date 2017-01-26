import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Silver on 26.1.2017..
 */
public class AddressUnitTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void setAddress() {
        Address address = new Address();
        address.setEmail("abc@abc.com");
        address.setStreet("Ulica");
        address.setStreetNumber(1);
        address.setZipCode(10000);
        address.setCity("Zagreb");


        if (!address.setAddress().equals("abc@abc.com,Ulica 1,10000 Zagreb")) {
            throw new IllegalStateException("Nije to ta adresa");
        }

    }

    @After
    public void tearDown() throws Exception {

    }

}