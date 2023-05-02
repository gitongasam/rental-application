package com.devSam.rentalapplication.Repository;

import com.devSam.rentalapplication.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
