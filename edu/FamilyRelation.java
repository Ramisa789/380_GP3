package edu.ucalgary.oop;

public class FamilyRelation {
    private DisasterVictim personOne;
    private String relationshipTo;
    private DisasterVictim personTwo;

    public FamilyRelation(DisasterVictim personOne, String relationshipTo, DisasterVictim personTwo) {
        if (personOne == null || personTwo == null || relationshipTo == null || relationshipTo.isEmpty()) {
            throw new IllegalArgumentException("Arguments cannot be null or empty");
        }
        this.personOne = personOne;
        this.relationshipTo = relationshipTo;
        this.personTwo = personTwo;
    }

    // Getters and setters
    public DisasterVictim getPersonOne() {
        return personOne;
    }

    public void setPersonOne(DisasterVictim personOne) {
        if (personOne == null) {
            throw new IllegalArgumentException("Person cannot be null");
        }
        this.personOne = personOne;
    }

    public String getRelationshipTo() {
        return relationshipTo;
    }

    public void setRelationshipTo(String relationshipTo) {
        if (relationshipTo == null || relationshipTo.isEmpty()) {
            throw new IllegalArgumentException("Relationship cannot be null or empty");
        }
        this.relationshipTo = relationshipTo;
    }

    public DisasterVictim getPersonTwo() {
        return personTwo;
    }

    public void setPersonTwo(DisasterVictim personTwo) {
         if (personTwo == null) {
            throw new IllegalArgumentException("Person cannot be null");
        }
        this.personTwo = personTwo;
    }
}
