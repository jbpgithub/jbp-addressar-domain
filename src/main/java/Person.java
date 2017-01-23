import java.io.Serializable;

/**
 * Created by kduvnjak on 19.01.2017.
 */
public class Person implements Serializable {

    private int id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String note;



    public Person() {

    }

    public Person(final String firstName, final String lastName, final int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.note = note;
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

    public String getFullName() {
        return this.firstName + this.lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}