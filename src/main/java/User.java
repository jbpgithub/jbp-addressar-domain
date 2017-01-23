import java.io.Serializable;

/**
 * Created by Silver on 22.1.2017..
 */
public class User extends Person implements Serializable {

    private String username;
    private String password;
    private Role role;

/*    User () {
        //super(firstName, lastName);
        this.username = username;
        this.password = password;
    }*/


    //public Boolean role

    public User(Role role) {
        this.role = role;
    }

    public User() {

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername() {
        this.username = super.getFullName();
    }
}
