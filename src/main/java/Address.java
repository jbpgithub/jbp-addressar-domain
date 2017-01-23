import java.io.Serializable;

/**
 * Created by Silver on 22.1.2017..
 */
public class Address implements Serializable {

    private String street;
    private int streetNumber;
    private String city;
    private int zipCode;
    private String email;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
