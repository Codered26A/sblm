package org.sblm.lib.dto;

public class Faculty extends User {
    private String techDomain;
    private String role;

    public Faculty() {
        super();
    }


    public Faculty(String name, String email, String techDomain, String role) {
        super(name, email);
        this.techDomain = techDomain;
        this.role = role;
    }

    public String getTechDomain() {
        return techDomain;
    }

    public void setTechDomain(String techDomain) {
        this.techDomain = techDomain;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
