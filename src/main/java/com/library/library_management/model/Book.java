package com.library.library_management.model;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",length = 50,nullable = false)
    private Long id;
    @Column(nullable = false)
    private String bookName;
    @OneToOne(mappedBy = "book",orphanRemoval = true,cascade = CascadeType.ALL)
    private BookProfile bookProfile;
    @ManyToOne
    @JoinColumn(
            name = "user_id",
            foreignKey = @ForeignKey(name = "user_book_fk")
    )
    private User user;


}
