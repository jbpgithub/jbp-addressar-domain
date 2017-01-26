import java.io.Serializable;

/**
 * Created by Silver on 22.1.2017..
 */
public class PhoneNumber implements Serializable {

    private TypeOfPhoneNumber typeOfPhoneNumber;
    private String phoneNumber;

    public PhoneNumber() {
    }

    public PhoneNumber(TypeOfPhoneNumber typeOfPhoneNumber, String phoneNumber) {
        this.typeOfPhoneNumber = typeOfPhoneNumber;
        this.phoneNumber = phoneNumber;
    }

    public TypeOfPhoneNumber getTypeOfPhoneNumber() {
        return typeOfPhoneNumber;
    }

    public void setTypeOfPhoneNumber(TypeOfPhoneNumber typeOfPhoneNumber) {
        this.typeOfPhoneNumber = typeOfPhoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String makePhoneNumber (){
        return this.typeOfPhoneNumber + ": " + this.phoneNumber;
    }
}
