package com.library.library_management.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id",nullable = false)
    private Long id;
    @Column(nullable = false)
    private String streetName;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String zipcode;
    @Column(nullable = false)
    private String state;
    @ManyToMany
    @JoinTable(
            name = "user_address",
            joinColumns = @JoinColumn(name = "address_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> user;

    public Address(String streetName, String city, String zipcode, String state) {
        this.streetName = streetName;
        this.city = city;
        this.zipcode = zipcode;
        this.state = state;
    }
}