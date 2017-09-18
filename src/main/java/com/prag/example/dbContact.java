package com.prag.example;

public class dbContact {
    private int id;
    private String name;
    private String email;
    private String address;
    private String telephone;

    public dbContact() {
        this.setAddress("New User Address");
        this.setEmail("newuser");
        this.setName("New User");
        this.setTelephone("new telephone");
    }
    public dbContact(String name, String email, String address, String telephone) {
        this.setName(name);
        this.setEmail(email);
        this.setAddress(address);
        this.setTelephone(telephone);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
