package com.alioguzhan.mealservice.repository;

import com.alioguzhan.mealservice.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<Meal, Long> {
}
