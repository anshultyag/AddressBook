package com.company;

public class Person {
    private String firstName;
    private String lname;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private long mobileNumber;
    private String emailId;

    Person(String firstName, String lname, String address, String city, String state, int zipCode, long mobileNumber, String emailId) {
        this.firstName = firstName;
        this.lname = lname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
    }

    public Person() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(long mobileNumber) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    @Override
    public String toString() {
        return firstName + " " + lname + " " + address + " " + city + " " + state + " " + zipCode + " " + mobileNumber + "  " + emailId;
    }
}