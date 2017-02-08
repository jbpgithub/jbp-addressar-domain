package jbp.address.domain;

import jbp.address.domain.Address;
import jbp.address.domain.State;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Silver on 26.1.2017..
 */
public class AddressUnitTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void setAddress() {
        //jbp.address.domain.State state = new jbp.address.domain.State("Croatia", "HR");
        State state = new State();
        Address address = new Address();
        address.setEmail("abc@abc.com");
        address.setStreet("Ulica");
        address.setStreetNumber("1a");
        address.setZipCode(10000);
        address.setCity("Zagreb");
        address.setState(state);
        address.getState().setName("Croatia");
        address.getState().setShortName("HR");

        if (!address.getAddress().equals("abc@abc.comUlica1a10000ZagrebHR Croatia")) {
            throw new IllegalStateException("Nije to ta adresa");
        }
        if (!address.getFullAddress().equals("Ulica 1a, 10000 Zagreb")) {
            throw new IllegalStateException("Nije adresa za poštu");
        }

    }

    @After
    public void tearDown() throws Exception {

    }

}