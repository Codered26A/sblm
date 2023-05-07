package org.sblm.lib.dto;

/**
 * @author Naren
 * @date 5/6/2023 // mm/dd/yyyy
 */

public class Author {
    private String firstName;
    private String lastName;
    private String countryOrigin;

    public Author() {
    }

    public Author(String firstName, String lastName, String countryOrigin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.countryOrigin = countryOrigin;
    }

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

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }
}
