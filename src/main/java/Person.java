import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kduvnjak on 19.01.2017.
 */
public class Person implements Serializable {

    private int id;
    private String firstName;
    private String lastName;
    private PhoneNumber phoneNumber;
    private Address address;
    private String note;
    private List phoneList;


    public Person() {

    }

    public Person(int id, String firstName, String lastName, List phonelist, Address address, String note) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneList = phonelist;
        this.address = address;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }

    public String getNote() {
        return note;
    }

    public void setNote(final String note) {
        this.note = note;
    }

    public List getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(final List phoneList) {
        this.phoneList = phoneList;
    }

    public String getFullName() {
        return this.firstName + this.lastName;
    }

    public String getFullPerson() {
        return this.id + this.firstName + this.lastName + this.address.getAddress() + this.note + this.phoneList;
    }

}