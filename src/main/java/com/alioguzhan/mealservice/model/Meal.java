package com.alioguzhan.mealservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;


@Getter
@Setter
@Entity
public class Meal extends BaseEntity {

    @Column
    private String ingredients;

    @Column
    private String recipe;

    @Column
    private int amountOfCalori;

    @Column
    private int amountOfCarbonhydrate;

    @Column
    private int amountOfFat;

    @Column
    private int amountOfProtein;




}
