package org.sblm.lib.dto;

public class Admin extends User{

    private String role;

    public Admin() {
    }

    public Admin(String name, String email, String role) {
        super(name, email);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
