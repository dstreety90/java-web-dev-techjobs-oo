package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;
    public JobField(String value) {
        this.value = value;
        id = nextId;
        nextId++;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }
    public int getId() {
        return id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public void setId(int id) {
        this.id = id;
    }
}
