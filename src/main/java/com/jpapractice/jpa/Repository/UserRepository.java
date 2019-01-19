package com.jpapractice.jpa.Repository;

import com.jpapractice.jpa.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
