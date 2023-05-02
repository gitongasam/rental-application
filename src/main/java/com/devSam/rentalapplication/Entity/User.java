package com.devSam.rentalapplication.Entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    private Long nationalId;
    private String firstName;
    private String lastName;
    private String email;
}
