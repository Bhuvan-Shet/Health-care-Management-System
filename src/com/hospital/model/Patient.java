package com.hospital.model;

public class Patient {
    private String name;
    private int age;
    private String gender;
    private String patientId;
    private String contactNumber;

    public Patient(String name, int age, String gender, String patientId, String contactNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.patientId = patientId;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}