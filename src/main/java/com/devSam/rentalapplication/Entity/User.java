package com.devSam.rentalapplication.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)

    private Long nationalId;
    private String firstName;
    private String lastName;
    private String email;
}
