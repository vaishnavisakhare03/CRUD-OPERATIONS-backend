package com.codewithvaish.fullstackbackend.repository;

import com.codewithvaish.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
