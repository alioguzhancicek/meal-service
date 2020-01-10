package com.alioguzhan.mealservice.repository;

import com.alioguzhan.mealservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
