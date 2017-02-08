package jbp.address.domain;

import jbp.address.domain.Role;
import jbp.address.domain.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Silver on 22.1.2017..
 */
public class UserUnitTest {
    @Before
    public void setUp() throws Exception {

    }


    @Test
    public void testUser() {
        User user = new User();
        user.setFirstName("Ivan");
        user.setLastName("Ivić");
        user.setUsername("ivanivic");
        user.setPassword("123");
        user.setRole(Role.ADMIN);

        if (!user.getPassword().equals("123")) {
            throw new IllegalStateException("kriva lozinka");
        }
        if (!user.getUsername().equals("ivanivic")) {
            throw new IllegalStateException("krivo korisničko ime");
        }
        if (!(user.getRole() == Role.ADMIN || user.getRole() == Role.NORMAL)) {
            throw new IllegalStateException("korisnik nema ulogu");
        }
        if (!user.getFullName().equals("IvanIvić")) {
            throw new IllegalStateException("Pogrešno ime i prezime");
        }
    }


    @After
    public void tearDown() throws Exception {

    }

}