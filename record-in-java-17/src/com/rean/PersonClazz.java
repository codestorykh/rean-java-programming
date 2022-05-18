package com.rean;

import java.util.Objects;

public class PersonClazz {

    private String firstName;
    private String lastName;
    private int aga;

    public PersonClazz(String firstName, String lastName, int aga) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.aga = aga;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonClazz)) return false;
        PersonClazz that = (PersonClazz) o;
        return aga == that.aga && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, aga);
    }

    @Override
    public String toString() {
        return "PersonClazz{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", aga=" + aga +
                '}';
    }
}
