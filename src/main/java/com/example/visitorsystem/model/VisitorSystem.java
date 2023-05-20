package com.example.visitorsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VisitorSystem {

    @Id
    long id;

    String firstName;

    String lastName;

    String email;

    int phoneNumber;

    long postalCode;

}
