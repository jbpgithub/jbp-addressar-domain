package jbp.address.domain;

import jbp.address.domain.PhoneNumber;
import jbp.address.domain.TypeOfPhoneNumber;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Silver on 28.1.2017..
 */
public class PhoneNumberUnitTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testPhoneNumber() {
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setPhoneNumber("098 123 123");
        phoneNumber.setTypeOfPhoneNumber(TypeOfPhoneNumber.MOBILE_NUMBER);
        if (!phoneNumber.getFullPhoneNumber().equals("MOBILE_NUMBER: 098 123 123")) {
            throw new IllegalStateException("To nije broj dobar broj za kontakt");
        }
        phoneNumber.setPhoneNumber("01 123 123");
        if (!phoneNumber.makeTelephoneNumber().equals("TELEPHONE_NUMBER: 01 123 123")) {
            throw new IllegalStateException("To nije broj telefona");
        }
        phoneNumber.setPhoneNumber("01 999 123");
        if (!phoneNumber.makeFaxNumber().equals("FAX_NUMBER: 01 999 123")) {
            throw new IllegalStateException("To nije broj faksa");
        }
        phoneNumber.setPhoneNumber("01 999 123");
        if (!phoneNumber.makeMobileNumber().equals("MOBILE_NUMBER: 01 999 123")) {
            throw new IllegalStateException("To nije broj faksa");
        }
    }

    @After
    public void tearDown() throws Exception {

    }

}