import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Silver on 22.1.2017..
 */
public class UserTest {
    @Before
    public void setUp() throws Exception {

    }


    @Test
    public void testUser() {
        User user = new User();
        user.setFirstName("Ivan");
        user.setLastName("Ivić");
        user.setUsername();
        user.setPassword("123");
        user.set
        if (!user.getPassword().equals("123")) {
            throw new IllegalStateException("kriva lozinka");
        }
        if (!user.getUsername().equals("IvanIvić")) {
            throw new IllegalStateException("krivi korisnik");
        }
    }


    @After
    public void tearDown() throws Exception {

    }

}