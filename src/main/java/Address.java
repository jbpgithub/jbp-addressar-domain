import java.io.Serializable;

/**
 * Created by Silver on 22.1.2017..
 */
public class Address implements Serializable {

    private String email;
    private String street;
    private int streetNumber;
    private String city;
    private int zipCode;
    private State state;

    public Address() {
    }

    public Address(String email, String street, int streetNumber, String city, int zipCode, State state) {
        this.email = email;
        this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;
        this.zipCode = zipCode;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(final int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(final int zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public State getState() {
        return state;
    }

/*    public void setState(State state) {
        this.state = state;
    }*/


    public String setAddress() {
        return this.email + "," + this.street + " " + this.streetNumber + "," + this.zipCode + " " + this.city;
    }
}
