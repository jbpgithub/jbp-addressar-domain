import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kduvnjak on 19.01.2017.
 */
public class PersonUnitTest {

    @Before
    public void setUp() throws Exception {

    }


    @Test
    public void testFullName() {
        Person pero = new Person();
        pero.setFirstName("Pero");
        pero.setLastName("Perić");
        if (!pero.getFullName().equals("PeroPerić")) {
            throw new IllegalStateException("To nije taj pero");
        }
    }

    @After
    public void tearDown() throws Exception {

    }

}