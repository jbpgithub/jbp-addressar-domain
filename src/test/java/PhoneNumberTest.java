import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Silver on 26.1.2017..
 */
public class PhoneNumberTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void makePhoneNumber()  {
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setTypeOfPhoneNumber(TypeOfPhoneNumber.PHONE_NUMBER);
        phoneNumber.setPhoneNumber("01");
        if (!phoneNumber.makePhoneNumber().equals("PHONE_NUMBER: 01")) {
            throw new IllegalStateException("Broj nije kreiran");
        }
    }

    @After
    public void tearDown() throws Exception {

    }

}