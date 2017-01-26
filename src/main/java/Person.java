import java.io.Serializable;
import java.util.List;

/**
 * Created by kduvnjak on 19.01.2017.
 */
public class Person implements Serializable {

    private int id;
    private String firstName;
    private String lastName;
    private List contactNumbers;
    private Address address;
    //private String dateOfBirth;
    private String note;



    public Person() {

    }

    public Person(final int id, final String firstName, final String lastName, final String note, final Address address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.note = note;
        this.address = address;
    }

/*
    public Person(final String firstName, final String lastName, final int id, final String note) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        //this.dateOfBirth = dateOfBirth;
        this.note = note;
    }
*/



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

    public String getFullName() {
        return this.firstName + this.lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(final String note) {
        this.note = note;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }

    /*public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }*/
}