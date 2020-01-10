package com.alioguzhan.mealservice.service;

import com.alioguzhan.mealservice.model.Meal;
import com.alioguzhan.mealservice.repository.MealRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Transactional(readOnly = true)
@Service
public class MealService {

    @Autowired
    private final MealRepository mealRepository;

    public List<Meal> getAll() {
        return mealRepository.findAll();
    }

    @Transactional
    public Meal save(Meal meal) {
        return mealRepository.save(meal);
    }
}
