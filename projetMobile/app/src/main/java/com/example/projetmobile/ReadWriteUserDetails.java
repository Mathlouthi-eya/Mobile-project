package com.example.projetmobile;

public class ReadWriteUserDetails {
    private String fullName;
    private String gender;
    private String userRole;
    private String additionalField; // Replace with the correct name for the fourth field

    // Default constructor
    public ReadWriteUserDetails() {
    }

    // Parameterized constructor with four arguments
    public ReadWriteUserDetails(String fullName, String gender, String userRole, String additionalField) {
        this.fullName = fullName;
        this.gender = gender;
        this.userRole = userRole;
        this.additionalField = additionalField;
    }

    // Getters and setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getAdditionalField() {
        return additionalField;
    }

    public void setAdditionalField(String additionalField) {
        this.additionalField = additionalField;
    }
}
