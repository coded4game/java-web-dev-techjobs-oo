package org.launchcode.techjobs_oo;

import java.util.Objects;

public class CoreCompetency {

    // List of field(s) / Instance variable(s)
    // Primitive data type(s)
    private int id;
    private static int nextId = 1;

    // Object data type(s)
    private String value;

    // Constructor(s)
    public CoreCompetency() {
        this.id = nextId;
        nextId++;
    }

    public CoreCompetency(String value) {
        this(); // <- Calls the empty constructor above
        this.value = value;
    }

    // Methods
    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency coreCompetency = (CoreCompetency) o;
        return getId() == coreCompetency.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.


    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
