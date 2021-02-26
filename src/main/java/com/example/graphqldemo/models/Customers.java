package com.example.graphqldemo.models;

import javax.persistence.*;

@Entity
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @OneToOne
    @JoinColumn(name = "address_id", nullable = true, updatable = false,referencedColumnName = "id")
    private Address address;

    public Customers() {
    }

    public Customers(Long id) {
        this.id = id;
    }

    public Customers(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Agents [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }

}

