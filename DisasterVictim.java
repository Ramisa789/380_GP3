package edu.ucalgary.oop;

import java.util.ArrayList;
import java.util.List;

public class DisasterVictim {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String comments;
    private int ASSIGNED_SOCIAL_ID;
    private List<MedicalRecord> medicalRecords;
    private List<FamilyRelation> familyConnections;
    private String ENTRY_DATE;
    private List<Supply> personalBelongings;
    private String gender;
    private int counter = 0;

    public DisasterVictim(String firstName, String ENTRY_DATE) {
        this.firstName = firstName;
        this.ENTRY_DATE = ENTRY_DATE;
        medicalRecords = new ArrayList<>();
        familyConnections = new ArrayList<>();
        personalBelongings = new ArrayList<>();
        counter++;
        ASSIGNED_SOCIAL_ID = counter;
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        if (!dateOfBirth.matches("\\d{4}-\\d{2}-\\d{2}")) {
            throw new IllegalArgumentException("Invalid date format. Please use YYYY-MM-DD.");
        }
        this.dateOfBirth = dateOfBirth;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getASSIGNED_SOCIAL_ID() {
        return ASSIGNED_SOCIAL_ID;
    }

    public void setASSIGNED_SOCIAL_ID(int ASSIGNED_SOCIAL_ID) {
        this.ASSIGNED_SOCIAL_ID = ASSIGNED_SOCIAL_ID;
    }

    public List<MedicalRecord> getMedicalRecords() {
        return medicalRecords;
    }

    public void setMedicalRecords(List<MedicalRecord> medicalRecords) {
        this.medicalRecords = medicalRecords;
    }

    public List<FamilyRelation> getFamilyConnections() {
        return familyConnections;
    }

    public void setFamilyConnections(List<FamilyRelation> familyConnections) {
        this.familyConnections = familyConnections;
    }

    public String getENTRY_DATE() {
        return ENTRY_DATE;
    }

    public void setENTRY_DATE(String ENTRY_DATE) {
        this.ENTRY_DATE = ENTRY_DATE;
    }

    public List<Supply> getPersonalBelongings() {
        return personalBelongings;
    }

    public void setPersonalBelongings(List<Supply> personalBelongings) {
        this.personalBelongings = personalBelongings;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    // Additional methods for managing personal belongings
    public void addPersonalBelonging(Supply supply) {
        personalBelongings.add(supply);
    }

    public void removePersonalBelonging(Supply supply) {
        personalBelongings.remove(supply);
    }

    // Additional methods for managing family connections
    public void addFamilyConnection(FamilyRelation familyRelation) {
        familyConnections.add(familyRelation);
    }

    public void removeFamilyConnection(FamilyRelation familyRelation) {
        familyConnections.remove(familyRelation);
    }

    // Additional method for managing medical records
    public void addMedicalRecord(MedicalRecord medicalRecord) {
        medicalRecords.add(medicalRecord);
    }
    public String getEntryDate() {
        return ENTRY_DATE;
    }

    // Method to increment the counter
    public void incrementCounter() {
        counter++;
    }
}
