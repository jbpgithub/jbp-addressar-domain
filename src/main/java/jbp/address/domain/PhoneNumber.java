package jbp.address.domain;

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

    public String getFullPhoneNumber (){
        return this.typeOfPhoneNumber + ": " + this.phoneNumber;
    }

    public String makeTelephoneNumber (){
        return this.typeOfPhoneNumber.TELEPHONE_NUMBER + ": " + this.phoneNumber;
    }

    public String makeFaxNumber (){
        return this.typeOfPhoneNumber.FAX_NUMBER + ": " + this.phoneNumber;
    }

    public String makeMobileNumber (){
        return this.typeOfPhoneNumber.MOBILE_NUMBER + ": " + this.phoneNumber;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(typeOfPhoneNumber).append(phoneNumber);
        return stringBuilder.toString();
    }
}