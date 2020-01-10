package com.alioguzhan.mealservice.controller;

import com.alioguzhan.mealservice.model.Meal;
import com.alioguzhan.mealservice.service.MealService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/meals")
public class MealController {

    @Autowired
    private final MealService mealService;

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Meal>> getAll() {
        return new ResponseEntity<>(this.mealService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    @ResponseBody
    public ResponseEntity<Meal> save(@RequestBody Meal meal) {
        return new ResponseEntity<>(this.mealService.save(meal), HttpStatus.CREATED);
    }
}
