package com.rms.model.repository;

import com.rms.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean findByNameAndPassword(String name, String password);
}
