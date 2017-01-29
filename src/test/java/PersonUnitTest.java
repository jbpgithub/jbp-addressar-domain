import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kduvnjak on 19.01.2017.
 */
public class PersonUnitTest {

    @Before
    public void setUp() throws Exception {

    }


   /* @Test
    public void testFullName() {
        Person pero = new Person();
        pero.setFirstName("Pero");
        pero.setLastName("Perić");
        if (!pero.getFullName().equals("PeroPerić")) {
            throw new IllegalStateException("To nije taj pero");
        }
    }*/

    @Test
    public void testPerson() {
        Person person = new Person();
        person.setId(123456789);
        person.setLastName("Markić");
        person.setFirstName("Marko");

        PhoneNumber telephoneNumber = new PhoneNumber();
        person.setPhoneNumber(telephoneNumber);
        person.getPhoneNumber().setTypeOfPhoneNumber(TypeOfPhoneNumber.TELEPHONE_NUMBER);
        person.getPhoneNumber().setPhoneNumber("01 123 123");
        PhoneNumber mobileNumber = new PhoneNumber(TypeOfPhoneNumber.MOBILE_NUMBER, "098 123 123");
        PhoneNumber faxNumber = new PhoneNumber(TypeOfPhoneNumber.FAX_NUMBER, "01 321 321");
        List phoneList = new ArrayList();
        person.setPhoneList(phoneList);
        person.getPhoneList().add(telephoneNumber);
        person.getPhoneList().add(mobileNumber);
        person.getPhoneList().add(faxNumber);
        State state = new State("Hrvatska", "HR");
        Address address = new Address("mail@mail.com", "Ulica", "2a", "Zagreb", 10000, state);
        person.setAddress(address);
        person.setNote("opasni");
        person.setPhoneNumber(mobileNumber);
        if (!person.getPhoneNumber().getFullPhoneNumber().equals("MOBILE_NUMBER: 098 123 123")) {
            throw new IllegalStateException("To nije taj broj mobitela od Marka");
        }
        person.setPhoneNumber(telephoneNumber);
        if (!person.getPhoneNumber().getFullPhoneNumber().equals("TELEPHONE_NUMBER: 01 123 123")) {
            throw new IllegalStateException("To nije taj broj telefona od Marka");
        }
        person.setPhoneNumber(faxNumber);
        if (!person.getPhoneNumber().getFullPhoneNumber().equals("FAX_NUMBER: 01 321 321")) {
            throw new IllegalStateException("To nije taj broj faksa od Marka");
        }

        if (person.getPhoneList().size() == 3) {
        } else {
            throw new IllegalStateException("To nije lista brojeva telefona od Marka");
        }
        if (!person.getFullPerson().equals("123456789MarkoMarkićmail@mail.comUlica2a10000ZagrebHR Hrvatskaopasni[TELEPHONE_NUMBER01 123 123, MOBILE_NUMBER098 123 123, FAX_NUMBER01 321 321]")) {
            throw new IllegalStateException("To nije Marko Markić");
        }


    }

    @After
    public void tearDown() throws Exception {

    }

}