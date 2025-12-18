package com.gloriane;

// ===================== Exercise 2 =====================
    // Fields
public class Customer {
    private int customerId;
    private String name;
    private String email;

    // Parameterized constructor
    public Customer(int customerId, String name, String email) {
        setCustomerId(customerId);
        setName(name);
        setEmail(email);
    }

    // Getters/Setters
    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setCustomerId(int customerId) {
        // simple validation: id must be positive
        if(customerId > 0) {
            this.customerId = customerId;
        }
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public void setEmail(String email) {
        if(email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{id=" + customerId + ", name='" + name + "', email='" + email + "'}";
    }
    }
