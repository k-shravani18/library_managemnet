package com.library.library_management.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BookProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "book_profile_id",nullable = false)
    private Long profileId;
    @Column(nullable = false)
    private String authorName;
    @Column(nullable = false)
    private String edition;
    @Column(nullable = false)
    private String genre;
    @Column(nullable = false)
    private Long pages;
    @Column(nullable = false)
    private Double price;
    @OneToOne
    @JoinColumn(name = "book_profile_id",foreignKey = @ForeignKey(name = "book_bprofie_fk"))
    private Book book;
}
