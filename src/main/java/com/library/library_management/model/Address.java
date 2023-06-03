package com.library.library_management.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    @JoinColumn(
            name = "address_id",
            foreignKey = @ForeignKey(name="address_user_fk")
    )
    private User user;
}
